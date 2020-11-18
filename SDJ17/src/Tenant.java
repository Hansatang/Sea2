public class Tenant
{
  private String name, phone;
  private double rentDue;

  public Tenant(String name, String phone)
  {
    this.name = name;
    this.phone = phone;
    this.rentDue = 0;
  }

  public String getName()
  {
    return name;
  }

  public String getPhone()
  {
    return phone;
  }

  public double getRentDue()
  {
    return rentDue;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  public Tenant copy()
  {

    Tenant ten = new Tenant(name, phone);

    return ten;
  }

  public String toString()
  {

    return "name : "+name +" , Phone : "+phone+" , rent : "+rentDue;
  }
}
