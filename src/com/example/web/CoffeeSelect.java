package com.example.web;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServlet;
import java.io.*;

public class CoffeeSelect extends HttpServlet{

    public void doPost(HttpServletRequest request,
                    HttpServletResponse reponse)
                    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        out.println("Coffee Selection Advice: <br>");
        String c=request.getParameter("color");
        out.println("<br>Got coffee color "+c);
    }
}