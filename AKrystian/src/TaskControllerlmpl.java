public class TaskControllerlmpl implements TaskController
{
  public String task;

  public TaskControllerlmpl(String task)
  {
    this.task = task;
  }
  public TaskControllerlmpl()
  {
    this.task = "bullshit";
  }

  @Override public String getTask()
  {
    return task;
  }

  @Override public void addTask()
  {
    System.out.println("task added");
  }


}
