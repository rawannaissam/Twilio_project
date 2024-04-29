/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.main.JDBC;
import com.main.UserInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hkouta
 */
public class ListData extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

      
            PrintWriter out = response.getWriter();

            JDBC j = new JDBC();

            response.setContentType("text/html");
     
            List<UserInfo> u = null;

            String c_user = null;
            String doSearch = null;
            String auser = null;

  
        try {
            u = j.GetAllSMS();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListData.class.getName()).log(Level.SEVERE, null, ex);
        }
                    request.getRequestDispatcher("header.html").include(request, response);

                    out.print("<div class=\"centered-div\">\n"
                            + "    <span>Servlet</span>\n"
                            + "    <br><br>\n"
                            + "    <form id=\"searchservleet\" method=\"GET\" action=\"doSearchHomeServlet\">\n"
                            + "\n"
                            + "        <input type=\"text\" name=\"doSearchX\">\n"
                            + "        <br><br>\n"
                            + "\n"
                            + "        <input type=\"submit\" value=\"search\">\n"
                            + "        <br><br>\n"
                            + "    </form>\n"
                            + "</div>\n"
                            + "\n"
                            + "<br><br><br><br>\n"
                            + "\n"
                            + "<h2>Search Results</h2>\n"
                            + "\n"
                            + "<table>\n"
                            + "    <thead>\n"
                            + "        <tr>\n"
                            + "            <th>ID</th>\n"
                            + "            <th>First Name</th>\n"
                            + "            <th>Last Name</th>\n"
                            + "            <th>User Name</th>\n"
                            + "            <th>Address</th>\n"
                            + "        </tr>\n"
                            + "    </thead>\n"
                            + "    <tbody>"
                    );
                    for (UserInfo data : u) {
                        out.print("<tr>\n"
                                + "            <td>" + data.getFrom()+ "</td>\n"
                                + "            <td>" + data.getMsg()+ "</td>\n"
                                + "            <td>" + "data.getLname()" + "</td>\n"
                                + "            <td>" +"data.getLname()" + "</td>\n"
                                + "            <td>" + "data.getLname()" + "</td>\n"
                                + "        </tr>\n");
                    }
                    out.print(
                            " </tbody>\n"
                            + "</table>\n"
                            + "\n");
                    request.getRequestDispatcher("footer.html").include(request, response);
                }
            }


    


