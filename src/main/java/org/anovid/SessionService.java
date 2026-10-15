package org.anovid;

import java.util.HashMap;
import java.util.Map;

public class SessionService {
    private final Map<Long,Session>sessions = new HashMap<>();


    public void addSession(Session session) {


        if(sessions.containsKey(session.getId())) {
            throw new IllegalArgumentException("Session ID already exists");
        }
        sessions.put(session.getId(), session);
    }

    public void bookSeats(long sessionId, int seats) {
        Session session = getSessionById(sessionId);
        session.bookSeats(seats);
    }
    public void cancelSeats(long sessionId, int seats) {
        Session session = getSessionById(sessionId);
        session.cancelSeats(seats);
    }

    public Session getSessionById(long id) {
        Session found =  sessions.get(id);
        if(found == null) {
            throw new IllegalArgumentException("Session ID does not exist");
        }

        return found;
    }

}
