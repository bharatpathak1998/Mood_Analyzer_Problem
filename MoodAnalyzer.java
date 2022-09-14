public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood(String message) {

        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}