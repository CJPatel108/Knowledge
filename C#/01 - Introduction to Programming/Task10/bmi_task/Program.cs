// See https://aka.ms/new-console-template for more information
//request input from user
Console.Write("Please enter your weight in kg: ");
double weight = Convert.ToDouble(Console.ReadLine());
Console.Write("Please enter your height in m: ");
double height = Convert.ToDouble(Console.ReadLine());

//calculate bmi
double bmi = weight/(height*height);

//display bmi and category associated
if (bmi >=30)
{
    Console.WriteLine("BMI: " + bmi + " - user is obese");
}
else if (bmi >=25)
{
    Console.WriteLine("BMI: " + bmi + " - user is overweight");
}
else if (bmi >=18.5)
{
    Console.WriteLine("BMI: " + bmi + " - user is normal");
}
else if (bmi <18.5)
{
    Console.WriteLine("BMI: " + bmi + " - user is underweight");
}