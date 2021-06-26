package com.example.util;

import com.example.dao.*;
import com.example.model.Coach;
import com.example.model.Course;
import com.example.model.ReportCard;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Admin {
    private static final List<String> namesAndSurnames = List.of("Ivan_Ivanov", "Piotr_Petrov", "Sergey_Sidorov", "Misha_Mishkin", "Aleksey_Alekseev", "Vasya_Vaskin");
    private static final List<Course> courses = new ArrayList<>();
    private static final List<Coach> coaches = new ArrayList<>();
    private static final DAOCoach daoCoach = new DAOCoachImpl();
    private static final DAOCourse daoCourse = new DAOCourseImpl();
    private static final DAOReportCard daoReportCard = new DAOReportCardImpl();

    public static List<ReportCard> getResults() throws SQLException {

        return daoReportCard.getAll(ReportCard.class);
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public static List<Coach> getCoaches() {
        return coaches;
    }

    public static void generateCoursesAndCoaches() {
        Course course1 = Course.builder().title("Java").build();
        Course course2 = Course.builder().title("Hibernate").build();
        for (int i = 0; i < namesAndSurnames.size(); i++) {
            Coach coach = Coach.builder().nameAndSurname(namesAndSurnames.get(i)).build();
            if (i % 2 == 0) {
                if (course1.getCoaches() == null) {
                    Set<Coach> newSet = new HashSet<>();
                    newSet.add(coach);
                    course1.setCoaches(newSet);
                } else {
                    course1.getCoaches().add(coach);
                }
                coach.setCourse(course1);
            } else {
                if (course2.getCoaches() == null) {
                    Set<Coach> newSet = new HashSet<>();
                    newSet.add(coach);
                    course2.setCoaches(newSet);
                } else {
                    course2.getCoaches().add(coach);
                }
                coach.setCourse(course2);
            }
            coaches.add(coach);
        }
        courses.add(course1);
        courses.add(course2);
     }
     public static void saveResult(ReportCard reportCard) throws SQLException {
        daoReportCard.save(reportCard);
     }
     public static void cleanResults() throws SQLException {
        daoReportCard.deleteAll(ReportCard.class);
     }

     public static void saveCourses() throws SQLException{
        daoCourse.saveAll(courses);
     }
    public static void saveCoaches() throws SQLException{
        daoCoach.saveAll(coaches);
    }

}
