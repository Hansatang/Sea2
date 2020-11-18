public class ItSupport extends Employee
{
  private String workingArea;

  public ItSupport(String name, String address, int employeeId,
      String workingArea)
  {
    super(name, address, employeeId);
    this.workingArea = workingArea;
  }

  public String getWorkingArea()
  {
    return workingArea;
  }

  public void setWorkingArea(String workingArea)
  {
    this.workingArea = workingArea;
  }

  public String toString()
  {
    return super.toString()+" ,workingArea: "+workingArea;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ItSupport))
    {
      return false;
    }
   ItSupport other = (ItSupport) obj;
    return super.equals(other) && workingArea.equals(other.getWorkingArea());
  }
}
