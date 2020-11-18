import java.io.*;

public class uczenTest
{
  public static void main(String[] args)
  {
    try
    {
      FileOutputStream fileOut = new FileOutputStream("obj.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      write.writeObject(new Uczen("Allan", "mark","marki"));
      write.writeObject(new Uczen("Bob", "dark","darki"));
      write.writeObject(new Uczen("Carl", "kark","karki"));
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
      System.exit(1);
    }
    System.out.println("Done writing");

    try
    {
      FileInputStream fileIn = new FileInputStream("obj.bin");
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while (true)
      {
        try
        {
          Uczen person = (Uczen) read.readObject();
          System.out.println(person);
        }
        catch (EOFException eof)
        {
          System.out.println("End of file");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
      System.exit(1);
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
      System.exit(1);
    }
  }
  }


