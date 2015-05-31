package com.bozidar.effectivejava;

/**
 * Created by Bozidar on 31.5.2015..
 */
public class App {

    public static void main(String[] args){
        NutritionFacts cocaCola = new NutritionFacts.
                Builder(240, 8).
                calories(100).
                sodium(35).
                carbohydrate(27).
                build();
    }
}
