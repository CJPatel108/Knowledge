import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class compulsory_task
{
    public static void main(String[] args)
    {
        String data;
        try
        {
            File filename = new File("DOB.txt");
            Scanner myReader = new Scanner(filename);
            while(myReader.hasNextLine())
            {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e)
        {
                System.out.println("An error has occurred");
                e.printStackTrace();
        }

    }
}