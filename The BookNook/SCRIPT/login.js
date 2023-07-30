// JavaScript code to handle form submission and AJAX request for login

document.getElementById("registrationForm").addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent default form submission

    // Collect user details from the form
    const username = document.getElementById("username").value; // Add this line to collect the username
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    // Create an object to hold user details
    const user = {
        username: username, // Add this line to include the username in the user object
        email: email,
        password: password
        
    };

    // Send AJAX request to the backend
    fetch("http://localhost:8080/api/login", {
        method: "POST", // Use POST method for login
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(user),
    })
    .then(response => {
        if (!response.ok) {
            throw new Error("Network response was not ok");
        }
        return response.json();
    })
    .then(data => {
        // Handle the response data if needed (e.g., show a success message)
        console.log("User logged in:", data);
        window.location.href = "index.html";
        // Redirect to the homepage or perform other actions on successful login
    })
    .catch(error => {
        console.error("Error logging in:", error);
        // Handle errors and show appropriate error messages to the user
    });
});

