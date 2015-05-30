package com.bozidar.effectivejava;

/**
 * Created by Bozidar on 30.5.2015..
 */
public class App {
    public static void main(String[] args){
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
