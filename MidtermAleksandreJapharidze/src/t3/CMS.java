package t3;

import java.util.ArrayList;
import java.util.List;

public class CMS {
    private List<Session> schedule = new ArrayList<>();

    public void addSession(Session session) {
        schedule.add(session);
    }

    public boolean removeSession(Session session) {
        boolean removed = false;
        for (int i = 0; i < schedule.size(); i++) {
            Session s = schedule.get(i);
            if (s.getTitle().equals(session.getTitle()) && s.getSpeaker().equals(session.getSpeaker())) {
                schedule.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * NEW FEATURE I ADDED: Search for a session by its title.
     * This method returns true if a session with the given title exists in the schedule.
     */
    public boolean searchSessionByTitle(String title) {
        for (Session s : schedule) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public void printSchedule() {
        if (schedule.isEmpty()) {
            System.out.println("The schedule is empty.");
        } else {
            for (Session s : schedule) {
                System.out.println(s.getSpeaker() + " is giving a session on \"" + s.getTitle() + "\"");
                System.out.println();
            }
        }
    }
}
