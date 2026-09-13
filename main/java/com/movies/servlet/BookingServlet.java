package com.movies.servlet;

import com.movies.data.DataStore;
import com.movies.model.Movie;
import com.movies.model.Theater;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String movieId = req.getParameter("movieId");
        String location = req.getParameter("location");

        Movie movie = null;
        if (movieId != null && !movieId.isEmpty()) {
            movie = DataStore.movieById(Integer.parseInt(movieId));
        }

        req.setAttribute("movie", movie);
        req.setAttribute("location", location);
        req.setAttribute("theaters", DataStore.theatersByLocation(location));
        req.setAttribute("showtimes", movie != null ? DataStore.SHOWTIMES.get(movie.getId()) : null);

        req.getRequestDispatcher("/booking.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String movieId = req.getParameter("movieId");
        String theaterId = req.getParameter("theaterId");
        String showtime = req.getParameter("showtime");
        String seats = req.getParameter("seats");
        String customerName = req.getParameter("customerName");

        Movie movie = DataStore.movieById(Integer.parseInt(movieId));
        Theater theater = DataStore.theaterById(Integer.parseInt(theaterId));

        req.setAttribute("movie", movie);
        req.setAttribute("theater", theater);
        req.setAttribute("showtime", showtime);
        req.setAttribute("seats", seats);
        req.setAttribute("customerName", customerName);

        req.getRequestDispatcher("/confirmation.jsp").forward(req, resp);
    }
}
