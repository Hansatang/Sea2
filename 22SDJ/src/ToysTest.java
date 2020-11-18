import java.util.ArrayList;

public class ToysTest
{
  private ArrayList<Toy> Toys;

  public ToysTest()
  {
    this.Toys = new ArrayList<>();
  }

  public void AddAnimal(Toy an)
  {
    Toys.add(an);
  }

  public String toString()
  {
    String str = "";
    for (Toy an : Toys)
    {
      str += an.play()+" ,";
    }
    return str;
  }

  public static void main(String[] args)
  {
    Toy f1 = new Football(8, 15);
    System.out.println(f1.play());
    Toy l1 = new Lego(12, 100);
    ToysTest list = new ToysTest();
    list.AddAnimal(f1);
    list.AddAnimal(l1);
    System.out.println(list.toString());
  }
}
