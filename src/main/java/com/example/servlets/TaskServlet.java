package com.example.servlets;

import com.example.model.Coach;
import com.example.model.Task;
import com.example.supply.GeneratorForDB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "taskServlet", value = "/taskServlet")
public class TaskServlet extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><meta charset=\"utf-8\"><link rel = \"stylesheet\" href=\"style.css\" type=\"text/css\"></head><body>");

        out.println("<a href=\"servlet\" class=\"link\">" + "return back" + "</a>");

        out.println("<hr>");
        out.println("<table>");
        out.println("<caption>"+"<h4>" + "List of tasks"+"</h4>"+"</caption>");
        out.println("<tr>"+ "<th>"+ "id" + "</th>"+"<th>"+ "title" + "</th>" + "<th>"+ "difficulty" + "</th>"+"<th>"+ "description" + "</th>"+ "</tr>");
        for (Task task: GeneratorForDB.getTaskList()){
            out.println("<tr>"+ "<td>"+ task.getId() + "</td>"+"<td>"+ task.getTitle() + "</td>" + "<td>"+ task.getDifficulty() + "</td>"+"<td>"+ task.getDescription() + "</td>"+ "</tr>");
        }
        out.println("</table>");
        out.println("</body></html>");

    }
}
