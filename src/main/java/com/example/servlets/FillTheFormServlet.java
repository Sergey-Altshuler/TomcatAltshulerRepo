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

@WebServlet(name = "fillTheFormServlet", value = "/fillTheFormServlet")
public class FillTheFormServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        BuildReportCard.setCoachName(request.getParameter("coach"));
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/fillTheForm.jsp");
        requestDispatcher.forward(request,response);
    }
}
