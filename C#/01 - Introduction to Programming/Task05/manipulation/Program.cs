// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
//request input from user
Console.WriteLine("Please enter a sentence: ");
string str_manip = "This sentence contains words";
//string str_manip = Console.ReadLine();

//determine and display length of variable str_manip
int length = str_manip.Length;
Console.WriteLine(length);

//determine last character of variable str_manip and replace all occurences of the character in the variable str_manip
char last = str_manip[length-1];
Console.WriteLine(str_manip.Replace(last, '@'));

//determine and print the last 3 characters of the variable str_manip backwards
string last3 = str_manip.Substring(length-3, 3);
for (int i = last3.Length-1; i >= 0; i--)
{
    Console.Write(last3[i]);
}
Console.WriteLine();

//create and print a 5-letter word consisting of the first 3 the characters and the last 2 characters of the variable str_manip
string newWord =str_manip.Substring(0,3) + str_manip.Substring(length-2, 2);
Console.WriteLine(newWord);

//display each word in the variable str_manip on a new line
Console.WriteLine(str_manip.Replace(" ", "\n"));