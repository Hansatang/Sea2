public class Expressions
{
  public static void main(String[] args)
  {
    // 10
    System.out.println("Ex.10");
    System.out.println(23 * 4.5 / 0.5 + 1);
    System.out.println(23 * 4.5 / (0.5 + 1));
    System.out.println(2 + 5 - 18 + 11);
    System.out.println((2 + 5) - (18 + 11));
    System.out.println(14 * 18 / 4 + 4);
    System.out.println(14 * 18 / (4 + 4));
    // 9
    System.out.println("Ex.9");
    System.out.print("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.print("****");
    System.out.println("**");
    // 8
    System.out.println("Ex.8");
    System.out.println("*\n**\n***\n****\n*****");
    // 7
    System.out.println("Ex.7");
    int x;
    x = 7 + 3 * 6 / 2 - 1;
    int y;
    y = 2 % 2 + 2 * 2 - 2 / 2;
    int z = (3 * 9 * (3 + (9 * 3 / (3))));
    System.out.println("X is " + x);
    System.out.println("Y is " + y);
    System.out.println("Z is " + z);
    // 6
    System.out.println("Ex.6");
    double rad = 22.5;
    System.out.println(
        "Cir=" + 2 * Math.PI * rad + "\nArea=" + Math.PI * rad * rad);
    // 5
    System.out.println("Ex.5");
    float taxRate = (float) 0.25, tax1 = 80, tax2 = 140, tax3 = 230;
    System.out.println(tax1 * taxRate);
    System.out.println(tax2 * taxRate);
    System.out.println(tax3 * taxRate);
    // 4
    System.out.println("Ex.4");
    int a = 19, b = 89, total = a + b;
    System.out.println("Total is equal " + total);
    // 3
    System.out.println("Ex.3");
    System.out.println("Name ZZ,\nAdress XX,\nCity CC,\nState VV,\nPostCode BB,\nPhone NN,\nMajor MM");
    // 2
    System.out.println("Ex.2");
    String firstName = "ZZ", middleName = "XX", lastName = "CC";
    char firstInitial = 'z', middleInitial = 'x', lastInitial = 'c';
    System.out.println(firstName + " " + middleName + " " + lastName +"\n"+firstInitial + " " + middleInitial + " " + lastInitial);
    // 1
    System.out.println("Ex.1");
    String name = "Z";
    int age = 23;
    double annualPay = 1000000;
    System.out.println("My name is " + name + ", my age is " + age + ", and I hope to earn #" + annualPay + " per year.");
    // Star
    System.out.println("\t\t   *");
    System.out.println("\t\t  ***");
    System.out.println("\t\t *****");
    System.out.println("\t\t*******");
    System.out.println("\t\t *****");
    System.out.println("\t\t  ***");
    System.out.println("\t\t   *");

  }

}
