package com.bozidar.effectivejava.generic;

import com.bozidar.effectivejava.RandomIntGenerator;

/**
 * Created by Bozidar on 30.5.2015..
 */
class RandomStringGeneratorGeneric implements RandomGenerator<String> {

    private final String prefix;

    RandomStringGeneratorGeneric(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String next() {
        return null;
    }
}
