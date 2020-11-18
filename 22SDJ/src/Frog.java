public class Frog extends animal
{
  private String colour;

  public Frog(int age, String colour)
  {
    super(age);
    this.colour=colour;
  }

  @Override public String speak()
  {
    return "Kum";
  }
}
