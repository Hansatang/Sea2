public class WorkDone
{
  private int hoursWorked;
  private String memberName;

  public WorkDone(int hoursWorked, String memberName)
  {
    this.hoursWorked = hoursWorked;
    this.memberName = memberName;
  }

  public int getHoursWorked()
  {
    return hoursWorked;
  }

  public String getMemberName()
  {
    return memberName;
  }

  public void setHoursWorked(int hoursWorked)
  {
    this.hoursWorked = hoursWorked;
  }

  public void setMemberName(String memberName)
  {
    this.memberName = memberName;
  }

  public void addHoursWorked(int addhours)
  {
    this.hoursWorked = hoursWorked+addhours;
  }
}
