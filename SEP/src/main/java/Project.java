import java.io.*;
import java.util.ArrayList;

public class Project implements Serializable
{
  public ArrayList<Requirement> req;
  public String projectDescription;

  public Project()
  {
    this.req = new ArrayList<Requirement>();
    this.projectDescription = "";
  }

  public void setProjectDescription(String projectDescription)
  {
    this.projectDescription = projectDescription;
  }

  public void addReq(ArrayList<Member> member)
  {

    String userStory = "User story" + 66;
    String reqTitle = "empty";
    int reqEstimate = 10 + 66;
    int reqDeadline = 50 + 66;
    String reqStatus = "Not started";
    ArrayList<Task> tasks = new ArrayList<Task>();
    Requirement r = new Requirement(req.size(), reqTitle, userStory,
        reqEstimate, reqDeadline, reqStatus, tasks, member);
    req.add(r);

  }

  public void changeOrderReq(int reqID1, int reqID2)
  {

    Requirement r = new Requirement(99, null, null, 99, 99, null, null, null);
    r = req.get(reqID1);
    req.add(r);
    req.set(reqID1, req.get(reqID2));
    req.get(reqID1).setReqId(r.getReqId());

    req.set(reqID2, req.get(req.size() - 1));
    req.get(reqID2).setReqId(reqID2);

    req.remove(req.size() - 1);

  }

  public void RemoveReq(int reqID)
  {

    for (int i = reqID; i < req.size() - 1; i++)
    {
      req.set(i, req.get(i + 1));
      req.get(i).setReqId(i);

    }
    req.remove(req.size() - 1);

    System.out.println(reqID);

    for (int i = 0; i < req.size(); i++)
    {
      System.out.println("id " + i + " of " + req.get(i).getReqId());
    }
  }

  public void update()
  {
    for (int i = 0; i < req.size(); i++)
    {
      int sum = 0;
      for (int j = 0; j < req.get(i).task.size(); j++)
      {
        sum += req.get(i).task.get(j).getTaskEstimate();
      }
      req.get(i).setReqEstimate(sum);
    }
    int k = 0;
    for (int i = 0; i < req.size(); i++)
    {
      for (int j = 0; j < req.get(i).task.size(); j++)
      {

        if (req.get(i).task.get(j).getTaskStatus().equals("Ended"))
        {
          k = k + 1;
        }
        if (req.get(i).task.size() == k)
        {
          System.out.println("malpa");
          req.get(i).setReqStatus(2);
        }

      }
    }
  }

  public void removeTask1(int reqId, int taskId)
  {

    req.get(reqId).RemoveTask(taskId);
  }

  public void addTask1(int reqId, Member member)
  {

    req.get(reqId).addTask(reqId, member);
  }

  public void changeTaskStatus(int reqId, int taskId, int taskStatus)
  {
    req.get(reqId).task.get(taskId).setTaskStatus(taskStatus);
  }

  public void changeReqStatus(int reqId, int reqStatus)
  {
    req.get(reqId).setReqStatus(reqStatus);
  }

  public String toString()
  {
    String str = "Project " + projectDescription + " ";
    for (int i = 0; i < req.size(); i++)
    {
      if (req.get(i) == null)
      {
        continue;
      }
      str += "\n" + req.get(i).toString();

    }
    String str1 = str.replace("[", " ");
    String str2 = str1.replace("]", " ");
    String str3 = str2.replace(",", " ");
    return str3;
  }

  public String toPrinter()
  {
    String str = "Project " + projectDescription + " ";
    for (int i = 0; i < req.size(); i++)
    {
      if (req.get(i) == null)
      {
        continue;
      }
      str += "\n" + req.get(i).toPrinterReq();

    }
    String str1 = str.replace("[", " ");
    String str2 = str1.replace("]", " ");
    String str3 = str2.replace(",", " ");
    return str3;
  }

  public void printer(Project obj)
  {

    try
    {
      String str = obj.toPrinter();
      for (int i = 0; i < 5; i++)
      {
        File temp = new File(
            "C:\\Users\\krzys\\Desktop\\Test2\\thetextfile" + i + ".txt");
        boolean exists = temp.exists();
        if (!exists)
        {
          System.out.println("false");
          File newTextFile = new File(
              "C:\\Users\\krzys\\Desktop\\Test2\\thetextfile" + i + ".txt");

          FileWriter FW = new FileWriter(newTextFile);
          FW.write(str);
          FW.close();
          break;
        }
        System.out.println("true");
      }
    }
    catch (IOException iox)
    {
      //do stuff with exception
      iox.printStackTrace();
    }
  }

  public void FullSave(Project obj, int index)
  {

    try
    {

      FileOutputStream FOS = new FileOutputStream(
          "C:\\Users\\krzys\\Desktop\\Test2\\SaveFull" + index + "");
      ObjectOutputStream OOS = new ObjectOutputStream(FOS);
      OOS.writeObject(obj);
      OOS.close();
      System.out.println("The Object  was succesfully written to a file");

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  public Object FullRead(int index)
  {

    try
    {

      FileInputStream FIS = new FileInputStream(
          "C:\\Users\\krzys\\Desktop\\Test2\\SaveFull" + index + "");
      ObjectInputStream OIS = new ObjectInputStream(FIS);

      Object obj = OIS.readObject();

      System.out.println("The Object has been read from the file");
      OIS.close();
      return obj;

    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      return null;
    }
  }
}
