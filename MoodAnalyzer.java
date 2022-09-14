public class MoodAnalyzer {

    public String analyzeMood(String message) {

        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}