<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Booking Confirmed</title>
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
        <div class="confirm-card">
            <div class="check">✓</div>
            <h2>Booking Confirmed!</h2>
            <p style="color:#6c757d;">Your tickets have been booked successfully.</p>

            <div class="details">
                <div><span>Name</span><strong>${customerName}</strong></div>
                <div><span>Movie</span><strong>${movie.title}</strong></div>
                <div><span>Theater</span><strong>${theater.name}</strong></div>
                <div><span>Location</span><strong>${theater.location}</strong></div>
                <div><span>Showtime</span><strong>${showtime}</strong></div>
                <div><span>Seats</span><strong>${seats}</strong></div>
            </div>

            <a href="${pageContext.request.contextPath}/home" class="btn-primary">Book Another</a>
        </div>
    </div>
</section>

<footer>&copy; 2026 AP Movie Booking</footer>

</body>
</html>
