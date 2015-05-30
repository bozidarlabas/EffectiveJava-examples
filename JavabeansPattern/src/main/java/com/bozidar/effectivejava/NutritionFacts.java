package com.bozidar.effectivejava;

/**
 * Created by Bozidar on 30.5.2015..
 */
public class NutritionFacts {
    // Parameters initialized to default values
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;
    public NutritionFacts() { }

    // Setters
    public void setServingSize(int val) { this.servingSize = val; }
    public void setServings(int val) { this.servings = val; }
    public void setCalories(int val) { this.calories = val; }
    public void setFat(int val) { this.fat = val; }
    public void setSodium(int val) { this.sodium = val; }
    public void setCarbohydrate(int val) { this.carbohydrate = val; }
}
