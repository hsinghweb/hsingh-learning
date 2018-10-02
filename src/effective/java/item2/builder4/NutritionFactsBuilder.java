package effective.java.item2.builder4;

/**
 *
 * @author Himanshu_Singh2 Created: Jul 24, 2018
 */
public class NutritionFactsBuilder {

    //Required parameters
    private final int servingSize;
    private final int servings;
    //Optional parameters - initialized to default values
    private int calories = 0;
    private int fat = 0;
    private int carbohydrate = 0;
    private int sodium = 0;

    public NutritionFactsBuilder(final int servingSize, final int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public NutritionFactsBuilder calories(final int val) {
        calories = val;
        return this;
    }

    public NutritionFactsBuilder fat(final int val) {
        fat = val;
        return this;
    }

    public NutritionFactsBuilder carbohydrate(final int val) {
        carbohydrate = val;
        return this;
    }

    public NutritionFactsBuilder sodium(final int val) {
        sodium = val;
        return this;
    }

    public NutritionFacts build() {
        return new NutritionFacts(this);
    }

    /**
     * @return The servingSize
     */
    public int getServingSize() {
        return servingSize;
    }

    /**
     * @return The servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @return The calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * @return The fat
     */
    public int getFat() {
        return fat;
    }

    /**
     * @return The carbohydrate
     */
    public int getCarbohydrate() {
        return carbohydrate;
    }

    /**
     * @return The sodium
     */
    public int getSodium() {
        return sodium;
    }

}
