package Clock1;

import java.util.Scanner;

public class ClockTest1
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter hour");
    int hour = input.nextInt();
    System.out.println("What minute");
    int minute = input.nextInt();

    //   while(60<=minute){
    //      System.out.println("Wrong format, please try again :");
    //      minute  = input.nextInt(); }

    System.out.println("What second");
    int second = input.nextInt();
    input.nextLine();


    //   while(60<=second){
    //      System.out.println("Wrong format, please try again :");
    //      second  = input.nextInt(); }

    Clock1 clock1 = new Clock1(hour, minute, second);

    if (!clock1.isTimeFormat24())
    {
      System.out.println("It's 24 format?");
      String stq = input.nextLine();
      if (stq.equalsIgnoreCase("no"))
      {
        System.out.println("It's AM?");
        String sth = input.nextLine();
        if (sth.equalsIgnoreCase("yes"))
        {
          clock1.setAM(1);
        }
        else if (sth.equalsIgnoreCase("no"))
        {
          clock1.setAM(2);
        }
      }
    }
    System.out.println("C");
    if (hour<10)
    {
      System.out.println("0" + clock1.getHour());
    }
    else
    {
      System.out.println(clock1.getHour());
    }

    if (minute<10)
    {
      System.out.println("0" + clock1.getMinute());
    }
    else
    {
      System.out.println(clock1.getMinute());
    }

    if (second<10)
    {
      System.out.println("0" + clock1.getSecond());
    }
    else
    {
      System.out.println(clock1.getSecond());
    }
    System.out.println("P");
    System.out.println(clock1.isAM());
    System.out.println(clock1.toString());
    System.out.println(clock1.SimpleTime());
    System.out.println(clock1.getTimeInSecond());
    System.out.println(clock1.isTimeFormat24());
    clock1.setTimeFormat(24);
    System.out.println(clock1.isAM());
    System.out.println(clock1.toString());
    System.out.println(clock1.SimpleTime());
    System.out.println(clock1.getTimeInSecond());
    clock1.tic1();
    System.out.println(clock1.toString());
    System.out.println(clock1.SimpleTime());
    System.out.println(clock1.getTimeInSecond());


   /* System.out.println("Enter hour");
    int hour1 = input.nextInt();

    System.out.println("What minute");
    int minute1 = input.nextInt();

    //   while(60<=minute1){
    //      System.out.println("Wrong format, please try again :");
    //      minute1  = input.nextInt();       }


    System.out.println("What second");
    int second1 = input.nextInt();

    //   while(60<=second1){
    //      System.out.println("Wrong format, please try again :");
    //      second1  = input.nextInt();         }

    clock1.setClock(hour1, minute1, second1);
    System.out.println("DriverLicense");
    if (hour<10)
    {
      System.out.println("0" + clock1.getHour());
    }
    else
    {
      System.out.println(clock1.getHour());
    }

    if (minute<10)
    {
      System.out.println("0" + clock1.getMinute());
    }
    else
    {
      System.out.println(clock1.getMinute());
    }

    if (second<10)
    {
      System.out.println("0" + clock1.getSecond());
    }
    else
    {
      System.out.println(clock1.getSecond());
    }

    System.out.println(clock1.toString());
    System.out.println(clock1.SimpleTime());
    System.out.println(clock1.getTimeInSecond());
    */
    System.out.println("Enter total seconds");
    int totalSeconds = input.nextInt();

    Clock1 clock2 = new Clock1(totalSeconds);
    System.out.println("D");
    if (hour<10)
    {
      System.out.println("0" + clock2.getHour());
    }
    else
    {
      System.out.println(clock2.getHour());
    }

    if (minute<10)
    {
      System.out.println("0" + clock2.getMinute());
    }
    else
    {
      System.out.println(clock2.getMinute());
    }

    if (second<10)
    {
      System.out.println("0" + clock2.getSecond());
    }
    else
    {
      System.out.println(clock2.getSecond());
    }
    System.out.println(clock2.toString());
    System.out.println(clock2.SimpleTime());
    System.out.println(clock2.getTimeInSecond());
    System.out.println(clock1.isBefore(clock2));
    System.out.println("A");
    System.out.println(clock1.toString());
    System.out.println("B");
    System.out.println(clock2.toString());
    System.out.println("C");
    System.out.println(clock1.timeTo(clock2));




  }
}


