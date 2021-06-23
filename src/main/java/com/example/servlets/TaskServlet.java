package com.example.servlets;

import com.example.HTML.HTMLWorker;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "taskServlet", value = "/taskServlet")
public class TaskServlet extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HTMLWorker hw = new HTMLWorker(response);
        hw.displayTasks();
    }
}
