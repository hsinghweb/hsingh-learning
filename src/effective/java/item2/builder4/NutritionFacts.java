package effective.java.item2.builder4;

/**
 * Builder Pattern
 * 
 * @author Himanshu_Singh2 Created: Jul 24, 2018
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    NutritionFacts(final NutritionFactsBuilder nutritionFactsBuilder) {
        servingSize = nutritionFactsBuilder.getServingSize();
        servings = nutritionFactsBuilder.getServings();
        calories = nutritionFactsBuilder.getCalories();
        fat = nutritionFactsBuilder.getFat();
        sodium = nutritionFactsBuilder.getSodium();
        carbohydrate = nutritionFactsBuilder.getCarbohydrate();
    }
}
