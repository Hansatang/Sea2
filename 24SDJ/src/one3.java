import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class one3
{
  public static void main(String[] args)
  {
    try
    {
      FileOutputStream fileOut = new FileOutputStream("test.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      System.out.println("Writing data to file");
      Scanner keyboard = new Scanner(System.in);
      int amount = keyboard.nextInt();
      for (int i = 0; i < amount; i++)
      {
        Random rand = new Random();
        int n = rand.nextInt(10);
        write.writeInt(n);
      }

      write.close();
      System.out.println("Done writing");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      e.printStackTrace();
      System.out.println("IO Error writing to file ");
      System.exit(1);
      ;
    }

  }
}

