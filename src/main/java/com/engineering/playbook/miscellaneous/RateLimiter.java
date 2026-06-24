package com.engineering.playbook.miscellaneous;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RateLimiter {

    private static final int MAX_REQUESTS = 3;
    private static final long WINDOW_SIZE_MS = 10_000; // 10 seconds

    private final Map<String, Queue<Long>> userRequests = new HashMap<>();

    public synchronized boolean allowRequest(String userId) {
        long currentTime = System.currentTimeMillis();

        Queue<Long> timestamps =
                userRequests.computeIfAbsent(userId, k -> new LinkedList<>());

        // Remove expired requests
        while (!timestamps.isEmpty()
                && currentTime - timestamps.peek() >= WINDOW_SIZE_MS) {
            timestamps.poll();
        }

        // Check rate limit
        if (timestamps.size() >= MAX_REQUESTS) {
            return false;
        }

        timestamps.offer(currentTime);
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = new RateLimiter();

        String user = "user1";

        System.out.println(limiter.allowRequest(user)); // true
        System.out.println(limiter.allowRequest(user)); // true
        System.out.println(limiter.allowRequest(user)); // true
        System.out.println(limiter.allowRequest(user)); // false

        Thread.sleep(10000);

        System.out.println(limiter.allowRequest(user)); // true
    }
}

