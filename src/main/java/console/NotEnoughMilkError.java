package console;

public class NotEnoughMilkError extends Error {
    @Override
    public String getDescription() {
        return "Not enough milk available";
    }
}
