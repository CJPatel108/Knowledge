// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
string text = System.IO.File.ReadAllText("DOB.txt");

Console.WriteLine(text);

string [] lines = System.IO.File.ReadAllLines("DOB.txt");
foreach (string line in lines)
{
    Console.WriteLine("\t + line");
}