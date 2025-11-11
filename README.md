Project Title: Digiskill Academy Workshop Landing Page

Description:
Developed a dynamic full-stack web application for the Digiskill Academy workshop featuring real-time seat tracking, automated pricing updates, and waitlist management. The system determines the correct workshop price based on current seat availability and allows users to enroll or join a waitlist when the event reaches capacity.

Key Features:

Responsive landing page displaying live workshop details such as session time, start date, and seat count.

Dynamic pricing logic:

Early Bird Price when more than 10 seats remain.

Standard Price when 10 or fewer seats are left.

RESTful backend API providing real-time workshop data and handling user registration.

Automatic registration ID generation for each successful enrollment.

Waitlist feature activates automatically when all 20 seats are filled.

Real-time frontend updates based on API responses (seat count and price).

Tech Stack:

Frontend: HTML, CSS, JavaScript (or React)

Backend: Spring Boot (Java)

Database: H2 In-Memory Database (for managing seats, registrations, and waitlist data)

API Communication: REST APIs for live data exchange

Outcome:
Built a fully functional and interactive landing page that connects to a Spring Boot backend, dynamically manages enrollments, pricing, and seat availability — all backed by an in-memory H2 database for quick testing and demonstration.
