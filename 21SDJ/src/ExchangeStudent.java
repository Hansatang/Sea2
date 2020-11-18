public class ExchangeStudent extends Student
{
  private int projectGroup;

  public ExchangeStudent(String name, String address, int studentId,
      int projectGroup)
  {
    super(name, address, studentId);
    this.projectGroup = projectGroup;
  }

  public int getProjectGroup()
  {
    return projectGroup;
  }

  public void setProjectGroup(int projectGroup)
  {
    this.projectGroup = projectGroup;
  }

  public String toString()
  {
    return super.toString() + " ,projectGroup: " + projectGroup;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ExchangeStudent))
    {
      return false;
    }
    ExchangeStudent other = (ExchangeStudent) obj;
    return super.equals(other) && projectGroup == other.getProjectGroup();
  }
}
