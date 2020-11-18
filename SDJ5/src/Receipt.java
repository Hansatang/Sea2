import java.util.Scanner;

public class Receipt
{
  private String name;
  private double timePeriod;
  private Room room;

  public Receipt(String name, double timePeriod, Room room)
  {
    this.name = name;
    this.timePeriod = timePeriod;

  }

  public Receipt(String name, double timePeriod)
  {
    this.name = name;
    this.timePeriod = timePeriod;

  }

  public String getName()
  {
    return name;
  }

  public double getTimePeriod()
  {
    return timePeriod;
  }

  public Room getRoom()
  {
    return room;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setTimePeriod(int timePeriod)
  {
    this.timePeriod = timePeriod;
  }

  public void setRoom(Room room)
  {
    this.room = room;
  }

  public String toString()
  {
    return ("Name: " + getName() + ", time period: " + getTimePeriod()
        + ", room: " + room.getRoomId());
  }

  public static void main(String[] args)
  {
    Room room1 = new Room(1, 'A', 1, 1, true);
    Room room2 = new Room(2, 'B', 2, 2, false);
    Room room3 = new Room(3, 'C', 3, 3, true);

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 2; i++)
    {
      System.out.println("Available rooms:");
      if (room1.isOccupied())
      {
        System.out.println(room1.toString());
      }
      if (room2.isOccupied())
      {

        System.out.println(room2.toString());
      }
      if (room3.isOccupied())
      {
        System.out.println(room3.toString());
      }

      System.out.println("Enter name");
      String z = input.nextLine();
      System.out.println("What timePeriod");
      double x = input.nextDouble();
      Receipt rec = new Receipt(z, x);
      System.out.println("What room");
      int c = input.nextInt();
      input.nextLine();

      if (c == 1)
      {
        rec.setRoom(room1);
        room1.setOccupied(false);
      }
      else if (c == 2)
      {
        rec.setRoom(room2);
        room2.setOccupied(false);
      }
      else
      {
        rec.setRoom(room3);
        room3.setOccupied(false);
      }
      System.out.println(rec.toString());
    }
  }
}
