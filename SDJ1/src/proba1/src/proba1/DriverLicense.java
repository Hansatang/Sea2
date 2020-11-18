package proba1;

public class DriverLicense
{
   private final int number;
   private final boolean permitForTruck;
   private final boolean permitForBus;

      public DriverLicense(int number) {
         this.number = number;
         this.permitForTruck = false;
         this.permitForBus = false; 
      }
   
      public DriverLicense(int number, boolean permitForTruckaBus)
      {
         this.number = number;
         this.permitForTruck = permitForTruckaBus;
         this.permitForBus = permitForTruckaBus;
      }
   
      public DriverLicense(int number, boolean permitForTruck,
            boolean permitForBus)
      {
         this.number = number;
         this.permitForTruck = permitForTruck;
         this.permitForBus = permitForBus;
   
      }

         public int getNumber()
         {
            return this.number;
         }
      
         public boolean hasPermitForTruck()
         {
            return this.permitForTruck;
         }
      
         public boolean hasPermitForBus()
         {
            return this.permitForBus;
         }

            public String toString()
            {
               if(  permitForBus == true && permitForTruck == true)
               {
                  return (" His number is " + getNumber() + " and it's  "
                        + hasPermitForTruck() + " statement that he has both permits");
               }
               else if ((permitForBus == false && permitForTruck == false))
               {
                  return (" His number is " + getNumber() + " and it's  "
                        + hasPermitForTruck() + " statement that he have both permits");
               }
               else
               {
                  return (" His number is " + getNumber() + " and it's  "
                        + hasPermitForTruck()
                        + " statement that he have permit for trucks and it's  "
                        + hasPermitForBus() + " statement that he have permit for Bus.");
               }
   }
}
