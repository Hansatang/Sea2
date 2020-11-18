import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lottery
{
  public ArrayList<Integer> numbers;

  public Lottery()
  {
    this.numbers = new ArrayList<>(5);
    for (int i = 0; i < 5; i++)
    {
      Random rand = new Random();
      int n = rand.nextInt(10);
      numbers.add(n);
    }

  }

  public void setNumbers(ArrayList<Integer> numbers)
  {
    this.numbers = numbers;
  }

  public int matching(Lottery dwa)
  {
    int m = 0;
    for (int i = 0; i < numbers.size(); i++)
    {
      if (numbers.get(i).equals(dwa.numbers.get(i)))
      {
        m++;
      }
    }
    return m;
  }

  public Lottery copy()
  {

    Lottery note = new Lottery();
    note.setNumbers(numbers);

    return note;
  }

  public String toString(Lottery trzy)
  {
    String str="Liczby krupiera : ";

    for (int i =0 ; i< numbers.size();i++)
    {
      str= str+ numbers.get(i)+" ";
    }

    str= str + "\nLiczby gracza   : ";
    for (int i =0 ; i< trzy.numbers.size();i++)
    {
      str= str+ trzy.numbers.get(i)+" ";
    }

    if (matching(trzy)==5)
    {
      return str+"\n You got them all right";
    }
    else if (matching(trzy)==0)
    {
      return str+"\n You got them all wrong";
    }
    else
    {
      return str+"\nNah, you got only "+matching(trzy);
    }
  }

  public static void main(String[] args)
  {
    Lottery mark = new Lottery();

    Scanner input = new Scanner(System.in);

    Lottery user = new Lottery();
    for (int i =0 ; i<mark.numbers.size();i++)
    {
      System.out.println("Enter "+(i+1));
      int z = input.nextInt();

      while (z>10 ||z<0)
      {
        System.out.println("wrong input dear");
        z = input.nextInt();
      }
      user.numbers.set(i, z);
    }


    System.out.println(mark.matching(user));
    System.out.println(mark.toString(user));

  }
}
