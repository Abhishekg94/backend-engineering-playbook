# Low-Level Design (LLD)

This directory contains a curated list of system design questions focused on low-level design (class design, object interactions, data models, and component behavior). The goal is to help engineers practice designing clean, modular, and scalable systems for common interview problems.

How to use
- Pick a problem from the list and treat it like an interview prompt.
- Spend 10–15 minutes clarifying requirements, then outline your approach.
- Design incrementally: interfaces → classes/data models → interactions/sequence flows → error handling and scaling.
- Write diagrams or ASCII sequences when helpful. Document trade-offs and complexity.

Recommended approach
1. Requirements & constraints — clarify functional and non-functional requirements (throughput, latency, storage, consistency, availability). 
2. API & use cases — list public APIs or user-facing operations.
3. Core data model & classes — define DTOs, entities, relationships, interfaces.
4. Components & interactions — explain how objects/components interact, show sequence flow for main operations.
5. Edge cases & failure modes — timeouts, retries, partitioning, data loss
6. Scaling & performance — caching, sharding, load balancing, async processing
7. Trade-offs & alternatives — explain why you chose design A over B
8. Complexity & testing — time/space complexity and how you'd test the system

Tips for interviews
- Start with a simple working design, then iterate to handle additional requirements.
- Verbally summarize each change and its impact on correctness and performance.
- Focus on clear, maintainable interfaces and separation of concerns.

Problems (organized by difficulty)

EASY
1. Design Parking Lot — model slots, vehicle types, and allocation strategy. Consider reservation and payment extensions.
2. Design Stack Overflow — focus on core objects: Question, Answer, Comment, Vote; consider reputation and moderation flows.
3. Design a Vending Machine — finite states (idle, selection, dispensing); handle concurrency and inventory.
4. Design Logging Framework — log levels, sinks, formatters, asynchronous writers, rotation and retention.
5. Design Traffic Signal Control System — state machines for lights, sensor inputs, scheduling, and fault tolerance.
6. Design Coffee Vending Machine — variant of vending machine with recipes, ingredient management, and concurrency.
7. Design a Task Management System — tasks, lists/projects, assignment, notifications, and simple permission model.

MEDIUM
1. Design ATM — card, account, transaction, offline/online modes, security and retry policies.
2. Design LinkedIn — focus on profiles, connections, feed generation (newsfeed), and search basics.
3. Design LRU Cache — data structures (hash + doubly linked list), concurrency, TTL, and persistence.
4. Design Tic Tac Toe Game — board model, win detection, multiplayer session lifecycle.
5. Design Pub/Sub System — topics, producers, consumers, brokers, delivery semantics (at-most-once, at-least-once).
6. Design an Elevator System — scheduling algorithms, building model, concurrent requests.
7. Design Car Rental System — inventory, reservations, pricing, and availability checks.
8. Design an Online Auction System — bidding, countdown, winner selection, concurrency and fraud prevention.
9. Design Hotel Management System — rooms, bookings, availability calendar, cancellations.
10. Design a Digital Wallet Service — accounts, balance, transfers, idempotency, and reconciliation.
11. Design Airline Management System — flights, bookings, seat inventory, cancellations and overbooking.
12. Design a Library Management System — catalog, loans, reservations, fines and search.
13. Design a Social Network like Facebook — users, posts, newsfeed, privacy controls, and notifications.
14. Design Restaurant Management System — menu, orders, kitchen workflow, and table management.
15. Design a Concert Ticket Booking System — seat map, reservations, anti-bot measures, and payments.

HARD
1. Design CricInfo — live scoring system, ingesting events, scoreboard rendering, and real-time updates.
2. Design Splitwise — groups, expenses, settlement algorithms, and debt simplification.
3. Design Chess Game — board, moves engine, rule enforcement, time controls, and move validation.
4. Design a Snake and Ladder game — board, dice, player turns, power-ups and multiplayer.
5. Design Ride-Sharing Service like Uber — matching, surge pricing, routing, and dispatch.
6. Design Course Registration System — enrollment, capacity, waitlists, and conflict detection.
7. Design Movie Ticket Booking System — seat selection, payments, concurrency, and refunds.
8. Design Online Shopping System like Amazon — catalog, cart, checkout, inventory, and search.
9. Design Online Stock Brokerage System — orders, matching engine, market data, and settlement.
10. Design Music Streaming Service like Spotify — catalog, streaming, caching, recommendations.
11. Design Online Food Delivery Service like Swiggy — restaurants, menus, order flow, rider matching, and tracking.
12. Design Rate Limiter — token bucket/leaky bucket, distributed rate limiting, and client throttling.

How to contribute
- Add solutions, diagrams, or reference implementations under this folder.
- Create a new subfolder per problem with README.md describing your approach and code samples.
- Follow repository coding and contribution guidelines in the root README.

License & Author
- Repo: backend-engineering-playbook — maintained by @Abhishekg94

Happy designing! Practice consistently and iterate your designs.