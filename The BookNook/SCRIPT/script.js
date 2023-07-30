// Function to fetch package data from the backend API
function fetchPackages() {
    fetch("http://localhost:8080/api/subscription-plans")
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(packages => {
            console.log("Data successfully fetched:", packages);
            // Call the function to render the package cards in the frontend
            renderPackages(packages);
        })
        .catch(error => {
            console.error("Error fetching packages:", error);
        });

}

// Function to render the package cards in the frontend
function renderPackages(packages) {
    const packageListContainer = document.getElementById("package-list");
    packageListContainer.innerHTML = '';
}

// Call the fetchPackages function on page load
document.addEventListener("DOMContentLoaded", fetchPackages);

 
 // Function to fetch package data from the API
 function fetchPackages() {
    fetch(' ')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(packages => {
            renderPackages(packages);
        })
        .catch(error => {
            console.error('Error fetching packages:', error);
        });
}
 // Function to fetch package data from the backend API
 function fetchPackages() {
    fetch("http://localhost:8080/api/subscription-plans")
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok");
            }
            return response.json();
        })
        .then(packages => {
            console.log("Data successfully fetched:", packages);
            // Call the function to render the package cards in the frontend
            renderPackages(packages);
        })
        .catch(error => {
            console.error("Error fetching packages:", error);
        });

}

  // Function to render the package cards in the frontend
  function renderPackages(packages) {
    const packageListContainer = document.getElementById("package-list");
    packageListContainer.innerHTML = '';
}

// Function to render the package cards in the package section
function renderPackages(packages) {
    const packageListContainer = document.getElementById('package-list');
    packageListContainer.innerHTML = '';

    packages.forEach(pkg => {
        packageListContainer.innerHTML += `
        <div style="margin-bottom: 1.25rem;">
    <div style="width: 280px; height:330px;background-color: #f5f5f5; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);">
        <div style="padding: 1rem;" id="pkgdetailsp">
            <h5 style="font-size: 1.25rem; font-weight: bold;" id="pkgname">${pkg.name}</h5>
            <h6 style="font-size: 1rem; font-weight: bold;color:#007bff;" id="pkgprice">$${pkg.price.toFixed(2)}</h6>
            <div style="height:200px;">
                <p style="font-size: 1rem;height 150px;">${pkg.description}</p>
            </div>
            <button style="font-size: 1rem; padding: 0.5rem 1rem; background-color: #007bff; color: #fff; border: none; border-radius: 0.25rem;" onclick="addToCart(${pkg.id})">Add to Cart</button>
        </div>
    </div>
</div>
        `;
    });
}


// Call the fetchPackages function on page load
document.addEventListener('DOMContentLoaded', fetchPackages);