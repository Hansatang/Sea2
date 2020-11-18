import java.util.Scanner;

public class SDJ1xTest
{
  public static void main(String[] args)
  {
    int z, x, c;
    Scanner input = new Scanner(System.in);
    System.out.println("Type an integer:");
    z = input.nextInt();
    System.out.println("Type a second integer");
    x = input.nextInt();
    System.out.println("Type a third integer");
    c = input.nextInt();

    SDJ1x num = new SDJ1x(z,x,c);


    System.out.println("the product of ("+num.getA()+" * "+num.getB()+") is "+num.multi());
    System.out.println("the sum of ("+num.getA()+" + "+num.getB()+") is "+num.sum());
    System.out.println("the quotient of ("+num.getB()+" / "+num.getC()+") is "+num.quotient());
    System.out.println("the difference of ("+num.getB()+" - "+num.getC()+") is "+num.diff());
  }
}
