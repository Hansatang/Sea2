import java.util.Scanner;

public class CalendarTest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter day");
      int day = input.nextInt();
      
      System.out.println("What month");
      int month = input.nextInt();
 
      
      System.out.println("What year");
      int year = input.nextInt();
      
    
         Calendar calendar = new Calendar(day, month, year);
         System.out.println("C");
         System.out.println(calendar.getDay());
         System.out.println(calendar.getMonth());
         System.out.println(calendar.getYear());
         System.out.println(calendar.toString());
         
         System.out.println("Enter day");
         int day1 = input.nextInt();
         
         System.out.println("What month");
         int month1 = input.nextInt();
    
         
         System.out.println("What year");
         int year1 = input.nextInt();
         
         calendar.setDate(day1, month1, year1);
         System.out.println("DriverLicense");
         System.out.println(calendar.getDay());
         System.out.println(calendar.getMonth());
         System.out.println(calendar.getYear());
         System.out.println(calendar.toString());
      }
      }

