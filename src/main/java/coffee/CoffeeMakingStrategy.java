package coffee;

public interface CoffeeMakingStrategy {
    Coffee makeCoffee();

    int getRequiredWater();

    int getRequiredBeans();

    int getRequiredMilk();
}
