package ca.bcit.comp2526.labs.map2d;

import java.util.Random;

/**
 * Die.
 * 
 * @author BCIT
 * @version 2016
 */
public class Die {

    public static final int NUMBER_OF_SIZES = 6;
    private int faceValue;
    private Random randomNumberGenerator;

    /**
     * Constructor for objects of type Die.
     */
    public Die() {
        randomNumberGenerator = new Random();
        faceValue = randomNumberGenerator.nextInt(NUMBER_OF_SIZES) + 1;

    }

    /**
     * Rolls the Die and returns the new face value.
     * 
     * @return the new face value as an int
     */
    public int roll() {
        faceValue = randomNumberGenerator.nextInt(NUMBER_OF_SIZES) + 1;
        return faceValue;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Die [faceValue=" + faceValue + "]";
    }

}
