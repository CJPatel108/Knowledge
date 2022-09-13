// See https://aka.ms/new-console-template for more information


//request input from user
Console.Write("Please enter your full name: ");
string full_name = Console.ReadLine();

//validation check
if (full_name=="")
{
    Console.WriteLine("You haven't entered anything. Please enter your full name");
}
else if (full_name.Length<4)
{
    Console.WriteLine("You have entered less than 4 characters. Please make sure that you have entered your name and surname");
}
else if (full_name.Length>25)
{
    Console.WriteLine("You have entered more than 25 characters. Please make sure that you have only entered your full name");
}
else
{
    Console.WriteLine("Thank you for entering your name");
}