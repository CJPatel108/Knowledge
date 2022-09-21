// See https://aka.ms/new-console-template for more information
//request input from user
int i = 0;
string name = "";
while (!name.Equals("stop"))
{
    Console.Write("Please enter the names of all pupils in class: ");
    name = Console.ReadLine().ToLower();
    i+=1;
}

Console.WriteLine("Number of pupils in class: " + (i-1));
