import java.util.Scanner;

 public class Pi
{
  public static void main(String[] args)
  {
    double d;
    double pi = (4.0-(4.0/3.0));
    pi =  (pi+(4.0/5.0));
    int k=0;
    System.out.println(pi);
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size");
    d = input.nextInt();
    double t=  4.0;

    for (double i = 2; i < d; i++)
    {

        pi = (pi -(4.0/(3.0+t*(i-1)))+(4.0/(5.0+t*(i-1))));
        System.out.println("i " + i);
        System.out.println("m " + pi);
        if (Math.round(Math.PI*100000) == Math.round(pi*100000))
        {
          k= (int) i;
          break;

        }
    }
    System.out.println(Math.round(Math.PI*100000));
    System.out.println(k/2);
    System.out.println("grain" );

  }
}
