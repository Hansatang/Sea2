public class Apartment
{

  private Tenant tenant;
  private String adress;
  private double rent;

  public Apartment(String adress, double rent)
  {
    this.adress = adress;
    this.rent = rent;
    this.tenant = null;
  }

  public Tenant getTenant()
  {
    if (isOccupied())
    {
      return tenant.copy();
    }
    else
    {
      return null;
    }
  }

  public double getRent()
  {
    return rent;
  }

  public String getAdress()
  {
    return adress;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public void rentTo(String name, String phone)
  {
    this.tenant = new Tenant(name, phone);
  }

  public void evict()
  {
    this.tenant = null;
  }

  public boolean isOccupied()
  {
    return tenant != null;
  }

  public double getRentDue()
  {
    if (isOccupied())
    {
      return tenant.getRentDue();
    }
    else
    {
      return 0;
    }
  }


  public void chargeRent()
  {
    tenant.setRentDue(tenant.getRentDue()+rent);
  }

  public void collectRent()
  {
    tenant.setRentDue(tenant.getRentDue()-rent);

  }

  public String toString()
  {
    String str ;
    if (isOccupied())
    {
      str= "occupied by "+tenant.toString();
    }
    else
    {
      str = "empty";
    }


    return "The rent for house on adress "+adress +" is "+rent+" and is "+str+" .";
  }


  public static void main(String[] args) throws IndexOutOfBoundsException
  {
  Tenant mark = new Tenant("Mark", "511756219");
  Apartment home = new Apartment("John", 2000);
    System.out.println(home.toString());
    home.rentTo("Micha", "123");
    System.out.println(home.toString());
    home.chargeRent();
    System.out.println(home.toString());
    home.collectRent();
    System.out.println(home.toString());
  }
}
