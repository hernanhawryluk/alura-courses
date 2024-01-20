function assignElementDOM(element, text) {
  const title = document.querySelector(element);
  title.innerHTML = text;
  return;
}

function verifyNumber() {
  let userNumber = parseInt(document.getElementById("userNumber").value);
  if (userNumber === secretNumber) {
    assignElementDOM(
      "p",
      `You are right, the number was ${secretNumber}, you guessed in ${intents} ${
        intents > 1 ? "attempts" : "attempt"
      }.`
    );
    document.getElementById("restart").removeAttribute("disabled");
  } else {
    if (userNumber < secretNumber) {
      assignElementDOM("p", `Wrong, the number is higher than ${userNumber}`);
    } else if (userNumber > secretNumber) {
      assignElementDOM("p", `Wrong, the number is lower than ${userNumber}`);
    } else if (userNumber < 1 || userNumber > maximunNumber) {
      assignElementDOM(
        "p",
        `The number must be between 1 and ${maximunNumber}`
      );
      return;
    }
    intents++;
    cleanBox();
  }
}

function cleanBox() {
  const input = document.querySelector("#userNumber");
  input.value = "";
  input.focus();
}

function generateRandomNumber() {
  const randomNumber = Math.floor(Math.random() * 10) + 1;
  if (doneNumbers.length === maximunNumber) {
    doneNumbers = [];
  }
  if (doneNumbers.includes(randomNumber)) {
    return generateRandomNumber();
  } else {
    doneNumbers.push(randomNumber);
    return randomNumber;
  }
}

function initialConfiguration() {
  assignElementDOM("h1", "Game of the Secret Number");
  assignElementDOM("p", `Enter a number between 1 and ${maximunNumber}`);
  intents = 1;
  secretNumber = generateRandomNumber();
}

function restartGame() {
  cleanBox();
  initialConfiguration();
  document.getElementById("restart").setAttribute("disabled", true);
}

let intents;
let secretNumber;
let doneNumbers = [];
let maximunNumber = 10;
initialConfiguration();
