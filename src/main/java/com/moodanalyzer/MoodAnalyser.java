package com.moodanalyzer;

public class MoodAnalyser {
    public String analyseMood(String meassge) throws MoodAnalysisException {
        try {
             if (meassge.contains("SAD")) {
                 return "SAD";
             }
             else {
                 return "HAPPY";
             }
         }
         catch (NullPointerException e)
         {
             throw new MoodAnalysisException("please Enter valid Mood");
         }
    }
}
