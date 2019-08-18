package console;

public class NotEnoughWaterError extends Error {
    @Override
    public String getDescription() {
        return "Not enough water available";
    }
}
