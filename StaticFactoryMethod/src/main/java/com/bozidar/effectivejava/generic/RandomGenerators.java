package com.bozidar.effectivejava.generic;

import com.bozidar.effectivejava.RandomIntGenerator;

/**
 * Noninstantiable utility class with nothing else than static factory methods
 *
 * Created by Bozidar on 30.5.2015..
 */
public class RandomGenerators {
  private RandomGenerators(){}

    public static final RandomGenerator<Integer> getIntGenerator(){
        return new RandomIntGeneratorGeneric(1,Integer.MAX_VALUE);
    }

    public static final RandomGenerator<String> getStringGenerator() {
        return new RandomStringGeneratorGeneric("");
    }
}
