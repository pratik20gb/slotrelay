# SlotRelay

A session-booking application that will offer cancelled seats to people
on a waitlist, with a time limit to accept each offer.

Built incrementally, starting with plain Java and progressing toward
a full-stack application.

## Current progress

The first version models a bookable session in plain Java.

Implemented:
- Session ID, title, and capacity
- Validation that rejects non-positive capacity
- Booked and available seat counts
- Full-capacity check
- A small entry point demonstrating the session model

Booking, cancellation, and waitlist operations are not implemented yet.

## Planned booking flow

1. An organiser creates a session with limited seats.
2. Users book available seats or join the waitlist.
3. A cancellation creates an offer for the first waiting user.
4. The user accepts before the offer expires.
5. An expired offer passes to the next waiting user.

## Technology

**Current:** Java 25

**Planned:** Spring Boot, Maven, PostgreSQL, React, and Docker

## Run locally

Prerequisite: JDK 25.

Open the project in IntelliJ IDEA and run `Main` in the `org.anovid`
package.

Expected output:

    Java Mock Interview
    2
    false

## Roadmap

- [x] Model a session and validate capacity
- [ ] Implement in-memory booking and cancellation
- [ ] Add REST endpoints
- [ ] Persist sessions and bookings in PostgreSQL
- [ ] Add authentication and ownership checks
- [ ] Prevent overbooking under concurrent requests
- [ ] Implement waitlist offers and expiration
- [ ] Build a React interface
- [ ] Add tests, CI, and deployment

## Learning approach

I write the application code myself, using AI for syntax revision,
examples, hints, and code review.

The goal is to understand and explain the implementation, including
business rules, database design, security, and concurrency.