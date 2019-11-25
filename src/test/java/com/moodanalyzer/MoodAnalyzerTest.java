package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest
{
        @Test
        public void givenMessage_whenSad_shouldReturnSad()
        {
            MoodAnalyser analyser = new MoodAnalyser();
            String mood = analyser.analyseMood("THis is is SAD Message");
            Assert.assertEquals("SAD",mood );

        }
        @Test
        public void givenMessage_whenSad_shouldReturnHappy()
        {
            MoodAnalyser analyser = new MoodAnalyser();
            String mood = analyser.analyseMood("THis is is HAPPY Message");
            Assert.assertEquals("HAPPY",mood);
        }
        @Test
        public void  givenMessage_whenthemoodnull_shouldReturnHappy()
        {
            MoodAnalyser analyser = new MoodAnalyser();
            String mood = analyser.analyseMood(null);
            Assert.assertEquals("HAPPY",mood );

        }
}
