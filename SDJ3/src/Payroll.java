public class Payroll
{
  private String name;
  private int hourlyPay;
  private int hoursWorked;

  public Payroll()
  {
    this.name = name;
    this.hourlyPay = hourlyPay;
    this.hoursWorked = hoursWorked;
  }

  public String getName()
  {
    return name;
  }

  public int getHourlyPay()
  {
    return hourlyPay;
  }

  public int getHoursWorked()
  {
    return hoursWorked;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setHourlyPay(int hourlyPay)
  {
    this.hourlyPay = hourlyPay;
  }

  public void setHoursWorked(int hoursWorked)
  {
    this.hoursWorked = hoursWorked;
  }

  public int grossPay()
  {
    return hourlyPay*hoursWorked;
  }

  public Payroll(String name, int hourlyPay, int hoursWorked)
  {
    this.name = name;
    this.hourlyPay = hourlyPay;
    this.hoursWorked = hoursWorked;
  }

  public String toString()
  {
    return "Payroll{" + "name='" + name + '\'' + ", hourlyPay=" + hourlyPay
        + ", hoursWorked=" + hoursWorked + '}';
  }
}
