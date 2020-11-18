public class Car
{
  private String yearModel;
  private String make;
  private int speed;

  public Car(String yearModel, String make)
  {
    this.yearModel = yearModel;
    this.make = make;
    this.speed = 0;
  }

  public String getYearModel()
  {
    return yearModel;
  }

  public String getMake()
  {
    return make;
  }

  public int getSpeed()
  {
    return speed;
  }

  public int accelerate()
  {
    speed += 5;
    return speed;
  }
  public int brake()
  {
    speed -= 5;
    return speed-5;
  }
  public String toString()
  {
    return getYearModel()+" "+getMake()+" "+getSpeed();
  }
}
