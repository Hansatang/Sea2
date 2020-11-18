import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class Tester
{
  public ArrayList<Project> projects;

  public Tester()
  {
    this.projects = new ArrayList<Project>();
  }

  public ArrayList<Project> search(String str)
  {
    ArrayList<Project> proj = new ArrayList<>();
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).projectDescription.contains(str))
      {
        proj.add(projects.get(i));
      }
    }
    return proj;
  }

  public static void main(String[] args) throws IOException
  {
    Tester boss = new Tester();
    Project p0 = new Project();
    for (int i = 0; i < 5; i++)
    {
      File temp = new File(
          "C:\\Users\\krzys\\Desktop\\Test2\\SaveFull" + i + "");
      boolean exists = temp.exists();
      if (exists)
      {
        p0.FullRead(i);
        Project p1 = (Project) p0.FullRead(i);
        boss.projects.add(p1);
      }
      else
      {
        break;
      }
    }






  /* Project p1 = new Project();
    boss.projects.add(p1);
    Project p2 = new Project();
    boss.projects.add(p2);



   */

    boss.projects.get(1).setProjectDescription("malpy");
    //  p0.FullRead();

    // Project p1 = (Project) p0.FullRead();
    //  System.out.println(boss.projects.get(0).toString());

    boss.projects.get(0).setProjectDescription("roboty");

    ArrayList<Member> ms1 = new ArrayList<>();

    try
    {

      FileInputStream FIS = new FileInputStream(
          "C:\\Users\\krzys\\Desktop\\Test2\\SaveFullMember");
      ObjectInputStream OIS = new ObjectInputStream(FIS);

      Object obj = OIS.readObject();

      System.out.println("The Object has been read from the file");
      OIS.close();
      ms1 = (ArrayList<Member>) obj;
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }




/*

    boss.projects.get(0).addReq(ms1);
    boss.projects.get(0).addTask1(0, ms1.get(1));
    boss.projects.get(0).addTask1(0, ms1.get(3));
    boss.projects.get(0).addTask1(0, ms1.get(2));
    boss.projects.get(0).addReq(ms1);
    boss.projects.get(0).addTask1(1, ms1.get(2));
    boss.projects.get(0).addReq(ms1);
    boss.projects.get(0).addTask1(2, ms1.get(2));

    //  System.out.println(p1.toString());
    boss.projects.get(0).changeTaskStatus(0, 0, 2);
    boss.projects.get(0).changeTaskStatus(0, 1, 2);
    boss.projects.get(0).update();
    //  System.out.println(p1.toString());
    boss.projects.get(0).removeTask1(0, 1);
    boss.projects.get(0).RemoveReq(1);





    boss.projects.get(0).addTask1(0, ms1.get(3));
    System.out.println(boss.projects.get(0).toPrinter());

    boss.projects.get(0).changeOrderReq(0,1);

    System.out.println(boss.projects.get(0).toPrinter());
    System.out.println(boss.projects.get(1).toPrinter());



 */
    try (Writer writer = new FileWriter("Output.json"))
    {
      Gson gson = new GsonBuilder().create();
      gson.toJson(boss, writer);
    }

    Gson gson = new Gson();

    try (Reader reader = new FileReader("Output.json"))
    {

      // Convert JSON File to Java Object
      Tester boss1 = gson.fromJson(reader, Tester.class);

      // print staff object
      System.out.println("poczatek");

      for (int i = 0; i < boss1.projects.size(); i++)
      {
        System.out.println(boss1.projects.get(i).toString());
      }

      System.out.println("koniec");

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    boss.projects.get(0).printer(boss.projects.get(0));

    for (int i = 0; i < boss.projects.size(); i++)
    {
      boss.projects.get(i).FullSave(boss.projects.get(i), i);
    }

    try
    {

      FileOutputStream FOS = new FileOutputStream(
          "C:\\Users\\krzys\\Desktop\\Test2\\SaveFullMember");
      ObjectOutputStream OOS = new ObjectOutputStream(FOS);
      OOS.writeObject(ms1);
      OOS.close();
      System.out.println("The Object  was succesfully written to a file");

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

}
