const fighterslist = document.getElementById("fighterslist");

async function loadFighters() {
  // Fetch the list of fighters from the backend API
  // Make a GET request to the /fighters endpoint
  //
  const response = await fetch("/fighters");

  // Parse the JSON response
  // The response should be an array of fighter objects
  const fighters = await response.json();

  console.log(fighters);
}
loadFighters();
