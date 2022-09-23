// See https://aka.ms/new-console-template for more information
//request input from user
Console.Write("Please enter a number: ");
int num = Int32.Parse(Console.ReadLine());
int[] range = {1,2,3,4,5,6,7,8,9,10,11,12};

foreach (int i in range)
{
    Console.WriteLine(num + " x " + i + " =  " + num*i);
}