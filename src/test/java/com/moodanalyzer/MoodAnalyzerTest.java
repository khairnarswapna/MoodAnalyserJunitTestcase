package com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest
{
        @Test
        public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
            MoodAnalyser analyser = new MoodAnalyser();
            String mood = analyser.analyseMood("THis is is SAD Message");
            Assert.assertEquals("SAD",mood );

        }
        @Test
        public void givenMessage_whenSad_shouldReturnHappy() throws MoodAnalysisException {
            MoodAnalyser analyser = new MoodAnalyser();
            String mood = analyser.analyseMood("THis is is HAPPY Message");
            Assert.assertEquals("HAPPY",mood);
        }
        @Test
        public void  givenMessage_whenthemoodnull_shouldReturnHappy() {
            MoodAnalyser analyser = new MoodAnalyser();
            try {
                String mood = analyser.analyseMood(null);
            }
            catch(MoodAnalysisException e) {
                Assert.assertEquals("please Enter valid Mood",e.getMessage());
            }
        }
}
