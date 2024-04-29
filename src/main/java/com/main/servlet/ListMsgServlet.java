/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.main.servlet;

import com.main.JDBC;
import com.main.UserInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.util.List;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hkouta
 */
public class ListMsgServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            PrintWriter out = response.getWriter();

            JDBC j = new JDBC();

            response.setContentType("text/html");

            List<UserInfo> u = null;
            List<UserInfo> c = null;

            String c_user = null;
            String doSearch = null;
            String auser = null;

            u = j.GetAllSMS();
            c = j.GetAllCall();

            request.getRequestDispatcher("header.html").include(request, response);

            out.print(
                    "<section>"
                            + "   <div class=\"centered-div2\">\n"
                            + "<br><br>\n"
                    + "\n"
                    + "<h2>Recived SMS</h2>\n"
                    + "\n"
                    + "<table>\n"
                    + "    <thead>\n"
                    + "        <tr>\n"
                    + "            <th>Phone Number</th>\n"
                    + "            <th>SMS MSG</th>\n"
                    + "            <th>SMS Date</th>\n"
                    + "        </tr>\n"
                    + "    </thead>\n"
                    + "    <tbody>"
            );
            for (UserInfo data : u) {
                out.print("<tr>\n"
                        + "            <td>" + data.getFrom() + "</td>\n"
                        + "            <td>" + data.getMsg() + "</td>\n"
                        + "            <td>" + data.getDate()+ "</td>\n"
                        + "        </tr>\n");
            }
            out.print(
                    " </tbody>\n"
                    + "</table>\n"
                    + "<br><br>"
                    + "<h2>Recived Call</h2>\n"
                    + "\n"
                    + "<table>\n"
                    + "    <thead>\n"
                    + "        <tr>\n"
                    + "            <th>Phone Number</th>\n"
                    + "            <th>Call MSG</th>\n"
                    + "            <th>Call Date</th>\n"
                    + "        </tr>\n"
                    + "    </thead>\n"
                    + "    <tbody>"
            );
            for (UserInfo data : c) {
                out.print("<tr>\n"
                        + "            <td>" + data.getFrom() + "</td>\n"
                        + "            <td>" + data.getMsg() + "</td>\n"
                        + "            <td>" + data.getDate()+ "</td>\n"
                        + "        </tr>\n");
            }
            out.print(
                    " </tbody>\n"
                    + "</table>\n"
                    + "\n"
                            +"</div>"
                         +       "</section>"
);
            request.getRequestDispatcher("footer.html").include(request, response);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListMsgServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
