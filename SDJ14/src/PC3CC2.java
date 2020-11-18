public class PC3CC2
{

  public PC3CC roomDimension;
  public double cost;

  public PC3CC2(PC3CC roomDimension, double cost)
  {
    this.roomDimension = roomDimension;
    this.cost = cost;
  }

  public double totalCost()
  {
    return roomDimension.area() * cost;
  }

  public String toString()
  {
    return "Area " + roomDimension.area() + ", and the cost is " + totalCost();
  }

}
