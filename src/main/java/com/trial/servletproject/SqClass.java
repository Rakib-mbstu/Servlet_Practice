package com.trial.servletproject;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sq")

public class SqClass extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("Second Page");
       // int k = (int) req.getAttribute("k");
       // String Name = (String) req.getParameter("name");
//        ServletContext context = getServletContext();
//        String Name = (String) context.getAttribute("name");
//        HttpSession session = req.getSession();
//        String Name = (String) session.getAttribute("name");
        Cookie[] cookie = req.getCookies();
        String Name = "";
        for(Cookie x: cookie)
        {
            if(x.getName().equals("name")){
                Name = (String) x.getValue();
            }
        }
        out.println("Answer is : " + Name);
    }
}
