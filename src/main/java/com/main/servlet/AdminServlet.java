/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.main.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hkouta
 */
public class AdminServlet extends HttpServlet {

      private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        response.sendRedirect("ListMsgServlet");
/*
        out.println("<html><head><title>Message History</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    display: block;");
        out.println("    margin: 0;");
        out.println("    padding: 60px;");
        out.println("    align-items: center;");
        out.println("    justify-content: center;");
        out.println("    height: 1080px;");
        out.println("    background-color: #333;");
        out.println("    color: white;");
        out.println("}");
        out.println("table {");
        out.println("    border-collapse: collapse;");
        out.println("    width: 80%;");
        out.println("    margin-top: 20px;");
        out.println("}");
        out.println("th, td {");
        out.println("    border: 1px solid #dddddd;");
        out.println("    text-align: left;");
        out.println("    padding: 8px;");
        out.println("    color: white;");
        out.println("}");
        out.println("th {");
        out.println("    background-color: #444;");
        out.println("}");
        out.println("</style>");
        out.println("</head><body>");

        // First section: Call History table
        out.println("<section>");
        out.println("<h2>CALL HISTORY</h2>");
        out.println("<table>");
        out.println("<tr><th>From</th><th>Call Msg</th></tr>");
        // Example rows (replace with actual data retrieval logic)
        out.println("<tr><td>John</td><td>Hello, how are you?</td></tr>");
        out.println("<tr><td>Alice</td><td>Meeting tomorrow at 10 AM</td></tr>");
        // Add more rows as needed
        out.println("</table>");
        out.println("</section>");

        // Second section: SMS History table
        out.println("<section>");
        out.println("<h2>MSG HISTORY</h2>");
        out.println("<table>");
        out.println("<tr><th>From</th><th>SMS</th></tr>");
        // Example rows (replace with actual data retrieval logic)
        out.println("<tr><td>Bob</td><td>How's it going?</td></tr>");
        out.println("<tr><td>Eve</td><td>Don't forget to buy milk!</td></tr>");
        // Add more rows as needed
        out.println("</table>");
        out.println("</section>");

        out.println("</body></html>");*/
    }
}