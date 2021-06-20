package com.example.servlets;

import com.example.supply.GeneratorForDB;
import com.example.util.DBConnectionUtil;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "servlet", value = "/servlet")
public class Servlet extends HttpServlet {

    public void init() {
        GeneratorForDB.generate();
        DBConnectionUtil.saveAll();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><meta charset=\"utf-8\"><link rel = \"stylesheet\" href=\"style.css\" type=\"text/css\"></head><body>");
        out.println("<a href=\"index.jsp\" class=\"link\">" + "move to start page" + "</a>");
        out.println("<h4>" + "Choose what you want to display" + "</h4>");
        out.println("<select onchange=\"window.location.href=this.options[this.selectedIndex].value\" class=\"link\">");
        out.println("<option selected value= \"none\">" + "none" + "</option>");
        out.println("<option value= \"taskServlet\">" + "tasks" + "</option>");
        out.println("<option value= \"coachServlet\">" + "coaches" + "</option>");
        out.println("<option value= \"studentServlet\">" + "students" + "</option>");
        out.println("</select>");

        out.println("</body></html>");
    }
}