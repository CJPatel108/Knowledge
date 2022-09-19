// See https://aka.ms/new-console-template for more information
int num;
//request input from user
Console.Write("Please enter an integer: ");
num = Int32.Parse(Console.ReadLine());

//determine if num is divisible by 2 and 5, by 2 or 5, or by neither
if (num%2==0 && num%5==0)
{
    Console.WriteLine(num + " is divisible by 2 and 5");
}
else if (num%2==0 || num%5==0)
{
    Console.WriteLine(num + " is divisible by 2 or 5");
}
else
{
    Console.WriteLine(num + " is not divisible by 2 or 5");
}