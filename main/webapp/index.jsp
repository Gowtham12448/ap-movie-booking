<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AP Movie Booking — Book Telugu Cinema Tickets</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<header>
    <div class="container header-inner">
        <div class="brand">🎬 AP<span>MovieBooking</span></div>
        <nav class="nav">
            <a href="${pageContext.request.contextPath}/home">Home</a>
            <a href="${pageContext.request.contextPath}/booking">Book Now</a>
        </nav>
    </div>
</header>

<section class="hero">
    <div class="container">
        <h1>Book <span>Telugu Cinema</span> Tickets</h1>
        <p>Hyderabad • Visakhapatnam • Vizianagaram • Srikakulam • Parvathipuram</p>
    </div>
</section>

<section class="section">
    <div class="container">
        <h2>Choose Your City</h2>
        <div class="locations">
            <c:forEach var="loc" items="${locations}">
                <div class="loc-chip">${loc}</div>
            </c:forEach>
        </div>
    </div>
</section>

<section class="section">
    <div class="container">
        <h2>Now Showing — Telugu</h2>
        <div class="movie-grid">
            <c:forEach var="m" items="${movies}">
                <div class="movie-card">
                    <img src="${m.poster}" alt="${m.title}">
                    <div class="info">
                        <h3>${m.title}</h3>
                        <div class="meta">${m.genre} • ${m.duration}</div>
                        <div class="rating">⭐ ${m.rating}</div>
                        <a class="btn" href="${pageContext.request.contextPath}/booking?movieId=${m.id}">Book Tickets</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>

<footer>
    &copy; 2026 AP Movie Booking — Telugu Cinema, Simplified.
</footer>

</body>
</html>
