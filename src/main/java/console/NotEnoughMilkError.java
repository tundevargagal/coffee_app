package console;

public class NotEnoughMilkError extends Error {
    @Override
    public String getDescription() {
        return "Es ist nicht genug Milch vorhanden.";
    }
}
