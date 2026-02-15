import java.util.*;

public class itinerary_tickets {

    public static String getStart(HashMap<String, String> tickets) {

        HashMap<String, String> revMap = new HashMap<>();

        // Reverse mapping (destination -> source)
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Starting point = jo revMap mein key na ho
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String args[]) {

        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);

        while (tickets.containsKey(start)) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        //Output: Mumbai -> Delhi -> Goa -> Chennai -> Bengaluru
        System.out.println(); //
    }
}

