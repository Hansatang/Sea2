public class Employee extends  Person
{
  private int employeeId;

  public Employee(String name, String address, int employeeId)
  {
    super(name, address);
    this.employeeId = employeeId;
  }

  public int getEmployeeId()
  {
    return employeeId;
  }

  public void setEmployeeId(int employeeId)
  {
    this.employeeId = employeeId;
  }

  public String toString()
  {
    return  super.toString()+" ,employeeId: "+employeeId;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Employee))
    {
      return false;
    }
    Employee other = (Employee) obj;

    return super.equals(other) && employeeId == other.getEmployeeId();
  }
}
