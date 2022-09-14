// See https://aka.ms/new-console-template for more information

//initialise boolean variables as False
bool have_length = false;
bool up_case = false;
bool low_case = false;
bool have_num = false;

//variable for characteristics met
int count = 0;
string question = "";

//series of yes/no questions for each variable
Console.Write("Is your password at least 6 characters long? yes/no: ");
question = Console.ReadLine().ToLower();
if (question.Equals("yes"))
{
  have_length = true;
  count= count+1;
}

Console.Write("Does your password contain an Upper Cased letter? yes/no: ");
question = Console.ReadLine().ToLower();
if (question.Equals("yes"))
{
  up_case = true;
  count= count+1;
}

Console.Write("Does your password contain an Lower Cased letter? yes/no: ");
question = Console.ReadLine().ToLower();
if (question.Equals("yes"))
{
  low_case = true;
  count= count+1;
}

Console.Write("Does your password contain numbers? yes/no: ");
question = Console.ReadLine().ToLower();
if (question.Equals("yes"))
{
  have_num = true;
  count= count+1;
}

//display message based off characteristics met
if (count>=3)
{
  Console.WriteLine("Your password is suitable");
}
else
{
  Console.WriteLine("Your password is not suitable");
}