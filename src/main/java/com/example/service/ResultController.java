package com.example.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultController {
    private static final List<String> hibernateAnswers = List.of("entity", "ManyToMany","универсальность","data","функциональность");
    private static final List<String> javaAnswers = List.of("void", "for","switch","FunctionalInterface","deprecated");
    private static final Map<Integer, String> marksAndReviews = new HashMap<>();

    public static Map<Integer, String> getMarksAndReviews() {
        return marksAndReviews;
    }

    static {
        marksAndReviews.put(0,"you have not any knowledge");
        marksAndReviews.put(1,"very bad");
        marksAndReviews.put(2, "bad");
        marksAndReviews.put(3, "so-so");
        marksAndReviews.put(4, "it would be better");
        marksAndReviews.put(5, "excellent");
    }

    public static boolean checkQuiz(String answer, int num, String param){
           if (param.equalsIgnoreCase("Java")){
               return answer.trim().equalsIgnoreCase(javaAnswers.get(num));
           }
           if (param.equalsIgnoreCase("Hibernate")){
               return answer.trim().equalsIgnoreCase(hibernateAnswers.get(num));
           }
           return false;
    }


}
