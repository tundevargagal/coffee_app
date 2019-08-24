package console;

public class RequiredDescalingError extends Error {
    @Override
    public String getDescription() {
        return "Führen Sie bitte eine Entkalkung durch.";
    }
}
