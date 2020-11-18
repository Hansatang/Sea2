public class Officer
{
  public String name;
  public int badge;

  public Officer(String name, int badge)
  {
    this.name = name;
    this.badge = badge;
  }


  public void check(ParkedCar car)
  {
    if (45 < car.getMeter())
    {
      ticket tick = new ticket(car);
      tick.setMan1(name);
      tick.setBadge2(badge);
      System.out.println(tick.toString());
    }

  }

  public String getName()
  {
    return name;
  }

  public int getBadge()
  {
    return badge;
  }
}
