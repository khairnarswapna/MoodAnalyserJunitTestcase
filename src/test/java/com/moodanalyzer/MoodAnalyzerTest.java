package com.moodanalyzer;

import org.graalvm.compiler.lir.phases.EconomyAllocationStage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest
{
    @Test
      public void givenMoodAnalyzerClass_createIntance()
      {
          try {

              MoodAnalyser moodAnalyser=MoodAnalyserFactory.createMoodAnalyser("This is HAPPY message");
              String mood=moodAnalyser.analyseMood();
              Assert.assertEquals("HAPPY",mood);
          } catch (ClassNotFoundException | MoodAnalysisException e) {
              e.printStackTrace();
          }
      }
        @Test
        public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
            MoodAnalyser analyser = new MoodAnalyser(null);
            String mood = analyser.analyseMood("THis is is SAD Message");
            Assert.assertEquals("SAD",mood );

        }
        @Test
        public void givenMessage_whenSad_shouldReturnHappy() throws MoodAnalysisException {
            MoodAnalyser analyser = new MoodAnalyser(null);
            String mood = analyser.analyseMood("THis is is HAPPY Message");
            Assert.assertEquals("HAPPY",mood);
        }
        @Test
        public void  givenMessage_whenthemoodnull_shouldReturnHappy() {
            MoodAnalyser analyser = new MoodAnalyser(null);
            try {
                String mood = analyser.analyseMood(null);
            }
            catch(MoodAnalysisException e) {
                Assert.assertEquals("please Enter valid Mood",e.getMessage());
            }
        }
        @Test
        public void givenMessageForReflectionObject()
        {
            MoodAnalyser moodAnalyser=new MoodAnalyser("This is HAPPY message");
            ObjectReflector.dump(moodAnalyser, 0);
        }
}
