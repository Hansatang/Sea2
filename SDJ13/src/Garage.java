public class Garage
{
  private Auto car1;
  private Auto car2;

  public Garage()
  {
    car1 = new Auto(null, null,null,00000,2000);
    car2 = new Auto(null, null,null,00000,2000);
  }

  Auto empty= new Auto(null, null,null,00000,2000);

  public Auto getCar1()
  {
    return car1;
  }

  public Auto getCar2()
  {
    return car2;
  }

  public boolean isTaken(int position)
  {
    if (position == 1)
    {
      return car1.getModel() != null ;
    }
    else if (position == 2)
    {
      return car2.getModel() != null ;
    }
    return false;
  }

  public void setCar1(Auto car1)
  {
    this.car1 = car1;
  }

  public void setCar2(Auto car2)
  {
    this.car2 = car2;
  }

  public void park(Auto car,int position)
  {
    if (position == 1)
    {
      setCar1(car);
    }
    else if (position == 2)
    {
      setCar2(car);
    }
  }

  public int leave(int position)
  {
    if (position == 1)
    {
      setCar1(empty);
      return position;
    }
    else if (position == 2)
    {
      setCar2(empty);
      return position;
    }
    return 0;
  }

  public String toString()
  {
    return  "car1= " + car1.toString() + ", car2= " + car2.toString() ;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Garage))
    {
      return false;
    }
    Garage other = (Garage) obj;
    return car1.getModel().equals(other.getCar1().getColor())
        && car2.getMake().equals(other.getCar2().getMake())
        && car1.getColor().equals(other.getCar1().getColor())
        && car2.getLicenseNumber()==(other.getCar2().getLicenseNumber())
        && car2.getYear()==(other.getCar2().getYear());
  }
}
