import java.io.*;

public class Member implements Serializable
{
  public int hoursWorked;
  public String memberName;
  public String role;

  public Member(int hoursWorked, String memberName, String role)
  {
    this.hoursWorked = hoursWorked;
    this.memberName = memberName;
    this.role = role;
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

  public String getRole()
  {
    return role;
  }

  public void setMemberName(String memberName)
  {
    this.memberName = memberName;
  }

  public void addHoursWorked(int addhours)
  {
    this.hoursWorked = hoursWorked + addhours;
  }

  public String toString()
  {
    return "\n " + getMemberName() + " is a " + getRole() + " and worked "
        + getHoursWorked() + " in total";
  }

}
