const fightersList = document.getElementById("fighters-list");

async function loadFighters() {
  // Fetch the list of fighters from the backend API
  // Make a GET request to the /fighters endpoint
  const response = await fetch("/fighters");

  // Parse the JSON response
  // The response should be an array of fighter objects
  const fighters = await response.json();

  // Check what came back from the backend
  console.log(fighters);

  // Clear the fighters list before adding new items
  fightersList.innerHTML = "";

  // First check if the array is empty
  if (fighters.length === 0) {
    fightersList.innerHTML = "<p>No fighters found.</p>";
  } else {
    // If the array is not empty, loop through each fighter
    fighters.forEach((fighter) => {
      // Create a div element for each fighter
      const fighterDiv = document.createElement("div");

      // Create an h3 element for the fighter name
      const fighterName = document.createElement("h3");

      // Create a paragraph element for the fighter details
      const fighterDetails = document.createElement("p");

      // Set the fighter name text
      fighterName.textContent = fighter.name;

      // Set the fighter details text
      fighterDetails.textContent =
        "Nickname: " +
        fighter.nickname +
        ", Weight Class: " +
        fighter.weightClass +
        ", Wins: " +
        fighter.wins +
        ", Losses: " +
        fighter.losses +
        ", Draws: " +
        fighter.draws;

      // Add the name and details to the fighter div
      fighterDiv.appendChild(fighterName);
      fighterDiv.appendChild(fighterDetails);

      // Add the fighter div to the fighters list container
      fightersList.appendChild(fighterDiv);
    });
  }
}

// Call the function when the page loads
loadFighters();
