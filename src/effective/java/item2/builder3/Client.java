package effective.java.item2.builder3;

/**
 *
 * @author Himanshu_Singh2 Created: Jul 24, 2018
 */
public class Client {

    public static void main(final String[] args) {
        /*NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
        NutritionFacts cocaCola = new NutritionFacts(240, 8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27); */
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).build();
    }
}
