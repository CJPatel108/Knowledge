// See https://aka.ms/new-console-template for more information
//request input from user
Console.Write("Please enter a number: ");
int num = Int32.Parse(Console.ReadLine());

//initialising first even number as 2
int even = 2;

//prints out all even numbers from 1 up to and possibly including num
while (even<=num)
{
    Console.WriteLine(even);
    even+=2;
}