<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>${workshopName}</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            color: #333;
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            background-color: #fff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.2);
            text-align: center;
            max-width: 500px;
            width: 100%;
        }

        h1 {
            color: #2c3e50;
            margin-bottom: 20px;
        }

        p {
            font-size: 16px;
            margin: 10px 0;
        }

        .message {
            color: green;
            font-weight: bold;
            margin-bottom: 15px;
        }

        form {
            margin-top: 20px;
        }

        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
            font-size: 14px;
        }

        button {
            background-color: #3498db;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 16px;
            width: 100%;
            margin-top: 10px;
        }

        button:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>${workshopName}</h1>

    <c:if test="${not empty message}">
        <p class="message">${message}</p>
    </c:if>

    <p><strong>Start Date:</strong> ${startDate}</p>
    <p><strong>Duration:</strong> ${duration}</p>
    <p><strong>Time:</strong> ${time}</p>
    <p><strong>Seats Left:</strong> ${seatsLeft}</p>
    <p><strong>Price:</strong> ₹${priceInfo.price} (${priceInfo.tier})</p>

    <form action="/register" method="post">
        <input type="text" name="name" placeholder="Full Name" required>
        <input type="email" name="email" placeholder="Email" required>
        <button type="submit">Enroll Now</button>
    </form>
</div>
</body>
</html>
