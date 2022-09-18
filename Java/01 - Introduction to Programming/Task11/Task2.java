import java.util.*;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        //initialise variable to equal pi
        double pi = Math.PI;
        String shape = "";
        double length;
        double width;
        double radius;
        double area;

        //request input from user
        System.out.print("Please enter the shape of the building. Square, rectangular or round? ");
        shape = keyboardInput.nextLine().toLowerCase();

        //request dimensions of square and calculate area
        if (shape.equals("square"))
        {
             System.out.print("Please enter length: ");
             length = Double.parseDouble(keyboardInput.nextLine());
             area = length*length;
             System.out.println("Area: " + area);
        }

        //request dimensions of rectangular shape and calculate area
        if (shape.equals("rectangular"))
        {
             System.out.print("Please enter length: ");
             length = Double.parseDouble(keyboardInput.nextLine());
             System.out.print("Please enter width: ");
             width = Double.parseDouble(keyboardInput.nextLine());
             area = length*width;
             System.out.println("Area: " + area);
        }

        //request dimensions of round shape and calculate area
        if (shape.equals("round"))
        {
             System.out.print("Please enter radius: ");
             radius = Double.parseDouble(keyboardInput.nextLine());
             area = pi*(radius*radius);
             System.out.println("Area: " + area);
        }

        keyboardInput.close();
    }
}