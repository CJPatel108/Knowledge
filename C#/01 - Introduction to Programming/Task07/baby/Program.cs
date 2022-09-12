// See https://aka.ms/new-console-template for more information

//request input from user
Console.WriteLine("Please enter the year that you were born in: ");
int DOY = Int32.Parse(Console.ReadLine());

//calculation of age and display appropriate message
if (2020-DOY >= 18)
{
    Console.WriteLine("Congrats you are old enough");
}
// else
// {
//     Console.WriteLine("You are too young");
// }