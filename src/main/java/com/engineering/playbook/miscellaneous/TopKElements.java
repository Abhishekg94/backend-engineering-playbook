package com.engineering.playbook.miscellaneous;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElements {
    public static void main(String[] args) {
        String[] elements = {"apple", "banana", "cherry", "date", "fig", "grape", "apple", "banana",
                "cherry", "date", "fig", "grape", "grape", "grape"};
        Map<String, Integer> map = new HashMap<>();
        for (String element : elements) {
            map.put(element, map.getOrDefault(element, 0) + 1);

        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() == a.getValue() ?
                        a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()
        );
        pq.addAll(map.entrySet());
        while(!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

/*        Map.Entry<String, Integer>[] entryArray = map.entrySet().toArray(new Map.Entry[0]);
        Arrays.sort(entryArray, (a,b) -> b.getValue() == a.getValue() ?
                a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
        for(Map.Entry<String, Integer> entry : entryArray){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

/*        //descending order by value, ascending order by key if values are equal
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> b.getValue() == a.getValue() ?
                a.getKey().compareTo(b.getKey()) : a.getValue() - b.getValue());
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

    }
}

