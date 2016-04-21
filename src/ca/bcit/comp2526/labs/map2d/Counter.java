package ca.bcit.comp2526.labs.map2d;

import java.util.HashMap;
import java.util.Map;

/**
 * Counter.
 *
 * @author BCIT
 * @version 2016
 */
public class Counter {

    private Die unbiasedDie;
    private HashMap<Integer, Integer> frequencyTable;

    /**
     * Constructor for objects of type Counter.
     */
    public Counter() {
        unbiasedDie = new Die();
        frequencyTable = new HashMap<Integer, Integer>();
    }

    /**
     * Rolls the Die the specified number of times.
     * 
     * @param numberOfRolls
     */
    public void roll(int numberOfRolls) {
        for (int i = 0; i < numberOfRolls; ++i) {
            int newRoll = unbiasedDie.roll();
            if (frequencyTable.get(newRoll) == null) {
                frequencyTable.put(newRoll, 1);
            } else {
                frequencyTable.put(newRoll, frequencyTable.get(newRoll) + 1);
            }
        }
    }

    /**
     * @return String representation of this Counter.
     */
    public String toString() {
        String table = "";
        for (Map.Entry<Integer, Integer> entry : frequencyTable.entrySet()) {
            table += (entry.getKey() + ": " + entry.getValue() + "\n");
        }
        return table;
    }

    /**
     * Drives the program.
     * 
     * @param args
     *            command line arguments (unused)
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.roll(1_000_000);
        System.out.println(counter.toString());
    }

}
