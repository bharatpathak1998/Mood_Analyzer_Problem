import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMood_WhenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood("HAPPY");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMood_WhenSAD_ShouldReturnSAD() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood("SAD");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMood_WhenNull_ShouldReturnInvalidMood() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood(null);
        Assert.assertEquals("HAPPY", mood);
    }
}