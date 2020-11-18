public class Room
{
  private int roomId;
  private final char block;
  private final int floor;
  private int seats;
  private boolean hasProjector;
  private boolean isOccupied;

  public Room(int roomId, char block, int floor, int seats,
      boolean hasProjector)
  {
    this.roomId = roomId;
    this.block = block;
    this.floor = floor;
    this.seats = seats;
    this.hasProjector = hasProjector;
    this.isOccupied = true;
  }

  public int getRoomId()
  {
    return roomId;
  }

  public int getBlock()
  {
    return block;
  }

  public int getFloor()
  {
    return floor;
  }

  public int getSeats()
  {
    return seats;
  }

  public boolean isHasProjector()
  {
    return hasProjector;
  }

  public boolean isOccupied()
  {
    return isOccupied;
  }

  public void setRoomId(int roomId)
  {
    this.roomId = roomId;
  }

  public void setSeats(int seats)
  {
    this.seats = seats;
  }

  public void setHasProjector(boolean hasProjector)
  {
    this.hasProjector = hasProjector;
  }

  public void setOccupied(boolean occupied)
  {
    this.isOccupied = occupied;
  }

  public String toString()
  {
    return ("Id: " + getRoomId() + ", Block: " + getBlock() + ", Floor: "
        + getFloor() + ", Seats: " + getSeats() + ", Projector: "
        + isHasProjector());
  }
}

