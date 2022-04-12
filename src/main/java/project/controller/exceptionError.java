package project.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet that forwards to an error page
 */
@WebServlet(
        urlPatterns = {"/exceptionerror"}
)
public class exceptionError extends HttpServlet {
    /**
     * Handles HTTP GET requests
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url = "index.jsp";
        RequestDispatcher dispatcher = req.getRequestDispatcher(url);
        req.setAttribute("errorMSG", "error, and exception has occurred");
        dispatcher.forward(req, resp);
    }
}
