//Task4 - conversion.java
/************************************************************/
//import java.util.*;

public class conversion
{
    public static void main(String[] args) 
    {
        //initialising variables
        double num = 99.23;
        int num2 = 23;
        int num3 = 150;
        String string1 = "100";

        //casting variables
        int fNum = (int)num;
        double iNum2 = num2;
        String iNum3 = Integer.toString(num3);
        int sString1 = Integer.parseInt(string1);

        //printing all variables
        System.out.println(fNum);
        System.out.println(iNum2);
        System.out.println(iNum3);
        System.out.println(sString1);

    }
}