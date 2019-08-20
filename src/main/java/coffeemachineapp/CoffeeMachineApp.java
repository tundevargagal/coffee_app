package coffeemachineapp;

import coffeemachine.CoffeeMachine;
import console.CoffeeMachineAppConsole;

class CoffeeMachineApp {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachineAppConsole coffeeMachineAppConsole = new CoffeeMachineAppConsole(coffeeMachine);

        while (true) {
            coffeeMachineAppConsole.showUserMenu();
        }

    }
}
