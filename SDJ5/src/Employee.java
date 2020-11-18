public class Employee
{
  private String name;
  private int id;
  private String department;
  private String position;

  public Employee(String name, String position)
  {
    this.name = name;
    this.position = position;
  }

  public Employee(String position)
  {
    this.name = null;
    this.position = position;
  }

  public String getName()
  {
    return name;
  }

  public int getId()
  {
    return id;
  }

  public String getDepartment()
  {
    return department;
  }

  public String getPosition()
  {
    return position;
  }

  public void setEmployee(String name, int id, String department,
      String position)
  {
    this.name = name;
    this.id = id;
    this.department = department;
    this.position = position;
  }

  public String toString()
  {
    return (getName() + " " + getId() + " " + getDepartment() + " "
        + getPosition());
  }
}
