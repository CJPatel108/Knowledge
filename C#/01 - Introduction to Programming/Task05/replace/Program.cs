// See https://aka.ms/new-console-template for more information
//declare string
string single_string = "The!quick!brown!fox!jumps!over!the!lazy!dog!";
//replace exclamation mark characters with space character and print
Console.WriteLine(single_string.Replace("!"," "));
//further convert string to uppercase and print
Console.WriteLine(single_string.Replace("!"," ").ToUpper());
//further print the sentence into reverse
string reverseSingleString = single_string.Replace("!"," ").ToUpper();
for (int i = reverseSingleString.Length-1; i >= 0; i--)
{
    Console.Write(reverseSingleString[i]);
}
Console.WriteLine();
//reverse original string variable
for (int i = single_string.Length-1; i >= 0; i--)
{
    Console.Write(single_string[i]);
}