public class HotelRoomTest
{
  public static void main(String[] args)
  {
    Guest emptied = new Guest();
    HotelRoom room1 = new HotelRoom(1, 500, emptied);
    HotelRoom room2 = new HotelRoom(2, 1500, emptied);
    HotelRoom room3 = new HotelRoom(3, 2500, emptied);
    Guest guest1 = new Guest("Mar");
    Guest guest2 = new Guest("Pal");


    System.out.println("A");
    System.out.println(room1.toString());
    System.out.println(room2.toString());
    System.out.println(room3.toString());
    System.out.println("It's a "+room1.isAvailable()+" information that the room is available");
    System.out.println("It's a "+room2.isAvailable()+" information that the room is available");
    System.out.println("It's a "+room3.isAvailable()+" information that the room is available");
    System.out.println("B");
    System.out.println(room1.toString());
    System.out.println(room2.toString());
    System.out.println(room3.toString());
    room1.setRent(1000);
    room2.setRent(2000);
    room3.setRent(3000);
    System.out.println("C");
    System.out.println(room1.toString());
    System.out.println(room2.toString());
    System.out.println(room3.toString());
    room1.checkIn(guest1);
    room3.checkIn(guest2);
    System.out.println("D");
    System.out.println(room1.toString());
    System.out.println(room2.toString());
    System.out.println(room3.toString());
    System.out.println("It's a "+room1.isAvailable()+" information that the room is available");
    System.out.println("It's a "+room2.isAvailable()+" information that the room is available");
    System.out.println("It's a "+room3.isAvailable()+" information that the room is available");
    room3.checkout();
    System.out.println("E");
    System.out.println("It's a "+room1.isAvailable()+" information that the room is available");
    System.out.println("It's a "+room2.isAvailable()+" information that the room is available");
    System.out.println("It's a "+room3.isAvailable()+" information that the room is available");
    System.out.println("F");
    System.out.println(room1.toString());
    System.out.println(room2.toString());
    System.out.println(room3.toString());
  }
}
