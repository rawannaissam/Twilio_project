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
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println(" <!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>User Registration</title>\n"
                + "    <link rel=\"stylesheet\" href=\"styleHome.css\">\n"
                + "\n"
                + "    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "\n"
                + "    <header>\n"
                + "        <h1>Home</h1>\n"
                + "    </header>\n"
                + "\n"
                + "    <section>\n"
                + "        <div class=\"icon-buttons\">\n"
                + "            <button class=\"btn\"><a href=\"SMSServlet\"><img src= \"img/sms.png\" alt=\"\"><br>SMS</a></button>\n"
                + "            <button class=\"btn\"><a href=\"CallServlet\"><img src= \"img/call.png\" alt=\"\"><br><br>Call</a></button>\n"
                + "            <button class=\"btn\"><a href=\"ChatServlet\"><img src= \"img/chat.png\" alt=\"\"><br>Chat</a></button>\n"
                + "            <button class=\"btn\"><a href=\"AdminServlet\"> <img src=\"img/admin.png\" alt=\"\"><br>Admin</a></button>\n"
                + "        </div>\n"
                + "\n"
                + "        <div class=\"signup-button\">\n"
                + "            <button type=\"button\"><a href=\"CallServlet\">Signup<a></button>\n"
                + "        </div>\n"
                + "    </section>\n"
                + "\n"
                + "    <footer>\n"
                + "        <p>&copy; 2024 User Registration. All rights reserved.</p>\n"
                + "    </footer>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>");

    }

}
