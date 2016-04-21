package ca.bcit.comp2526.labs.map2d;

import java.util.*;

/**
 * TwoDMapExample.
 *
 * @author your name here
 * @version 1.0
 */
public class TwoDMapExample {

    /**
     * Drives the program. Complete the program to produce the required output.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {

        // Create Map called student [Province, Map[City, Id]]

        
        HashMap <String, Map> student = new HashMap<String, Map>();

        // Create Map called BC [City, Id]
        HashMap <String, String> BC = new HashMap<String, String>();

        // Add 2 students to BC Map:
        // 1. "Vancouver", "A00012345"
        // 2. "New West", "A00067891"
        BC.put("Vancouver", "A00012345");
        BC.put("New West", "A00067891");
        
        // Add the BC Map to the student map
        student.put("BC", BC);

        // Create Map called ON [City, Id] (or reuse object reference)
        HashMap <String, String> ON = new HashMap<String, String>();
        
        // Add 2 students to ON Map:
        // 1. "Toronto", "A00038234"
        // 2. "Ottawa","A00000123"
        ON.put("Toronto", "A00038234");
        ON.put("Ottawa","A00000123");
        
        // Add the ON Map to the student map
        student.put("ON", ON);

        // Expected output:
        // student prov = BC {Vancouver=A00012345, New West=A00067891}
        // student prov = ON {Ottawa=A00000123, Toronto=A00038234}
        System.out.println("student prov = BC " + student.get("BC"));
        System.out.println("student prov = ON " + student.get("ON"));
    }
}
