package com.movies.data;

import com.movies.model.Movie;
import com.movies.model.Showtime;
import com.movies.model.Theater;

import java.util.*;

public class DataStore {

    public static final List<Movie> MOVIES = new ArrayList<>();
    public static final List<Theater> THEATERS = new ArrayList<>();
    public static final Map<Integer, List<Showtime>> SHOWTIMES = new HashMap<>();

    static {
        // ---------- MOVIES (Telugu) ----------
        MOVIES.add(new Movie(1, "Kalki 2898 AD", "Telugu", "Sci-Fi / Mythology",
                "3h 01m", "9.2", "https://image.tmdb.org/t/p/w500/8fYQ0gQyP0cVQjcp4pPmjJqQFdA.jpg"));
        MOVIES.add(new Movie(2, "Pushpa 2: The Rule", "Telugu", "Action / Drama",
                "3h 20m", "8.9", "https://image.tmdb.org/t/p/w500/kJ1a6bYtNVpWn1d1v5p1eFhKvY9.jpg"));
        MOVIES.add(new Movie(3, "Salaar: Part 1", "Telugu", "Action / Thriller",
                "2h 55m", "8.4", "https://image.tmdb.org/t/p/w500/7T6tR2C9hY1kP3vB5gLxQnCwY8f.jpg"));
        MOVIES.add(new Movie(4, "Devara: Part 1", "Telugu", "Action / Drama",
                "2h 45m", "8.1", "https://image.tmdb.org/t/p/w500/9Y1cVk8pR3mT5nB7gLxQnCwY2h.jpg"));
        MOVIES.add(new Movie(5, "Guntur Kaaram", "Telugu", "Action / Comedy",
                "2h 25m", "7.5", "https://image.tmdb.org/t/p/w500/3rT9pL1vB7cY5nG2mQxNkCwJ8f.jpg"));

        // ---------- THEATERS ----------
        // Hyderabad
        THEATERS.add(new Theater(1, "Prasads IMAX", "Hyderabad", "NTR Marg, Khairatabad"));
        THEATERS.add(new Theater(2, "PVR Forum Mall", "Hyderabad", "Kukatpally, Hyderabad"));
        THEATERS.add(new Theater(3, "INOX GVK One", "Hyderabad", "Banjara Hills, Hyderabad"));
        THEATERS.add(new Theater(4, "Asian Cinemas", "Hyderabad", "Attapur, Hyderabad"));

        // Visakhapatnam
        THEATERS.add(new Theater(5, "INOX CMR Central", "Visakhapatnam", "Maddilapalem, Vizag"));
        THEATERS.add(new Theater(6, "PVR Vizag", "Visakhapatnam", "NAD Junction, Vizag"));
        THEATERS.add(new Theater(7, "Mukta A2 Cinemas", "Visakhapatnam", "Dwaraka Nagar, Vizag"));

        // Parvathipuram
        THEATERS.add(new Theater(8, "Sri Venkateswara Theatre", "Parvathipuram", "Main Road, Parvathipuram"));
        THEATERS.add(new Theater(9, "Sai Krishna Theatre", "Parvathipuram", "Bus Stand Road, Parvathipuram"));

        // Vizianagaram
        THEATERS.add(new Theater(10, "Sri Rama Theatre", "Vizianagaram", "Fort Road, Vizianagaram"));
        THEATERS.add(new Theater(11, "Radhika Theatre", "Vizianagaram", "GNT Road, Vizianagaram"));

        // Srikakulam
        THEATERS.add(new Theater(12, "Sri Sai Theatre", "Srikakulam", "GT Road, Srikakulam"));
        THEATERS.add(new Theater(13, "Gowri Theatre", "Srikakulam", "Seven Road Junction, Srikakulam"));

        // ---------- SHOWTIMES (per movie) ----------
        List<Showtime> standard = Arrays.asList(
                new Showtime("10:00 AM", 120),
                new Showtime("01:30 PM", 150),
                new Showtime("06:00 PM", 180),
                new Showtime("09:30 PM", 200)
        );
        for (Movie m : MOVIES) {
            SHOWTIMES.put(m.getId(), standard);
        }
    }

    public static List<Theater> theatersByLocation(String location) {
        List<Theater> result = new ArrayList<>();
        if (location == null || location.isEmpty()) return THEATERS;
        for (Theater t : THEATERS) {
            if (t.getLocation().equalsIgnoreCase(location)) result.add(t);
        }
        return result;
    }

    public static Set<String> allLocations() {
        Set<String> locs = new LinkedHashSet<>();
        for (Theater t : THEATERS) locs.add(t.getLocation());
        return locs;
    }

    public static Movie movieById(int id) {
        for (Movie m : MOVIES) if (m.getId() == id) return m;
        return null;
    }

    public static Theater theaterById(int id) {
        for (Theater t : THEATERS) if (t.getId() == id) return t;
        return null;
    }
}
