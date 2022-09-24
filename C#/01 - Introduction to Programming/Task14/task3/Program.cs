// See https://aka.ms/new-console-template for more information
//while loop displaying countdown from 20 to 0
int i = 20;
while (i>-1)
{
    Console.WriteLine(i);
    i=i-1;
}
Console.WriteLine();

//loop that will display all even numbers between 1 and 20
for (int j = 0; j <= 20; j++)
        {
            if(j%2==0)
            {
                Console.WriteLine(j);
            }
        }
        Console.WriteLine();

//loop for pattern
for (int k = 1; k <= 5; k++)
{
    for (int l = 0; l < k; l++)
    {
        Console.Write('*');
    }
    Console.WriteLine();
}
Console.WriteLine();

//determine the greatest common divisor/highest common factor of 2 positive integers
//request input from user
Console.Write("Please enter a positive integer for num1: ");
int num1 = Int32.Parse(Console.ReadLine());
Console.Write("Please enter a positive integer for num2: ");
int num2 = Int32.Parse(Console.ReadLine());
int temp;
//sort smallest to biggest
if (num1>num2)
{
    temp = num1;
    num1 = num2;
    num2 = temp;
}
Console.WriteLine("Smallest: " + num1);
Console.WriteLine("Biggest: " + num2);

//determine gcd
int gcd = 0;
for (int j = 1; j < num1+1; j++)
{
    if (num1%j==0 && num2%j==0)
    {
        gcd = j;
    }
}
Console.WriteLine("GCD: " + gcd);
