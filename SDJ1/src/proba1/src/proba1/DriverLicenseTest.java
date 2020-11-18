package proba1;

import java.util.Scanner;

public class DriverLicenseTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter License number");
      int number = input.nextInt();

      System.out.println("Do you have addicional permits?");
      boolean addPer = input.nextBoolean();

      if (addPer == true)
      {
         System.out.println("Do you have a truck permit: ");
         boolean permitForTruck = input.nextBoolean();

         System.out.println("Do you have a bus permit: ");
         boolean permitForBus = input.nextBoolean();

               if (permitForBus == true && permitForTruck == true)
               {
                  DriverLicense driverlicense = new DriverLicense(number,
                        permitForTruck);
                  System.out.println("C");
                  System.out.println("DriverLicense");
                  System.out.println(driverlicense.getNumber());
                  System.out.println(driverlicense.hasPermitForBus());
                  System.out.println(driverlicense.toString());
               }
               else
               {
                  DriverLicense driverlicense = new DriverLicense(number,
                        permitForTruck, permitForBus);
                  System.out.println("A");
                  System.out.println("DriverLicense");
                  System.out.println(driverlicense.getNumber());
                  System.out.println(driverlicense.hasPermitForTruck());
                  System.out.println(driverlicense.hasPermitForBus());
                  System.out.println(driverlicense.toString());
      
               }
      }
      else
      {
         System.out.println("D");
         DriverLicense driverlicense = new DriverLicense(number);
         System.out.println("DriverLicense");
         System.out.println(driverlicense.getNumber());
         System.out.println(driverlicense.toString());

      }
   }
}
