package com.bozidar.effectivejava.generic;

import java.util.Random;

/**
 * Created by Bozidar on 30.5.2015..
 */
class RandomIntGeneratorGeneric implements RandomGenerator<Integer> {

    private final int min;
    private final int max;

    RandomIntGeneratorGeneric(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Integer next() {
        int randomNumber = new Random().nextInt((max + 1) - min) + min;
        System.out.println(randomNumber);
        return randomNumber;
    }
}
