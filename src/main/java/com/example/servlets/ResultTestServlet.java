package com.example.servlets;

import com.example.service.BuildReportCard;
import com.example.service.ResultController;
import com.example.util.Admin;
import lombok.SneakyThrows;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "resultTestServlet", value = "/resultTestServlet")
public class ResultTestServlet extends HttpServlet {
    @SneakyThrows
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int mark=0;
        for (int i=0; i<5; i++){
            String param=BuildReportCard.getReportCard().getCourse_name();

            boolean result=ResultController.checkQuiz(request.getParameter(param+(i+1)),i,param);
            if (result) mark++;
            request.setAttribute("task"+(i+1), result);
        }
        request.setAttribute("totalMark", mark);
        request.setAttribute("review", ResultController.getMarksAndReviews().get(mark));
        BuildReportCard.setMarkAndReview(mark, ResultController.getMarksAndReviews().get(mark));
        Admin.saveResult(BuildReportCard.getReportCard());
        BuildReportCard.clear();
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/testResults.jsp");
        requestDispatcher.forward(request,response);
    }
}
