import java.util.*;

public class bmi_task
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //request input from user
        System.out.print("Please enter your weight in kg: ");
        double weight = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter your height in m: ");
        double height = Double.parseDouble(keyboardInput.nextLine());
        
        //calculate bmi
        double bmi = weight/(height*height);
        
        //display bmi and category associated
        if (bmi >=30)
        {
            System.out.print("BMI: " + bmi + " - user is obese");
        }
        else if (bmi >=25)
        {
            System.out.print("BMI: " + bmi + " - user is overweight");
        }
        else if (bmi >=18.5)
        {
            System.out.print("BMI: " + bmi + " - user is normal");
        }
        else if (bmi <18.5)
        {
            System.out.print("BMI: " + bmi + " - user is underweight");
        }
            
        keyboardInput.close();
    }
}