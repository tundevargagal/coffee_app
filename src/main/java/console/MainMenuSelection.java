package console;

import coffeemachine.CoffeeMachine;
import coffeetype.CoffeeType;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public enum MainMenuSelection {
    KAFFEEAUSWAHL("1") {
        @Override
        BiFunction<CoffeeMachine, CoffeeMachineAppConsole, MenuActionResult> getMenuAction() {
            return (coffeeMachine, console) ->
                    Optional.ofNullable(console.askUserForCoffeeType())
                    .map((Function<CoffeeType, Result<? extends MenuActionResult>>) coffeeMachine::makeCoffee)
                    .map(result -> result.isError() ? result.getError() : result.getValue())
                    .get();
        }
    },
    STATUS("2") {
        @Override
        BiFunction<CoffeeMachine, CoffeeMachineAppConsole, MenuActionResult> getMenuAction() {
            return (coffeeMachine, console) -> Optional.ofNullable(coffeeMachine.getStatus()).map(status -> (MenuActionResult) () -> status).get();
        }
    },
    WARTUNG("3") {
        @Override
        BiFunction<CoffeeMachine, CoffeeMachineAppConsole, MenuActionResult> getMenuAction() {
            return (coffeeMachine, console) -> Optional.ofNullable(coffeeMachine.maintain())
                    .map(status -> (MenuActionResult) () -> status).get();
        }
    },
    MainMenuSelection("4") {
        @Override
        BiFunction<CoffeeMachine, CoffeeMachineAppConsole, MenuActionResult> getMenuAction() {
            return (coffeeMachine, console) -> {
                console.getTerminal().println("Ciao!");
                System.exit(0);
                return null;
            };

        }
    };

    private String menuItem;

    MainMenuSelection(String menuItem) {
        this.menuItem = menuItem;
    }

    abstract BiFunction<CoffeeMachine, CoffeeMachineAppConsole, MenuActionResult> getMenuAction();
}
