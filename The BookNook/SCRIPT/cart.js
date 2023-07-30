document.getElementById("registrationForm").addEventListener("submit", function (event) {
    event.preventDefault(); // Prevent default form submission

        // Collect user details from the form
        const itemname = document.getElementById("pkgname").value; // Add this line to collect the username
        const itemprice = document.getElementById("pkgprice").value;
      
        const cartitm = {
            username: username, // Add this line to include the username in the user object
            email: email,
            password: password};
            
        });