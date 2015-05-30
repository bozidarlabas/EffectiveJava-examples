package com.bozidar.effectivejava.main;

import com.bozidar.effectivejava.RandomIntGenerator;
import com.bozidar.effectivejava.generic.RandomGenerator;
import com.bozidar.effectivejava.generic.RandomGenerators;

/**
 * Created by Bozidar on 30.5.2015..
 */
public class App {

    public static void main(String[] args){
        //Static factory method
        RandomIntGenerator randomIntGenerator = RandomIntGenerator.between(1,50);
        randomIntGenerator.nextInt();

        //Static factory method advantage
        //Static factory methods can return an object of any subtype of their return type
        RandomGenerator intGenerator =  RandomGenerators.getIntGenerator();
        intGenerator.next();
    }

}
