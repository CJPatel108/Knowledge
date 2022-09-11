// See https://aka.ms/new-console-template for more information
Console.WriteLine();
//request input from user
Console.Write("Please enter an integer for num1: ");
int num1 = Int32.Parse(Console.ReadLine());
Console.Write("Please enter an integer for num2: ");
int num2 = Int32.Parse(Console.ReadLine());
Console.Write("Please enter an integer for num3: ");
int num3 = Int32.Parse(Console.ReadLine());

//sum of all numbers
Console.WriteLine(num1+num2+num3);

//num1 minus num2
Console.WriteLine(num1-num2);

//num3 multiplied by num1
Console.WriteLine(num3*num1);

//sum of all three numbers divided by num3
Console.WriteLine((num1+num2+num3)/num3);