package console;

public class NotEnoughMilkError extends Error {
    @Override
    public String getDescription() {
        return "es ist nicht genug Milch vorhanden.";
    }
}
