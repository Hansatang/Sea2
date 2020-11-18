import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class htmlWriter
{

  public static void main(String[] args)
  {
    Scanner read = null;
    ArrayList<String> extension = new ArrayList<>();
    ArrayList<Uczen> list = new ArrayList<Uczen>();
    list.add(new Uczen("Allan", "mark", "marki"));
    list.add(new Uczen("Bob", "dark", "darki"));
    list.add(new Uczen("Carl", "kark", "karki"));

    try
    {
      FileInputStream fileIn = new FileInputStream("template.html");
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
      String line = read.nextLine();
      if (line.contains("$title"))
      {
        line = line.replace("$title", "Student List");
      }
      if (line.contains("$tableHeader1"))
      {
        line = line.replace("$tableHeader1", "Name");
      }
      if (line.contains("$tableHeader2"))
      {
        line = line.replace("$tableHeader2", "Country");
      }
      if (line.contains("$header"))
      {
        line = line.replace("$header", "Student list");
      }
      if (line.contains("$paragraph"))
      {
        line = line.replace("$paragraph", "Example");
      }


      String str2="<tr>";
      if (line.contains("<tr><td>"))
      {
        String str = "<td>"+list.get(0).getFirstName() + " " + list.get(0).getLastName()+"</td>"+"<td>"+list.get(0).getCountry()+"</td>";
        line = line.replace("<td>$tableData1</td><td>$tableData2</td>", str);
          for (int i = 1; i < list.size(); i++)
          {
            str2 += "\n<tr><td>"+list.get(i).getFirstName() + " " + list.get(i).getLastName()+"</td>"+"<td>"+list.get(i).getCountry()+"</td></tr>";
        }
          line = line.replace("</tr>", str2);

      }


      System.out.println(line);
      extension.add(line);
    }
    read.close();

    PrintWriter write = null;
    try
    {
      FileOutputStream fileOut = new FileOutputStream("extension.html");
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Writing data to file");

    for (int i = 0; i < extension.size() ; i++)
    {
      write.println(extension.get(i));
    }

    write.close();
    System.out.println("Done writing");
  }
}

