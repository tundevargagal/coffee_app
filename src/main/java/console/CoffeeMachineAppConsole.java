package console;

import coffeemachine.CoffeeMachine;
import coffeetype.CoffeeType;
import coffeetype.CoffeeTypesEnum;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;

import java.util.Optional;

public class CoffeeMachineAppConsole {
    private TextIO textIO = TextIoFactory.getTextIO();
    private TextTerminal terminal = textIO.getTextTerminal();
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineAppConsole(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void showUserMenu() {
        MainMenuSelection selection = textIO.newEnumInputReader(MainMenuSelection.class).read("\nBitte wählen Sie eine Option aus");
        MenuActionResult result = selection.getMenuAction().apply(coffeeMachine, this);

        Optional.ofNullable(result)
                .map(MenuActionResult::getDescription)
                .ifPresent(terminal::println);
    }

    CoffeeType askUserForCoffeeType() {
        return Optional.ofNullable(textIO.newEnumInputReader(CoffeeTypesEnum.class)
                .read("Was möchten Sie heute trinken?")
                .getValue())
                .orElseThrow(() -> new RuntimeException("Invalid Coffee"));
    }

    public TextTerminal getTerminal() {
        return terminal;
    }


}
