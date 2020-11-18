public class ticket
{
  public ParkedCar car;
  public String man1;
  public int badge2;

  public ticket(ParkedCar car)
  {
    this.car = car;
    this.man1 = null;
    this.badge2=0;
  }

  public void setMan1(String man1)
  {
    this.man1 = man1;
  }

  public void setBadge2(int badge2)
  {
    this.badge2 = badge2;
  }

  public String toString()
  {
    String str = null;
    if (car.getMeter()<105)
      str="25";
    else if (((car.getMeter()-105)%60)==0)
    {
      int RoundedUp = ((car.getMeter()-105)/60)*10+25;
      str=""+RoundedUp;
    }
    else
    {
      int RoundedUp = ((car.getMeter()-105)/60)*10+35;
      str=""+RoundedUp;
    }
    return "Car :"+car.getMake()+" / "+ car.getLicenseNumber()+" / " + car.getColor()+" of "+ str+ "$, by "+ man1+"/ "+badge2;

  }
}
