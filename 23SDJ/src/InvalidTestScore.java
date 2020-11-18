public class InvalidTestScore extends IllegalArgumentException
{

  public InvalidTestScore(String msg)
  {
    super("Invalid name: " + msg);
  }
}
