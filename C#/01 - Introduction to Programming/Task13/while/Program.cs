// See https://aka.ms/new-console-template for more information
//request input from user
int i = 0;
int num = 0;
int sum1 = 0;

while(num!=-1)
{
    sum1+=num;
    Console.Write("Please enter a number: ");
    num = Int32.Parse(Console.ReadLine());
    i+=1;
}

//calculate average
if (i!=1)
{
    double average = sum1/(i-1);
    Console.WriteLine(average); 
}
else
{
    Console.WriteLine("Please enter at least one number");
}