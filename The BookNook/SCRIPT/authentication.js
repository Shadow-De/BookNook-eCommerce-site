document.addEventListener("DOMContentLoaded", function () {
    // Function to handle form submission
    document.getElementById("loginForm").addEventListener("submit", function (event) {
        event.preventDefault(); // Prevent default form submission

        // Collect user details from the form
        const email = document.getElementById("email").value;
        const password = document.getElementById("password").value;

        // Mock authentication: Check if email and password match hardcoded values
        if (email === "saka@gmail.com" && password === "saka123") {
            // Authentication successful
            console.log("User logged in:", email);
            // Redirect to the homepage or perform other actions on successful login
            window.location.href = "index.html";
        } else {
            // Authentication failed
            console.error("Login failed. Please check your email and password.");
            // Handle errors and show appropriate error messages to the user
            // Display the error message on the login form
            const errorMessage = document.getElementById("error-message");
            errorMessage.textContent = "Login failed. Please check your email and password.";
        }
    });
});
