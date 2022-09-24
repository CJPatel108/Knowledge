// See https://aka.ms/new-console-template for more information
//request input from user
Console.Write("What year do you want to start with?\t");
int startYear = Int32.Parse(Console.ReadLine());
Console.Write("How many years do you want to check?\t");
int years = Int32.Parse(Console.ReadLine());
Console.WriteLine();

int[] range = new int[years];
for (int i = 0; i < years; i++)
{
    range[i]= startYear+i;
}

//determine if year is a leap year or not
foreach (int i in range)
{
    if (i%4==0)
    {
        Console.WriteLine(i + " is a leap year");
    }
    else
    {
        Console.WriteLine(i + " isn't a leap year");
    }
}