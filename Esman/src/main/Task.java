package main;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Task implements Serializable
{
  public int taskId;
  public String taskTitle;
  public int taskEstimate;
  public LocalDate taskDeadline;
  public Status taskStatus;
  public int taskHours;
  private Member member;

  public Task(String taskTitle, int taskEstimate,
      Requirement requirement, LocalDate taskDeadline, Member member)
  {
    this.taskId = requirement.getTasks().size();
    this.taskTitle = taskTitle;
    this.taskEstimate = taskEstimate;
    this.taskDeadline = taskDeadline;
    this.taskStatus = Status.NOT_STARTED;
    this.taskHours = 0;
    this.member = member;
  }

  public Member getMember()
  {
    return member;
  }

  public String getTaskTitle()
  {
    return taskTitle;
  }

  public LocalDate getTaskDeadline()
  {
    return taskDeadline;
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

  public void setTaskStatus(Status taskStatus)
  {
    this.taskStatus = taskStatus;
  }

  public Status getTaskStatus()
  {
    return taskStatus;
  }
}
