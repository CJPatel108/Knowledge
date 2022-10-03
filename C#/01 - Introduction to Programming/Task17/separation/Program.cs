// See https://aka.ms/new-console-template for more information
//request input from user
Console.WriteLine("Please enter a value for a string variable: ");
string original = Console.ReadLine();

//replace all space characters with newline
string separation = original.Replace(" ", "\n");

//display result
Console.WriteLine(separation);