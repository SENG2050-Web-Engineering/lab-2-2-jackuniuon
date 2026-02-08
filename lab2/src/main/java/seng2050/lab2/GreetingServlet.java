package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {



        String[] name = req.getParameterValues("name");
        String first = name[0];
        String last = name[1];

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title> Title </title> </head>");
        out.println("<body>");
        out.println("\t<h1> Welcome, " + first);
        out.println(last + "</h1>");
        out.println(HtmlGen.h2("yeah test"));
        // out.println("<form action=GreetingServlet method=\"GET\" onsubmit=\"return true;\">");
        // out.println("<label for=\"firstName\"> First Name </label>");
        // out.println("<input type=\"text\" name=\"firstName\" id=\"firstName\"/> <br>");
        // out.println("<label for=\"lastName\"> Last Name </label>");
        // out.println("<input type=\"text\" name=\"lastName\" id=\"lastName\"/> <br>");
        // out.println("<input type=\"reset\" value=\"Clear\"/>");
        // out.println("<input type=\"submit\" value=\"Submit\" />");
        // out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String[] firstName = req.getParameterValues("firstName");
        String first = firstName[0];
        String[] lastName = req.getParameterValues("lastName");
        String last = lastName[0];
        
        PrintWriter out = resp.getWriter();
        out.println(HtmlGen.doctype());
        out.println("<html>");
        out.println("<head> <title> Title </title> </head>");
        out.println("<body>");
        out.println(HtmlGen.h1(first + " " + last));

        out.println("</body>");
        out.println("</html>");


    }



}
