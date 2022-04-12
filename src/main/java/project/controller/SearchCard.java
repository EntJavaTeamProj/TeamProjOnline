package project.controller;
import project.entity.DigimonCardResponse;
import project.persistence.DigimonCardDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
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
        ServletContext context = req.getSession().getServletContext();
        HttpSession session = req.getSession();
        String url;

        String searchTerm = req.getParameter("searchTerm");
        String[] type = searchTerm.split("/");
        if(type[0].equals("cardname")){
            req.setAttribute("searchTerm",type[1]);
            searchTerm = type[1];
            url = "/services/cardname/" + searchTerm;
        }else if (type[0].equals("cardnumber")){
            req.setAttribute("searchTerm",type[1]);
            searchTerm = type[1];
            url = "/services/cardnumber/" + searchTerm;
        }else{
            url = "/error";
        }
        resp.sendRedirect(req.getContextPath() + url);
    }
}