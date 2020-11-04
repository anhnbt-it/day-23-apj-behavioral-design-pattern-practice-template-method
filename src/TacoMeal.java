/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 04/11/2020
 * Time: 10:49 SA
 */

public class TacoMeal extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and shells");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }

    @Override
    public void eat() {
        System.out.println("The tacos are tasty");
    }
}
