public class IllegalDateException extends RuntimeException
{
  public IllegalDateException(String msg)
  {
    super("Invalid name: " + msg);
  }
}
