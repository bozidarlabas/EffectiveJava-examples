package com.bozidar.effectivejava;

import java.util.Random;

/**
 * Class with static factory methods
 *
 * Created by Bozidar on 30.5.2015..
 */
public class RandomIntGenerator {
    private final int min;
    private final int max;


    /**
     * Cnstructor is private so that the class is only instantiated through its public static factory methods
     * @param min Min value
     * @param max Max value
     */
    private RandomIntGenerator(int min, int max){
        this.min = min;
        this.max = max;
    }

    //Static factory method

    /**
     * Static factory method between
     * @param min Min value
     * @param max Max value
     * @return Instance of this class
     */
    public static RandomIntGenerator between(int min, int max){
        return new RandomIntGenerator(min,max);
    }


    /**
     * Static factory method biggerThan
     * @param min Min value
     * @return Instance of this class
     */
    public static RandomIntGenerator biggerThan(int min){
        return new RandomIntGenerator(min,Integer.MAX_VALUE);
    }

    /**
     * Static factory method smallerThan
     * @param max Max value
     * @return Instance of this class
     */
    public static RandomIntGenerator smallerThan(int max){
        return new RandomIntGenerator(Integer.MIN_VALUE,max);
    }

    public void nextInt(){
        int randomNumber = new Random().nextInt((max + 1) - min) + min;
        System.out.println(randomNumber);
    }


    //We cant have two constructors with same type

    /*
    public RandomIntGenerator(int min){
        this.min = min;
        this.max = Integer.MAX_VALUE;
    }

    public RandomIntGenerator(int max){
        this.min = Integer.MIN_VALUE;
        this.max = max;
    }
    */
}
