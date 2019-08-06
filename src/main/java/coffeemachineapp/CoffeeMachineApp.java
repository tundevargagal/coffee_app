package coffeemachineapp;

import coffeemachine.CoffeeMachine;
import console.CoffeeMachineAppConsole;
import org.beryx.textio.TextTerminal;
import org.javatuples.Pair;

import java.util.Optional;

public class CoffeeMachineApp {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachineAppConsole coffeeMachineAppConsole = new CoffeeMachineAppConsole();
        TextTerminal terminal = coffeeMachineAppConsole.getTerminal();

        boolean quit = false;

        while (!quit) {
            Optional.ofNullable(coffeeMachineAppConsole.askUserForCoffeeType())
                    .flatMap(coffeeMachine::makeCoffee)
                    .map(Pair::getValue0)
                    .map(Object::toString)
                    .ifPresent(terminal::println);
        }

    }
}
