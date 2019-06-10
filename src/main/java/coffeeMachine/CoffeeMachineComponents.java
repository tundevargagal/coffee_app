package coffeeMachine;

public enum CoffeeMachineComponents {

    INSTANCE;

    private final Grinder grinder = new Grinder();

    public Grinder getGrinder() {
        return this.grinder;
    }
}
