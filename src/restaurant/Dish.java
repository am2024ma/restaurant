/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.List;
import restaurant.exception.NotAllowedFoodException;
import restaurant.food.Food;

/**
 *
 * @author ahmet
 */
public class Dish {

    private List<Food> items;

    private Integer accumulatedCalories;

    private final Integer MAX_CALORIES = 2800;

    public Dish() {
        accumulatedCalories = 0;
        items = new ArrayList<>();
    }
/**
 * This method adds at least one food to the plate 
 * @param items items
 * @throws NotAllowedFoodException Not allowed Food Exception
 * @throws Exception Throws Exception in case the items is null.
 */
    public void addFood(Food ... items) throws NotAllowedFoodException, Exception {
        if (items == null) {
            throw new Exception("Null item exception");
        }

        for (Food food : items) {

            accumulatedCalories += food.getCalories();
            if ((accumulatedCalories > MAX_CALORIES)) {
                throw new NotAllowedFoodException(
                        "Food is not allowed to be put on the plate because the\n"
                        + " foods because the accumulated calories "
                        + accumulatedCalories + " exceeds the " + MAX_CALORIES 
                                + " calories!");
            } else {
                this.items.add(food);
            } 
        } 
    }

    /**
     * This method returns the list of items on the plate
     * @return List Food 
     */
    public List<Food> getItems() {
        return items;
    }

    /**
     * This method accumulates the total amount of the food on the plate
     * 
     * @return Integer
     */
    public Integer getAccumulatedCalories() {
        return accumulatedCalories;
    }

}
