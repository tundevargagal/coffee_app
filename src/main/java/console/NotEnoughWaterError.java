package console;

public class NotEnoughWaterError extends Error {
    @Override
    public String getDescription() {
        return "Es ist nicht genug Wasser vorhanden.";
    }
}
