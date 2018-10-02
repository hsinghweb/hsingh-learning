package effective.java.item2.builder1;

/**
 *
 * @author Himanshu_Singh2 Created: Jul 24, 2018
 */
public class Client {

    public static void main(final String[] args) {
        NutritionFacts pepsi = new NutritionFacts(240, 8);
        NutritionFacts fanta = new NutritionFacts(240, 8, 5);
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
    }

}
