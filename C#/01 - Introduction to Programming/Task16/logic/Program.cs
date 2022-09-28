// See https://aka.ms/new-console-template for more information
//request user input
Console.WriteLine("Please enter time taken to finish lap1 in seconds: ");
string lap1 = Console.ReadLine(); //logical error - needs to be converted to int
Console.WriteLine("Please enter time taken to finish lap2 in seconds: ");
string lap2 = Console.ReadLine(); //logical error - needs to be converted to int
Console.WriteLine("Please enter time taken to finish lap3 in seconds: ");
string lap3 = Console.ReadLine(); //logical error - needs to be converted to int

string duration = lap1 + lap2 + lap3; //logical error - adding three string variables

Console.WriteLine("Total time taken to complete race: " + duration); //logical error - variable duration's output value is equivalent to a mesh of variables lap1,lap2 and lap3
        