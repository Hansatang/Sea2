import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextToFile
{
  public static void main(String[] args)
  {

    PrintWriter write = null;
    try
    {
      FileOutputStream fileOut = new FileOutputStream("test.txt");
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Writing data to file");
    Scanner keyboard = new Scanner(System.in);

    while (true)
    {
      String d = keyboard.nextLine();
      if (d.equals("DONE"))
      {
        break;
      }
      write.println(d);
    }

    write.close();
    System.out.println("Done writing");
  }
}
