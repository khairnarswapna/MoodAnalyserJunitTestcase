package com.moodanalyzer;

public class MoodAnalyser {
    private String message;


    public MoodAnalyser(String message){
        this.message=message;
    }
    public  String analyseMood(String message) throws MoodAnalysisException{
        this.message=message;
        return  analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException{
        try {
            if(message.length()==0) {
                throw new MoodAnalysisException("This is HAPPY message");
            }
            if (message.contains("SAD"))
            {
                return "SAD";
            }
            else
            {
                return "HAPPY";
            }
        }catch(NullPointerException e)
        {
            throw new MoodAnalysisException("please enter proper message");
        }
    }
}