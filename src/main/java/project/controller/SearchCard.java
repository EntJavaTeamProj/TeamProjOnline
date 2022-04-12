package project.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Servlet to the results jsp page
 */

@WebServlet(
        urlPatterns = {"/searchCard"}
)

public class SearchCard extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("errorMSG", null);
        String url;

        String searchEntry = req.getParameter("searchEntry");
        String[] type = searchEntry.split("/");
        String searchTerm = type[1];
        if(type[0].equals("cardname")){
            url = "/services/cardname/" + searchTerm;
        }else if (type[0].equals("cardnumber")){
            url = "/services/cardnumber/" + searchTerm;
        }else{
            url = "/error";
        }
        resp.sendRedirect(req.getContextPath() + url);
    }
}