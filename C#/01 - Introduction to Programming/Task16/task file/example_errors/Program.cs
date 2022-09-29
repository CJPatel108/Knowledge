// See https://aka.ms/new-console-template for more information

// This example program is meant to demonstrate errors.

// There are some errors in this program, try run the program by pressing F5.
// Now look at the error messages and find and fix the errors.

//initialise variables
string name = "Tim";
string surname = " Jones"; //syntax error - incorrect space indentation; //possible logical error - extra spacing in beginning of string
int age = 21;

string fullMessage = name + surname + " is " + age + " years old"; //Runtime error - variable age needs to be converted to string; //syntax error - 'is' is under the wrong syntax, needs to be within quotations; //possible logical error - missing appropriate spacing between name and surname;

Console.WriteLine(fullMessage); //syntax error - missing parenthesis;