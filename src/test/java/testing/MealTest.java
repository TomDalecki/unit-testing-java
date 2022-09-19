package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscountPrice() {
        //given
        Meal meal = new Meal(35);
        //while
        int discountedPrice = meal.getDiscountPrice(7);
        //then
        assertEquals(28, discountedPrice);
    }
    @Test
    void referencesToTheSameObjectShouldBeEqual(){
        //given
        Meal meal1 = new Meal(10);
        Meal meal2 = new Meal(10);
        //while

        //then
        assertSame(meal1, meal2);
    }
//    @Test
//    void referencesToTheSameObjectShouldNotBeEqual(){
//        //given
//        Meal meal1 = new Meal(10);
//        Meal meal2 = new Meal(20);
//        //while
//
//        //then
//        assertNotSame(meal1, meal2);
//    }
    @Test
    void twoMealsShouldBeEqualsWhenPriceAndNameAreTheSame(){
        //given
        Meal meal1 = new Meal(10, "Pizza");
        Meal meal2 = new Meal(10, "Pizza");

        //then
        assertEquals(meal1, meal2, "Checking if two meals are equal");
    }


}