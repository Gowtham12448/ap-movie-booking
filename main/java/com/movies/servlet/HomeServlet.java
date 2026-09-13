package com.movies.servlet;

import com.movies.data.DataStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("movies", DataStore.MOVIES);
        req.setAttribute("locations", DataStore.allLocations());
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
