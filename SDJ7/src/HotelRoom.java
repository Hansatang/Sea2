public class HotelRoom
{
  private int roomNumber;
  private double rent;
  private Guest guest;

  public HotelRoom(int roomNumber, double rent, Guest guest)
  {
    this.roomNumber = roomNumber;
    this.rent = rent;
    this.guest = guest;
  }

  public HotelRoom(int roomNumber, double rent)
  {
    this.roomNumber = roomNumber;
    this.rent = rent;
    this.guest = null;
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public double getRent()
  {
    return rent;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public boolean isAvailable()
  {
    return guest.getName() == null;
  }

  public void checkIn(Guest guest)
  {
    if (isAvailable())
    this.guest = guest;
  }
  public void checkout()
  {
    guest.setName(null);
  }

  public String toString()
  {
    if (!isAvailable())
    {
      return "Room number " + getRoomNumber() + " is occupied by " + guest.getName()
          + " with the rent of " + getRent();
    }
    else if (isAvailable())

      return "Room number " + getRoomNumber() + " is " + guest.getName()
          + " with the rent of " + getRent();
    else {return null;}
  }

}
