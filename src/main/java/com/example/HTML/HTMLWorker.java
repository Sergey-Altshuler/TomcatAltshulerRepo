package com.example.HTML;

import com.example.model.Coach;
import com.example.model.Student;
import com.example.model.Task;
import com.example.util.DBConnectionUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HTMLWorker {
    private final PrintWriter pw;

    public HTMLWorker(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        pw = response.getWriter();
    }

    public void displayCoaches() {
        pw.println("<html><head><meta charset=\"utf-8\"><link rel = \"stylesheet\" href=\"style.css\" type=\"text/css\"></head><body>");
        pw.println("<a href=\"servlet\" class=\"link\">" + "return back" + "</a>");
        pw.println("<hr><table>");
        pw.println("<caption>" + "<h2>" + "Coach list" + "</h2>" + "</caption>");
        pw.println("<tr>" + "<th>" + "id" + "</th>" + "<th>" + "name" + "</th>" + "<th>" + "salary" + "</th>" + "<th>" + "level" + "</th>" + "</tr>");
        List<Coach> coachList = (List<Coach>) DBConnectionUtil.getList(Coach.class);
        for (Coach coach : coachList) {
            pw.println("<tr>" + "<td>" + coach.getId() + "</td>" + "<td>" + coach.getName() + "</td>" + "<td>" + coach.getSalary() + "</td>" + "<td>" + coach.getProfLevel() + "</td>" + "</tr>");
        }
        pw.println("</table></body></html>");
    }

    public void displayChoosePage() {
        pw.println("<html><head><meta charset=\"utf-8\"><link rel = \"stylesheet\" href=\"style.css\" type=\"text/css\"></head><body>");
        pw.println("<a href=\"index.jsp\" class=\"link\">" + "move to start page" + "</a>");
        pw.println("<h2>" + "Choose what you want to display" + "</h2>");
        pw.println("<select onchange=\"window.location.href=this.options[this.selectedIndex].value\" class=\"link\">");
        pw.println("<option selected value= \"none\">" + "none" + "</option>");
        pw.println("<option value= \"taskServlet\">" + "tasks" + "</option>");
        pw.println("<option value= \"coachServlet\">" + "coaches" + "</option>");
        pw.println("<option value= \"studentServlet\">" + "students" + "</option>");
        pw.println("</select></body></html>");
    }

    public void displayStudents() {
        pw.println("<html><head><meta charset=\"utf-8\"><link rel = \"stylesheet\" href=\"style.css\" type=\"text/css\"></head><body>");
        pw.println("<a href=\"servlet\" class=\"link\">" + "return back" + "</a>");
        pw.println("<hr><table>");
        pw.println("<caption>" + "<h2>" + "Student list" + "</h2>" + "</caption>");
        pw.println("<tr>" + "<th>" + "id" + "</th>" + "<th>" + "name" + "</th>" + "<th>" + "age" + "</th>" + "</tr>");
        List<Student> studentList = (List<Student>) DBConnectionUtil.getList(Student.class);
        for (Student student : studentList) {
            pw.println("<tr>" + "<td>" + student.getId() + "</td>" + "<td>" + student.getName() + "</td>" + "<td>" + student.getAge() + "</td>" + "</tr>");
        }
        pw.println("</table></body></html>");
    }

    public void displayTasks() {
        pw.println("<html><head><meta charset=\"utf-8\"><link rel = \"stylesheet\" href=\"style.css\" type=\"text/css\"></head><body>");
        pw.println("<a href=\"servlet\" class=\"link\">" + "return back" + "</a>");
        pw.println("<hr><table>");
        pw.println("<caption>" + "<h2>" + "Task list" + "</h2>" + "</caption>");
        pw.println("<tr>" + "<th>" + "id" + "</th>" + "<th>" + "title" + "</th>" + "<th>" + "difficulty" + "</th>" + "<th>" + "description" + "</th>" + "</tr>");
        List<Task> taskList = (List<Task>) DBConnectionUtil.getList(Task.class);
        for (Task task : taskList) {
            pw.println("<tr>" + "<td>" + task.getId() + "</td>" + "<td>" + task.getTitle() + "</td>" + "<td>" + task.getDifficulty() + "</td>" + "<td>" + task.getDescription() + "</td>" + "</tr>");
        }
        pw.println("</table></body></html>");

    }
}
