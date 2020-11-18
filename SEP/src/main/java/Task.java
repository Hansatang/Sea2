import java.io.Serializable;
import java.util.ArrayList;

public class Task implements Serializable
{
  public int reqId;
  public int taskId;
  public String taskDescriptor;
  public int taskEstimate;
  public int taskDeadline;
  public String taskStatus;
  public int taskHours;
  public ArrayList<Member> members;

  public Task(int reqId, int taskId, String taskDescriptor, int taskEstimate,
      int taskDeadline, String taskStatus, int taskHours,
      ArrayList<Member> member)
  {
    this.reqId = reqId;
    this.taskId = taskId;
    this.taskDescriptor = taskDescriptor;
    this.taskEstimate = taskEstimate;
    this.taskDeadline = taskDeadline;
    this.taskStatus = taskStatus;
    this.taskHours = taskHours;
    this.members = member;
  }

  public int getTaskEstimate()
  {
    return taskEstimate;
  }

  public void setTaskId(int taskId)
  {
    this.taskId = taskId;
  }

  public int getTaskId()
  {
    return taskId;
  }

  public void setTaskStatus(int taskStatus)
  {
    if (taskStatus == 0)
    {
      this.taskStatus = "Not started";
    }
    else if (taskStatus == 1)
    {
      this.taskStatus = " Started";
    }
    else if (taskStatus == 2)
    {
      this.taskStatus = "Ended";
    }
    else if (taskStatus == 3)
    {
      this.taskStatus = " Approved";
    }
    else if (taskStatus == 4)
    {
      this.taskStatus = "Rejected";
    }
  }

  public String getTaskStatus()
  {
    return taskStatus;
  }

  public String toString()
  {
    String str = "";
    str += "\n Id= " + taskId + "\n Task Descriptor = " + taskDescriptor
        + "\n Task Estimate = " + taskEstimate + "\n TaskDeadline = "
        + taskDeadline + "\n taskStatus = " + taskStatus + "\n taskHours = "
        + taskHours + "\n members = ";
    for (int i = 0; i < members.size(); i++)
    {
      if (members.get(i) != null)
        ;
      {
        str += members.get(i).getMemberName();
      }
    }
    return str;
  }
}
