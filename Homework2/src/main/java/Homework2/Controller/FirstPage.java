package Homework2.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FirstPage extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(FirstPage.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("new get req");
        resp.setContentType("text/html");
        resp.getWriter().println("<h1> hello user </h1>");
    }
}

