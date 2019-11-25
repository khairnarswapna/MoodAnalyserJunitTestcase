package com.moodanalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {
    public static MoodAnalyser createMoodAnalyser(String message) throws ClassNotFoundException {
        try {
            Class<?> moodAnalysisClass = Class.forName("com.moodanalyzer.MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalysisClass.getConstructor(String.class);
            Object moodobj = moodConstructor.newInstance(message);
            return (MoodAnalyser) moodobj;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}