package com.example.servlets;

import com.example.HTML.HTMLWorker;
import com.example.supply.GeneratorForDB;
import com.example.util.DBConnectionUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servlet", value = "/servlet")
public class Servlet extends HttpServlet {

    public void init() {
        GeneratorForDB.generate();
        DBConnectionUtil.saveAll();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HTMLWorker hw = new HTMLWorker(response);
        hw.displayChoosePage();

    }
}