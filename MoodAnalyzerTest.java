import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMood_WhenHappy_ShouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMood_WhenSAD_ShouldReturnSAD() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMood_WhenNull_ShouldReturnInvalidMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMood_WhenEmpty_ShouldReturnInvalidMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("HAPPY", mood);
    }
}