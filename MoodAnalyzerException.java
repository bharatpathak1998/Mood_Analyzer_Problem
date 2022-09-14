public class MoodAnalyzerException extends Exception {
    static ExceptionTypes message;

    enum ExceptionTypes {
        NULL_POINTER_EXCEPTION, EMPTY_STRING_EXCEPTION, UNDEFINED_MOOD_EXCEPTION;

        public static class EMPTY_STRING_EXCEPTION extends Exception {

        }
    }

    public MoodAnalyzerException(ExceptionTypes message) {
        super(String.valueOf(message));
        MoodAnalyzerException.message = message;
    }
}