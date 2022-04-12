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
        // TODO: figure a way to also use card number as input
        //  in order to get unique singular results
        //  such as BO-01 getting one result of MetalGreymon
        // grabs the search term from the form
        String searchTerm = req.getParameter("searchTerm");

        DigimonCardDao cardDao = new DigimonCardDao();

        // empty string searchTerm gives all cards by default
        if (searchTerm != null) {
            url = "/home";
            session.setAttribute("cards", cardDao.getCardByName(searchTerm));
        } else {
            // error page
            url = "/error";
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher(url);
        dispatcher.forward(req, resp);
    }
}