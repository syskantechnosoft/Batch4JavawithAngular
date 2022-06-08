// Global variable representing the current color of the div
let color = 'grey'

window.onload = () => {
	// Set the initial color of the div
	document.getElementById('myDiv').style.backgroundColor = color
	document.getElementById('myButton').onclick = waitForLoading
}

// This function will change the button text to "Loading..."
// and then swap the background color of the div from grey to green or vice versa.
function waitForLoading() {
	console.log('Loading...')
	document.getElementById('myButton').innerHTML = 'Loading...'
	// Wait two seconds and then change color
	setTimeout(changeColor, 2000)
}

// This function switches the color of the div
function changeColor() {
	document.getElementById('myButton').innerHTML = 'Click Me'
	
	color = color == 'grey' ? 'green' : 'grey'
	
	document.getElementById('myDiv').style.backgroundColor = color
}