package Car.src;

import Engine_v1.src.Engine_v1.Engine;

import java.util.Scanner;

public class CarTest
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
      input.nextLine();

      Engine engine = new Engine(type, horsePower, volume, isDiesel);
      System.out.println("DriverLicense");
      System.out.println(engine.getType());
      System.out.println(engine.getVolume());
      System.out.println(engine.getHorsePower());

      System.out.println("Enter make");
      String make = input.nextLine();

      System.out.println("What model");
      String model = input.nextLine();

      System.out.println("What colour");
      String colour = input.nextLine();

      System.out.println("It's manual");
      boolean manualGear = input.nextBoolean();

      Car car = new Car(make, model, colour, manualGear, engine);
      System.out.println("DriverLicense");
      System.out.println(car.getHorsePower());
      System.out.println(car.getEngine());
      System.out.println(car.getMake());
      System.out.println(car.getModel());
      System.out.println(car.getColour());
      System.out.println(car.hasManualGear());
      System.out.println(car.toString());
      System.out.println(engine.getType());
      System.out.println(engine.getVolume());
      System.out.println(engine.getHorsePower());
      
      String type1 = "maly";
      int horsePower1 = 500;
      int volume1 = 2000;
      boolean isDiesel1 = false;
      Engine engine1 =new Engine(type1, horsePower1, volume1, isDiesel1);
      car.setEngine(engine1);
 
      System.out.println("DriverLicense");
      System.out.println(car.getHorsePower());
      System.out.println(car.getEngine());
      System.out.println(car.getMake());
      System.out.println(car.getModel());
      System.out.println(car.getColour());
      System.out.println(car.hasManualGear());
      System.out.println(car.toString());
      System.out.println(engine.getType());
      System.out.println(engine.getVolume());
      System.out.println(engine.getHorsePower());
      System.out.println(engine.toString());
   }
  
      
   
}
