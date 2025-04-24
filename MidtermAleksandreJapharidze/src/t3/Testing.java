package t3;

public class Testing {
        public static void main(String[] args) {

            Session s1 = new Session();
            s1.setTitle("Future of AI");
            s1.setSpeaker("Dr. Smith");

            Session s2 = new Session();
            s2.setTitle("Cloud Computing Basics");
            s2.setSpeaker("Ms. Johnson");

            CMS cms = new CMS();
            cms.addSession(s1);
            cms.addSession(s1);
            cms.addSession(s2);
            cms.removeSession(s1);
            cms.printSchedule();

            // --- Testing new search feature below---

            String searchTitle = "cloud computing basics";
            boolean found = cms.searchSessionByTitle(searchTitle);
            if (found) {
                System.out.println("The session \"" + searchTitle + "\" is scheduled.");
            } else {
                System.out.println("The session \"" + searchTitle + "\" is not found in the schedule.");
            }
        }
}
