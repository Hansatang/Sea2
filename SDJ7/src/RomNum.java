import java.util.Scanner;

public class RomNum
{
  private int d;

  public RomNum(int d)
  {
    this.d = d;
  }

  public String toString()
  {
    if (d == 1)
    {
      return "I";
    }
    else if (d == 2)
    {
      return "II";
    }
    else if (d == 3)
    {
      return "III";
    }
    else if (d == 4)
    {
      return "IV";
    }
    else if (d == 5)
    {
      return "V";
    }
    else if (d == 6)
    {
      return "VI";
    }
    else if (d == 7)
    {
      return "VII";
    }
    else if (d == 8)
    {
      return "VIII";
    }
    else if (d == 9)
    {
      return "IX";
    }
    else if (d == 10)
    {
      return "X";
    }
    else
    {
      return null;
    }

  }

  public static void main(String[] args)
  {
    int d;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    d = input.nextInt();
    while (10 < d || d < 0)
    {
      System.out.println("Wrong format, please try again :");
      d = input.nextInt();
    }

    RomNum rom = new RomNum(d);
    System.out.println(rom.toString());

  }
}
