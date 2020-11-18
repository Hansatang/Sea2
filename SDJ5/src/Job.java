public class Job
{
  private Employee employee;
  private double monthPay;

  public Job(Employee employee, double monthPay)
  {
    this.employee = employee;
    this.monthPay = monthPay;
  }

  public Employee getEmployee()
  {
    return employee;
  }

  public double getMonthPay()
  {
    return monthPay;
  }

  public void givePercentageRaise(double percentage)
  {
    this.monthPay = monthPay + monthPay * percentage / 100;
  }

  public String toString()
  {
    return "Name: " + employee.getName() + ", position: " + employee
        .getPosition() + ", monthly pay: " + getMonthPay();
  }

  public String toString1()
  {
    return "Name: " + getEmployee() +", monthly pay: " + getMonthPay();
  }
}
