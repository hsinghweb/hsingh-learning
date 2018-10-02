package effective.java.item2.builder2;

/**
 * JavaBeans Pattern - allows inconsistency, mandates mutability
 * 
 * @author Himanshu_Singh2 Created: Jul 24, 2018
 */
public class NutritionFacts {

    //Parameters initialized to default values (if any)
    private final int servingSize; // Required; no default value, should be set at construction
    private final int servings; // Required; no default value, should be set at construction
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionFacts(final int servingSize, final int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    //Setters
    public void setCalories(final int val) {
        calories = val;
    }

    public void setFat(final int val) {
        fat = val;
    }

    public void setSodium(final int val) {
        sodium = val;
    }

    public void setCarbohydrate(final int val) {
        carbohydrate = val;
    }
}