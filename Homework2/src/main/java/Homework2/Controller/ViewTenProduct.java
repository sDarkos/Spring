package Homework2.Controller;


import Homework2.Products.Product;
import Homework2.Service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "viewTenProducts", urlPatterns = "/ten")
public class  ViewTenProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = Service.createProducts(10);

        resp.setContentType("text/html");

        resp.getWriter().println("<h1> Products list: </h1>");

        for (Product product : products) {
            resp.getWriter().println("<h3>" + product.toString() + "</h3>" );
        }
    }
}
