package console;

import coffeetype.CoffeeType;
import coffeetype.CoffeeTypes;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;

import java.util.Optional;

public class CoffeeMachineAppConsole {
    TextIO textIO = new TextIoFactory().getTextIO();
    private TextTerminal terminal = textIO.getTextTerminal();

    public CoffeeType askUserForCoffeeType() {
        return Optional.ofNullable(textIO.newEnumInputReader(CoffeeTypes.class)
                .read("What will you have today?")
                .getValue())
                .orElseThrow(() -> new RuntimeException("Invalid Coffee"));
    }

    public TextTerminal getTerminal() {
        return terminal;
    }


}
