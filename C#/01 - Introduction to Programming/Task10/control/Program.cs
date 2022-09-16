// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
//request input from user
Console.Write("What is your age? ");
int age = Convert.ToInt32(Console.ReadLine());

//print message according to age
if (age>=18)
{
    Console.Write("You are old enough!");
}
else if (age>16)
{
    Console.Write("Almost there");
}
else 
{
    Console.Write("You're just too young!");
}