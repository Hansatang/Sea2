import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class xmlWriter
{
  public static void main(String[] args)
  {

    ArrayList<Uczen> list = new ArrayList<Uczen>();
    list.add(new Uczen("Allan", "mark", "marki"));
    list.add(new Uczen("Bob", "dark", "darki"));
    list.add(new Uczen("Carl", "kark", "karki"));

    PrintWriter write = null;
    try
    {
      FileOutputStream fileOut = new FileOutputStream("margi.xml");
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Writing data to file");
    write.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?> <students>");
    for (int i = 0; i < list.size(); i++)
    {
      write.println(list.get(i));
    }
    write.println("</students>");
    write.close();
    System.out.println("Done writing");

    Scanner read = null;

    try
    {
      FileInputStream fileIn = new FileInputStream("margi.xml");
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Text in file:");
    while (read.hasNext())
    {
      System.out.println(read.nextLine());
    }
    read.close();
  }
}
   /* try
    {
      FileOutputStream fileOut = new FileOutputStream("obj.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      //write.writeUTF("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<students>");
      for (int i = 0; i < list.size(); i++)
      {
        write.writeObject(list.get(i));
      }

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
         //System.out.println(read.readUTF());
          Uczen person = (Uczen) read.readObject();
         // System.out.println(person);
          list2.add(person);
          System.out.println(list2.size());


          for (int i = 0; i < list2.size(); i++)
          {
            System.out.println(list2.get(i).toString());
          }
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



    */
