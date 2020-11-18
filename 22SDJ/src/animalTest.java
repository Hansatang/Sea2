import java.util.ArrayList;

public class animalTest
{
  private ArrayList<animal> animals;

  public animalTest()
  {
    this.animals = new ArrayList<>();
  }

  public void AddAnimal(animal an)
  {
    animals.add(an);
  }

  public String toString()
  {
    String str = "";
    for (animal an : animals)
    {
      str += an.speak()+" ,";
    }
    return str;
  }

  public static void main(String[] args)
  {
    animal f1 = new Frog(11, "red");
    System.out.println(f1.speak());
    animal d1 = new dog(12, "rob");
    dog d2 = new dog(12, "rob");
    System.out.println(d1.speak());
    animalTest an1 = new animalTest();
    an1.AddAnimal(f1);
    an1.AddAnimal(d1);
    System.out.println(an1.toString());
    System.out.println(d2.equals(d1));
  }
}
