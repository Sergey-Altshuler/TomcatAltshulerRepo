package com.example.servlets;

import com.example.service.LoadActions;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "courseServlet", value = "/courseServlet")
public class CourseServlet extends HttpServlet {
    public void init(){
        LoadActions.initializeDB();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/chooseCourse.jsp");
        requestDispatcher.forward(request,response);
    }

}