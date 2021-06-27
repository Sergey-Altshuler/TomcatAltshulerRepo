package com.example.servlets;

import com.example.service.BuildReportCard;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "quizServlet", value = "/quizServlet")
public class QuizServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        BuildReportCard.setStudentData(request.getParameter("name"), request.getParameter("surname"));
        String path = null;
        if (BuildReportCard.getReportCard().getCourse_name().equals("Java")){
            path="/JavaQuestions.jsp";
        }
        if (BuildReportCard.getReportCard().getCourse_name().equals("Hibernate")){
            path="/HibernateQuestions.jsp";
        }
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request,response);
    }
}
