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
public class SMSServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>SMS</title>\n"
                + "<link rel=\"stylesheet\" href=\"styleForm.css\">\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "\n"
                + "    <header>\n"
                + "        <h1>SMS</h1>\n"
                + "        <div class=\"header-buttons\">\n"
                + "            <button><a href=\"SMSServlet\">SMS</a></button>\n"
                + "            <button ><a href=\"CallServlet\">Call</a></button>\n"
                + "            <button><a href=\"ChatServlet\">Chat</a></button>\n"
                + "            <button ><a href=\"AdminServlet\">Admin</a></button>\n"
                + "        </div>\n"
                + "    </header>\n"
                + "\n"
                + "    <section>\n"
                + "        <form id=\"messageForm\" method=\"GET\" action=\"MakeSMSServlet\">\n"
                + "            <label for=\"user\">User:</label><br>\n"
                + "            <input type=\"text\" id=\"user\" name=\"user\"><br><br>\n"
                + "\n"
                + "            <label for=\"to\">To:</label><br>\n"
                + "            <input type=\"text\" id=\"to\" name=\"to\"><br><br>\n"
                + "\n"
                + "            <label for=\"from\">From:</label><br>\n"
                + "            <input type=\"text\" id=\"from\" name=\"from\"><br><br>\n"
                + "\n"
                + "            <label for=\"msg\">Message:</label><br>\n"
                + "            <textarea id=\"msg\" name=\"msg\" rows=\"4\" cols=\"50\"></textarea><br><br>\n"
                + "\n"
                + "            <input type=\"submit\" value=\"Submit\">\n"
                + "        </form>\n"
                + "    </section>\n"
                + "\n"
                + "    <footer>\n"
                + "        <p>&copy; 2024 Contact Us. All rights reserved.</p>\n"
                + "    </footer>\n"
                + "\n"
                + "</body>\n"
                + "\n"
                + "</html>");

    }

}
