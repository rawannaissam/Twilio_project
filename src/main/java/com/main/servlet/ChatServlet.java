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
public class ChatServlet extends HttpServlet {

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
                + "    <title>Chat</title>\n"
                + "<link rel=\"stylesheet\" href=\"styleForm.css\">\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "\n"
                + "    <header>\n"
                + "        <h1>Chat</h1>\n"
                + "        <div class=\"header-buttons\">\n"
                + "            <button><a href=\"SMSServlet\">SMS</a></button>\n"
                + "            <button ><a href=\"CallServlet\">Call</a></button>\n"
                + "            <button><a href=\"ChatServlet\">Chat</a></button>\n"
                + "            <button ><a href=\"AdminServlet\">Admin</a></button>\n"
                + "        </div>\n"
                + "    </header>\n"
                + "\n"
                +"<section>"
                + "   <div class=\"centered-div\">\n"
                + "        <form id=\"tcp-form\" method=\"GET\" action=\"TcpClient\">\n"
                + "            <input type=\"text\" name=\"message\" id=\"tcp-message\" placeholder=\"Enter TCP message...\">\n"
                + "            <input type=\"submit\" value=\"TCP\">\n"
                + "        </form>\n"
                +"<br>"
                + "        <form id=\"udp-form\" method=\"GET\" action=\"UdpClient\">\n"
                + "            <input type=\"text\" name=\"message\" id=\"udp-message\" placeholder=\"Enter UDP message...\">\n"
                + "            <input type=\"submit\" value=\"UDP\">\n"
                + "        </form>\n"
                + "    </div>"
                                +"</section>"

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
