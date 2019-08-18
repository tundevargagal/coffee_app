package coffeemachineapp;

import coffeemachine.CoffeeMachine;
import console.CoffeeMachineAppConsole;

class CoffeeMachineApp {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachineAppConsole coffeeMachineAppConsole = new CoffeeMachineAppConsole(coffeeMachine);

        boolean quit = false;

        while (!quit) {
            coffeeMachineAppConsole.showUserMenu();
        }

    }
}
