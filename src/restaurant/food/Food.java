/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.food;

/**
 *
 * @author ahmet
 */
public class Food {

    private String title;

    private Integer calories;

    public Food() {
        title = "";
        calories = 0;
    }

    public Food(String title, Integer calories) {
        this();
        this.title = title;
        this.calories = calories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
