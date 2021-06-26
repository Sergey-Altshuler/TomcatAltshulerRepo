package com.example.service;

import com.example.util.Admin;

import java.sql.SQLException;

public class LoadActions {
    public static void initializeDB() {
        try {
            Admin.generateCoursesAndCoaches();
            Admin.saveCourses();
            Admin.saveCoaches();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
