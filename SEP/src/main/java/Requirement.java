import java.io.Serializable;
import java.util.ArrayList;

public class Requirement implements Serializable
{
  public int reqId;
  public String reqTitle;
  public String userStory;
  public int reqEstimate;
  public int reqDeadline;
  public String reqStatus;
  public ArrayList<Task> task;
  public ArrayList<Member> members;

  public Requirement(int reqId, String reqTitle, String userStory,
      int reqEstimate, int reqDeadline, String reqStatus, ArrayList<Task> tasks,
      ArrayList<Member> member)
  {
    this.reqId = reqId;
    this.reqTitle = reqTitle;
    this.userStory = userStory;
    this.reqEstimate = reqEstimate;
    this.reqDeadline = reqDeadline;
    this.reqStatus = reqStatus;
    this.task = tasks;
    this.members = member;
  }

  public void setReqId(int reqId)
  {
    this.reqId = reqId;
  }

  public int getReqId()
  {
    return reqId;
  }

  public String getUserStory()
  {
    return userStory;
  }

  public int getReqEstimate()
  {
    return reqEstimate;
  }

  public int getReqDeadline()
  {
    return reqDeadline;
  }

  public String getReqStatus()
  {
    return reqStatus;
  }

  public void addTask(int reqId, Member member)
  {
    {

      String taskDescriptor = "descri" + 80;
      int taskEstimate = 200;
      int taskDeadline = 200 + 80;
      String taskStatus = "Not started";
      int taskHours = 0;
      ArrayList<Member> members = new ArrayList<>();
      members.add(member);
      Task t = new Task(reqId, task.size(), taskDescriptor, taskEstimate,
          taskDeadline, taskStatus, taskHours, members);
      task.add(t);

    }
  }

  public void RemoveTask(int taskID)
  {

    for (int i = taskID; i < task.size() - 1; i++)
    {
      task.set(i, task.get(i + 1));
      task.get(i).setTaskId(i);

    }
    task.remove(task.size() - 1);

    System.out.println(taskID);

    for (int i = 0; i < task.size(); i++)
    {
      System.out.println("id " + i + " of " + task.get(i).getTaskId());
    }
  }

  public void setReqStatus(int reqStatus)
  {
    if (reqStatus == 0)
    {
      this.reqStatus = "Not started";
    }
    else if (reqStatus == 1)
    {
      this.reqStatus = " Started";
    }
    else if (reqStatus == 2)
    {
      this.reqStatus = "Ended";
    }
    else if (reqStatus == 3)
    {
      this.reqStatus = " Approved";
    }
    else if (reqStatus == 4)
    {
      this.reqStatus = "Rejected";
    }
  }

  public void setReqEstimate(int reqEstimate)
  {
    this.reqEstimate = reqEstimate;
  }

  public String toPrinterReq()
  {
    return reqId + " Requirement: " + reqTitle + "\nRequirement Status = "
        + reqStatus + "\nRequirement Deadline = " + reqDeadline;

  }

  public String toString()
  {
    return reqId + " Requirement: " + reqTitle + "\nUser Story = " + userStory
        + "\nRequirement Estimate = " + reqEstimate
        + "\nRequirement Deadline = " + reqDeadline + "\nRequirement Status = "
        + reqStatus + " \nTasks : " + task + "\nMembers = " + members;
  }
}
