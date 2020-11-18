package SDJ2;

import java.util.Scanner;

public class SDJ2
{
  public static void main(String[] args)
  {
    // 1
    /*
    System.out.println("Ex.1");
    Scanner input = new Scanner(System.in);
    System.out.println("Name of your fav city?");
    String x = input.nextLine();
    System.out.println(x.toUpperCase());
    System.out.println(x.toLowerCase());
    System.out.println(x.length());
    System.out.println(x.charAt(0));
    */

    // 2
    /*
    System.out.println("Ex.2");
    Scanner input = new Scanner(System.in);
    System.out.println("First one");
    int x = input.nextInt();
    System.out.println("Second one");
    int y = input.nextInt();
    System.out.println("Third one");
    int z = input.nextInt();
    System.out.println(x+y+z);
    System.out.println(x*y*z);
    */

    // 3
    /*
    System.out.println("Ex.3");
    Scanner input = new Scanner(System.in);
    System.out.println("First one");
    float tax1 = input.nextFloat();
    System.out.println("Second one");
    float tax2 = input.nextFloat();
    System.out.println("Third one");
    float tax3 = input.nextFloat();
    System.out.println("Tax rate");
    float taxRate = input.nextFloat();
    System.out.println(tax1 * taxRate);
    System.out.println(tax2 * taxRate);
    System.out.println(tax3 * taxRate);
    */

    // 4
    /*
    System.out.println("Ex.4");
    Scanner input = new Scanner(System.in);
    System.out.println("Name");
    String x = input.nextLine();
    System.out.println("Age");
    int y = input.nextInt();
    input.nextLine();
    System.out.println("Place");
    String z = input.nextLine();
    System.out.println(x + " " + y + " " + z);
    */

    // 5
    /*
    System.out.println("Ex.5");
    Scanner input = new Scanner(System.in);
    System.out.println("First one");
    int x = input.nextInt();
    System.out.println("Second one");
    int y = input.nextInt();
    System.out.println("Third one");
    int z = input.nextInt();
    System.out.println((x+y+z)/3);
    */

    // 6
    /*
    System.out.println("Ex.6");
    Scanner input = new Scanner(System.in);
    System.out.println("Name");
    String z = input.nextLine();
    System.out.println("Age");
    int x = input.nextInt();
    input.nextLine();
    System.out.println("City");
    String c = input.nextLine();
    System.out.println("College");
    String v = input.nextLine();
    System.out.println("Profession");
    String b = input.nextLine();
    System.out.println("Animal type");
    String n = input.nextLine();
    System.out.println("Animal Name");
    String m = input.nextLine();
    System.out.println("There was once a person named " +z+ " who lived in "+c+". At the age of "+x+", " +z+" went to college at "+v+"."
        + " "+z+" graduated and went to work as a "+b+". Then, "+z+" adopted a(n) "+n+ " named "+m+". They lived happily ever after");
        */

    // 7 and 8
    /*
    System.out.println("Ex.7 and 8");
    Scanner input = new Scanner(System.in);
    System.out.println("Buying price ?");
    float paid = input.nextFloat();
    System.out.println("How many did you bought ?");
    int purchased = input.nextInt();
    System.out.println("Commision rate is?");
    float commies = input.nextFloat();
    System.out.println("He paid " + purchased*paid+"$");
    System.out.println("Commision was equal to " + purchased*paid*commies+"$");

    System.out.println("Selling price?");
    float price = input.nextFloat();
    System.out.println("How many have you sold?");
    int sold = input.nextInt();
    System.out.println("He sold it for " + sold*price+"$");
    System.out.println("Commision was equal to " + sold*price*commies+"$");

    System.out.println("His profit: " + Math.round(((sold*price-purchased*paid-purchased*paid*0.02-sold*price*0.02)*100)/100)+"$");
     */

    // 9
    /*
    System.out.println("Ex.9");
    System.out.println("\t\t   *");
    System.out.println("\t\t  ***");
    System.out.println("\t\t *****");
    System.out.println("\t\t*******");
    System.out.println("\t\t *****");
    System.out.println("\t\t  ***");
    System.out.println("\t\t   *");
     */

    // 2.19

    Scanner input = new Scanner(System.in);
    System.out.println("Point 1 ?");
    String a = input.nextLine();
    String[] parts = a.split(" ");
    String part1 = parts[0];
    String part2 = parts[1];
    float x1 = Float.parseFloat(part1);
    float y1 = Float.parseFloat(part2);;
    System.out.println("Point 2 ?");
    String b = input.nextLine();
    String[] parts2 = b.split(" ");
    String part3 = parts2[0];
    String part4 = parts2[1];
    float x2 = Float.parseFloat(part3);
    float y2 = Float.parseFloat(part4);
    float x1x2 = x1-x2;
    float y1y2 = y1-y2;
    System.out.println("Distance between point: " +Math.pow( (x1x2*x1x2+y1y2*y1y2) ,0.5));


    // 2.20
    /*
    Scanner input = new Scanner(System.in);
    System.out.println("Balance and interestRate ?");
    String a = input.nextLine();
    String[] parts = a.split(" ");
    String part1 = parts[0];
    String part2 = parts[1];
    float balance = Float.parseFloat(part1);
    float interestRate = Float.parseFloat(part2);
    System.out.println("Interest: " + balance*(interestRate/1200));
     */

    // 2.21
    /*
    Scanner input = new Scanner(System.in);
    System.out.println("Investment amount: ?");
    double invest = input.nextFloat();
    System.out.println("Interest rate: ?");
    double interest = input.nextFloat();
    System.out.println("Years: ?");
    double years = input.nextFloat();
    double a = 1+(interest/100);
    double b = years*12;
    double c = Math.pow(a,b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println("Value: " + invest*c);
     */
  }
}