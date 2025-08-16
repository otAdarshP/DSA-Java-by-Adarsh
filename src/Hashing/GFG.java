package Hashing;

import java.util.*;

class GFG {
    public static void main(String[] args) {
        HashMap <String, String> ticket = new HashMap <> ();
        ticket.put ("Chennai", "Bangalore");
        ticket.put ("Bombay", "Delhi");
        ticket.put ("Goa", "Chennai");
        ticket.put ("Delhi", "Goa");

        String start = getStart(ticket);
        System.out.print ("The itinerary is: ");
        while (ticket.containsKey(start)){
            System.out.print (start + " -> ");
            start = ticket.get(start);
        }
        System.out.println(start);
    }

    public static String getStart (HashMap <String, String> ticketMap){
        HashMap <String, String> reverseMap = new HashMap<>();

        for (String key : ticketMap.keySet()){
            reverseMap.put (ticketMap.get(key), key);
        }

        for (String key : ticketMap.keySet()){
            if (!reverseMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}