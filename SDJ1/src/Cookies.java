public class Cookies
{
  private final int quantity;

  public Cookies( int quantity)
    {
      this.quantity = quantity;
    }

  public int getQuantity()
  {
    return quantity;
  }

  public String toString()
  {
    return ("You just eat "+ getQuantity()/4*30 +" calories");
  }
}

