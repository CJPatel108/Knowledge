//CJ Patel
//Task3 - myVariables.js (Compulsory Task 1)
//------------------------------------------------------------
//initialising integer variables
let myFirstNumber = 6;
let mySecondNumber = 5;
//initialising string variables
let myFirstString = "This is my first string.";
let mySecondString = "This is my second string!";
//initialising a boolean variable
let myBoolean = true;

const multiplicationResult = myFirstNumber * mySecondNumber;

const concatenatedString = myFirstString + " " + mySecondString;

//display output - output a multiline string by using a template literal
console.log(`The ${typeof myBoolean} is: ${myBoolean}
The first ${typeof myFirstNumber} is: ${myFirstNumber}
The second ${typeof mySecondNumber} is: ${mySecondNumber}
${myFirstNumber} x ${mySecondNumber} = ${multiplicationResult}
The first ${typeof myFirstString} is: ${myFirstString}
The second ${typeof mySecondString} is: ${mySecondString}
These two together make: ${concatenatedString}`);