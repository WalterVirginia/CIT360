package servlet_examples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "new_servlet", urlPatterns = {"/new_servlet"})
public class new_servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output = response.getWriter();
        response.setContentType("text/html");

        int firstSide = Integer.parseInt(request.getParameter("side1"));
        int secondSide = Integer.parseInt(request.getParameter("side2"));
        int thirdSide = Integer.parseInt(request.getParameter("side3"));

        int sideOne = firstSide;
        int sideTwo = secondSide;
        int sideThree = thirdSide;
        int AREA_DIVISOR = 2;

        /**
         * This is going to get the area and perimeter of a triangle.
         */

        int trianglePerimeter = firstSide + secondSide + thirdSide;
        int a = firstSide + secondSide + thirdSide / AREA_DIVISOR;
        double triangleArea = Math.sqrt(a * (a - firstSide) * (a - secondSide) * (a - thirdSide));





        output.println("<html><head><title>The area and perimeter of a triangle is: \n</title></head><body>");
        output.println("<h1>" + "Area: " + triangleArea + "\n");
        output.println("<h1>" + "Perimeter: " + trianglePerimeter);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();
        output.println("This resource is not available directly.");

    }
}
