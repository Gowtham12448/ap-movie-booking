<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Tickets — AP Movie Booking</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<header>
    <div class="container header-inner">
        <div class="brand">🎬 AP<span>MovieBooking</span></div>
        <nav class="nav">
            <a href="${pageContext.request.contextPath}/home">Home</a>
        </nav>
    </div>
</header>

<section class="section">
    <div class="container">
        <h2>Book Your Tickets</h2>

        <c:if test="${not empty movie}">
            <div class="form-card" style="margin-bottom:24px;">
                <strong>Selected Movie:</strong> ${movie.title} <br>
                <strong>Language:</strong> ${movie.language} • <strong>Rating:</strong> ⭐ ${movie.rating}
            </div>
        </c:if>

        <form class="form-card" method="post" action="${pageContext.request.contextPath}/booking">
            <label>Movie</label>
            <select name="movieId" required>
                <option value="">-- Select Movie --</option>
                <c:forEach var="m" items="${applicationScope.movieList}">
                    <option value="${m.id}" ${movie != null && movie.id == m.id ? 'selected' : ''}>${m.title}</option>
                </c:forEach>
            </select>

            <label>Location</label>
            <select name="location" required>
                <option value="">-- Select Location --</option>
                <option value="Hyderabad">Hyderabad</option>
                <option value="Visakhapatnam">Visakhapatnam</option>
                <option value="Vizianagaram">Vizianagaram</option>
                <option value="Srikakulam">Srikakulam</option>
                <option value="Parvathipuram">Parvathipuram</option>
            </select>

            <label>Theater</label>
            <select name="theaterId" required>
                <option value="">-- Select Theater --</option>
                <c:forEach var="t" items="${theaters}">
                    <option value="${t.id}">${t.name} — ${t.address}</option>
                </c:forEach>
            </select>

            <label>Showtime</label>
            <select name="showtime" required>
                <option value="">-- Select Showtime --</option>
                <c:forEach var="s" items="${showtimes}">
                    <option value="${s.time}">${s.time} — ₹${s.price}</option>
                </c:forEach>
            </select>

            <label>Number of Seats</label>
            <input type="number" name="seats" min="1" max="10" value="2" required>

            <label>Your Name</label>
            <input type="text" name="customerName" placeholder="Enter your full name" required>

            <button type="submit" class="btn-primary">Confirm Booking</button>
        </form>
    </div>
</section>

<footer>&copy; 2026 AP Movie Booking</footer>

</body>
</html>
