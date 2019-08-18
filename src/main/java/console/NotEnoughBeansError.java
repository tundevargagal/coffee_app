package console;

public class NotEnoughBeansError extends Error {
    @Override
    public String getDescription() {
        return "Not enough beans available";
    }
}
