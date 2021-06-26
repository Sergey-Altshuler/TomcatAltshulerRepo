package com.example.service;

import com.example.model.ReportCard;

public class BuildReportCard {
    private static ReportCard reportCard=ReportCard.builder().build();

    public static ReportCard getReportCard() {
        return reportCard;
    }

    public static void setCourseName(String param){
        reportCard.setCourse_name(param);
    }
    public static void setCoachName(String param){
        reportCard.setCoachYouHaveWorked(param);
    }
    public static void setStudentData(String param1, String param2){
        reportCard.setStudent_name(param1);
        reportCard.setStudent_surname(param2);
    }
    public static void setMarkAndReview(int param1, String param2){
        reportCard.setMark(param1);
        reportCard.setReview(param2);
    }
    public static void clear(){
        reportCard=ReportCard.builder().build();
    }
}
