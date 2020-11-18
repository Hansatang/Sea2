import Engine_v1.src.Engine_v1.Engine;

import java.util.Scanner;




public class EngineTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter engine type");
      String type = input.nextLine();

      System.out.println("What horse power it have? ");
      int horsePower = input.nextInt();

      System.out.println("What volume it have?");
      int volume = input.nextInt();

      System.out.println("It's diesel?");
      boolean isDiesel = input.nextBoolean();    
      
      Engine engine = new Engine(type, horsePower, volume, isDiesel);
      System.out.println("DriverLicense");
      System.out.println(engine.getType());
      System.out.println(engine.getVolume());
      System.out.println(engine.getHorsePower());
      System.out.println(engine.toString());
   }
  
      
   
}

  