public class HeadOfDepartment extends Employee
{
  private String department;

  public HeadOfDepartment(String name, String address, int employeeId,
      String department)
  {
    super(name, address, employeeId);
    this.department = department;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public String getDepartment()
  {
    return department;
  }

  public String toString()
  {
    return super.toString()+" ,department: "+department;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof HeadOfDepartment))
    {
      return false;
    }
    HeadOfDepartment other = (HeadOfDepartment) obj;
    return super.equals(other) && department.equals(other.getDepartment());
  }
}
