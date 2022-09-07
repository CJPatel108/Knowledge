// See https://aka.ms/new-console-template for more information
double num = 99.23;
int num2 = 23;
int num3 = 150;
string string1 = "100";

//casting variables
int fNum = (int)num;
double iNum2 = Convert.ToDouble(num2);
string iNum3 = num3.ToString();
int sString1 = Int32.Parse(string1);

//printing all variables
Console.WriteLine(fNum);
Console.WriteLine(iNum2);
Console.WriteLine(iNum3);
Console.WriteLine(sString1);
