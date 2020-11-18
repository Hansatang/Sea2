import java.util.Random;
import java.util.Scanner;

public class PC13
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter player starting point");
    int p = input.nextInt();
    int life1 = p;
    int life2 = p;

    int n = rand.nextInt(6) + 1;
    int t = rand.nextInt(6) + 1;
    while (true)
    {
      n=rand.nextInt(6) + 1;
      t = rand.nextInt(6) + 1;
      life1 = life1 - n;
      life2 = life2 - t;
      System.out.println("n " + n);
      System.out.println("t " + t);
      System.out.println("1 Player " + life1);
      System.out.println("2 Player " + life2);
      if (life1<1)
      {
        life1=life1+2*n;
      }
      if(life2<1)
      {
        life2=life2+2*t;
      }
      System.out.println("A1 Player " + life1);
      System.out.println("B2 Player " + life2);
      if (life1==1)
      {
        break;
      }
      if(life2==1)
      {
       break;
      }
    }
    if ( life2 == 1)
    {
      System.out.println("Player2 is a winner");
    }
    else if (life1 == 1 )
    {
      System.out.println("Player1 is a winner");
    }
    else
    {
      System.out.println("It's a draw");
    }
  }

}
