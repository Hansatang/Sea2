public class ProjectControllerlmpl   implements ProjectController
{
  public String project;

  public ProjectControllerlmpl(String project)
  {
    this.project = project;
  }

  public ProjectControllerlmpl()
  {
    this.project = "sciema";
  }

  @Override public String getProject()
  {
    return project;
  }

  @Override public void addProject()
  {
    System.out.println("project added");
  }
}
