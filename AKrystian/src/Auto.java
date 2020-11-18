public class Auto extends Vehicle
{

  public int currentSpeed, doorAmount;
  public String color;

  public Auto(int currentSpeed, int doorAmount, String color)
  {
    this.currentSpeed = currentSpeed;
    this.doorAmount = doorAmount;
    this.color = color;
  }

  @Override public void drive()
  {
    System.out.println("jedzie");;
  }

  @Override public double getSpeed()
  {
    return 50;
  }

  public String about()
  {
    return "To jest auto, jest"+color;
  }

  @Override public String getText()
  {
    return "bialy";
  }
}
