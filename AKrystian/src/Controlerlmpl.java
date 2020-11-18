public class Controlerlmpl implements Controler
{
  private ProjectController pControl;
  private TaskController tControl;

  public Controlerlmpl()
  {
    this.pControl = new ProjectControllerlmpl();
    this.tControl = new TaskControllerlmpl();
  }

  @Override public String getProject()
  {
    return pControl.getProject();
  }

  @Override public void addProject()
  {
    pControl.addProject();
  }

  @Override public String getTask()
  {
    return tControl.getTask();
  }

  @Override public void addTask()
  {
    tControl.addTask();
  }

}
