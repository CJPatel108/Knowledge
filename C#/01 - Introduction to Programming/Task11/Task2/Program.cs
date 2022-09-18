// See https://aka.ms/new-console-template for more information
//initialise variable to equal pi
double pi = Math.PI;
string shape = "";
double length;
double width;
double radius;
double area;

//request input from user
Console.Write("Please enter the shape of the building. Square, rectangular or round? ");
shape = Console.ReadLine().ToLower();

//request dimensions of square and calculate area
if (shape.Equals("square"))
{
        Console.Write("Please enter length: ");
        length = Convert.ToDouble(Console.ReadLine());
        area = length*length;
        Console.WriteLine("Area: " + area);
}

//request dimensions of rectangular shape and calculate area
if (shape.Equals("rectangular"))
{
        Console.Write("Please enter length: ");
        length = Convert.ToDouble(Console.ReadLine());
        Console.Write("Please enter width: ");
        width = Convert.ToDouble(Console.ReadLine());
        area = length*width;
        Console.WriteLine("Area: " + area);
}

//request dimensions of round shape and calculate area
if (shape.Equals("round"))
{
        Console.Write("Please enter radius: ");
        radius = Convert.ToDouble(Console.ReadLine());
        area = pi*(radius*radius);
        Console.WriteLine("Area: " + area);
}
