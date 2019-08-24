package console;

public class NotEnoughBeansError extends Error {
    @Override
    public String getDescription() {
        return "Es sind nicht genug Bohnen vorhanden.";
    }
}
