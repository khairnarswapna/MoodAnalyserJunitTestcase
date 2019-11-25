package com.moodanalyzer;

public class MoodAnalyser {
    public String analyseMood(String meassge){
        try {
             if (meassge.contains("SAD"))
             {
                 return "SAD";
             }
             else {
                 return "HAPPY";
             }
         }
         catch (NullPointerException e)
         {
             return "HAPPY";
         }
    }
}
