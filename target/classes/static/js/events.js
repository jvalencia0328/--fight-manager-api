const eventsList = document.getElementById("events-list");

async function loadEvents() {
  // fetch the list of events from the backend api
  // make a GET request to the /events endpoint
  const response = await fetch("/events");

  const events = await response.json();

  console.log(events);

  // clear the events list before adding new items
  eventsList.innerHTML = "";

  if (events.length === 0) {
    eventsList.innerHTML = "<p>No events found.</p>";
  } else {
    events.forEach((event) => {
      const eventDiv = document.createElement("div");
      const eventName = document.createElement("h3");
      const eventDetails = document.createElement("p");

      eventName.textContent = event.name;
      eventDetails.textContent = `Date: ${event.date}, Location: ${event.location}`;

      eventDiv.appendChild(eventName);
      eventDiv.appendChild(eventDetails);

      eventsList.appendChild(eventDiv);
    });
  }
}

loadEvents();
