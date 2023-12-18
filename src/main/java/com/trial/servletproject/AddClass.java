package com.trial.servletproject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/add")
public class AddClass extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//        int i = Integer.parseInt(req.getParameter("a"));
//        int j = Integer.parseInt(req.getParameter("b"));
//        req.setAttribute("k",(i+j));
//        try {
//            PrintWriter out = res.getWriter();
//            out.println("Full name is = " + req.getParameter("FirstName")+ " "+ req.getParameter("SecondName")+'.');
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


          String Name = req.getParameter("FirstName")+ req.getParameter("SecondName");


//         HttpSession session = req.getSession();
//         session.setAttribute("name",Name);
//           Cookie cookie = new Cookie("name",Name);
//           res.addCookie(cookie);
//           res.sendRedirect("sq");
//        RequestDispatcher Rd = req.getRequestDispatcher("sq");
//        try {
//            Rd.forward(req,res);
//        } catch (ServletException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("Name is :" + Name);
        out.println("</body></html>");
    }
}
