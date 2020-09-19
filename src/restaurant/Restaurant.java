/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import restaurant.food.Food;

/**
 *
 * @author ahmet
 */
public class Restaurant {

    private static Dish dish;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        dish = new Dish();

        Food foodApple = new Food("Pie", 800);
        Food foodDrink = new Food("Coca-cola", 1900);

        Food foodTea = new Food("Green tea", 100);

        try {
            dish.addFood(foodApple, foodDrink, foodTea);

            System.out.println("The food on the plate is with "
                    + convert(dish.getAccumulatedCalories()) + " calories.");
            System.out.println("The food on the plate are: ");
            int i = 1;
            for (Food arg : dish.getItems()) {
                System.out.println(i++ + ". " + arg.getTitle());
            }
            System.out.println("Total calories per dish: " + convert(dish.getAccumulatedCalories()) + " calories.");

        } catch (Exception ex) {
            Logger.getLogger(Restaurant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *  Converts the number by dividing 1000 
     * @param prm parameter
     * @return  String
     */
    private static String convert(Integer prm) {

        Float floatRes = new Float(prm);
        if (prm < 1000) {
            return prm.toString();
        } else {
            Float res = floatRes / 1000;
            NumberFormat formatter = new DecimalFormat("#0.00");
            return formatter.format(res) + " K";
        }
    }
}
