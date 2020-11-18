package Engine_v1.src.Engine_v1;

public class Engine
{
   private final String type;
   private final int horsePower;
   private final int volume;
   private final boolean isDiesel;

   public Engine(String type, int horsePower, int volume, boolean isDiesel)
   {
      this.type = type;
      this.horsePower = horsePower;
      this.volume = volume;
      this.isDiesel = isDiesel;
   }

   public Engine(String type, int horsePower, int volume)
   {
      this.type = type;
      this.horsePower = horsePower;
      this.volume = volume;
      this.isDiesel = true;

   }

   public String getType()
   {
      return this.type;
   }

   public int getHorsePower()
   {
      return this.horsePower;
   }

   public int getVolume()
   {
      return this.volume;
   }

   public boolean isDiesel()
   {
      return this.isDiesel;
   }

   public String toString()
   {
      return (" The engine type is " + getType() + " and it have volume of  "
          + getVolume() + " and have horse power of " + getHorsePower()
          + " and it's " + isDiesel() + " information that this is diesel ");
   }
}
