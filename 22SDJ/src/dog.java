public class dog extends pet
{
  private String breed;
  public dog(int age, String breed)
  {
    super(age);
    this.breed=breed;
  }

  @Override public String speak()
  {
    return "How";
  }
}
