package com.example.servlets;
import com.example.model.Coach;
import com.example.model.Student;
import com.example.supply.GeneratorForDB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "studentServlet", value = "/studentServlet")
public class StudentServlet extends HttpServlet{
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
        out.println("<caption>"+"<h4>" + "List of students"+"</h4>"+"</caption>");
        out.println("<tr>"+ "<th>"+ "id" + "</th>"+"<th>"+ "name" + "</th>" + "<th>"+ "age" + "</th>"+ "</tr>");
        for (Student student: GeneratorForDB.getStudentList()){
            out.println("<tr>"+ "<td>"+ student.getId() + "</td>"+"<td>"+ student.getName() + "</td>" + "<td>"+ student.getAge() + "</td>"+ "</tr>");
        }
        out.println("</table>");

        out.println("</body></html>");

    }
}
