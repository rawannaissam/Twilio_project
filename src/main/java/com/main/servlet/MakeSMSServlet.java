/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.main.servlet;

import com.main.Action;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hkouta
 */
public class MakeSMSServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        
        resp.setContentType("text/html");
        
        
        String user = req.getParameter("user");
        String to = req.getParameter("to");
        String from = req.getParameter("from");
        String msg = req.getParameter("msg");

        try {
            Action.SMSUser(user, to, from, msg);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MakeCallServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
