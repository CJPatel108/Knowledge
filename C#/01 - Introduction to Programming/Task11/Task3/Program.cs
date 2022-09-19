// See https://aka.ms/new-console-template for more information
double swimming;
double cycling;
double running;
double total_time;

//request input from user
Console.Write("Please enter time taken to complete swimming: ");
swimming = Convert.ToDouble(Console.ReadLine());
Console.Write("Please enter time taken to complete cycling: ");
cycling = Convert.ToDouble(Console.ReadLine());
Console.Write("Please enter time taken to complete running: ");
running = Convert.ToDouble(Console.ReadLine());

//calculate and diplay of total time taken
total_time = swimming + cycling + running;
Console.WriteLine("Total Time Taken: " + total_time);

//determine and display award
if (total_time<=100)
{
    Console.WriteLine("Award: Provincial Colours");
}
else if (total_time<=105)
{
    Console.WriteLine("Award: Provincial Half Colours");
}
else if (total_time<=110)
{
    Console.WriteLine("Award: Provincial Scroll");
}
else
{
    Console.WriteLine("Award: No award");
}
