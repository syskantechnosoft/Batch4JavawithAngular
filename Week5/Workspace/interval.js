let seconds = 0
// declare the intervalVariable for later use.
let intervalVariable = null

window.onload = () => {
	// Set the initial color of the div
	document.getElementById('start').onclick = start
	document.getElementById('stop').onclick = stop
}

// This function will create the interval
function start() {
	seconds = 0
	document.getElementById('time').innerHTML = '0:00'
	intervalVariable = setInterval(tickUp, 1000)
}

// This function will iterate the timer.
function tickUp() {
	seconds = seconds + 1
	timer = `${Math.floor(seconds/60)}:${new String(seconds%60).padStart(2, '0')}`
	document.getElementById('time').innerHTML = timer
}

// This function clears the interval
function stop() {
	clearInterval(intervalVariable)
}
