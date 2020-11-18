public class Lego extends Toy
{
  private int amount;

  public Lego(int suitableAge, int amount)
  {
    super(suitableAge);
    this.amount=amount;
  }

  @Override public String play()
  {
    return "klocki";
  }
}
