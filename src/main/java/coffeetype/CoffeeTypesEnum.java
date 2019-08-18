package coffeetype;

public enum CoffeeTypesEnum {

    ESPRESSO(CoffeeTypes.ESPRESSO),
    LATTE(CoffeeTypes.LATTE);

    private CoffeeType coffeeType;

    CoffeeTypesEnum(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeType getValue() {
        return this.coffeeType;
    }

}
