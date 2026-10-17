package org.anovid;

import java.util.List;

public class Main {
    static void main() {

        SessionService service = new SessionService();

        service.addSession(new Session(1,"spring boot",2));
        service.addSession(new Session(3,"java",2));

        service.bookSeats(3,3);
        service.cancelSeats(3,3);
        for(Session session:service.getAvailableSessions()) {
            System.out.println(session.getTitle());
        }
    }

}
