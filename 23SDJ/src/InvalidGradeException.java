public class InvalidGradeException extends RuntimeException
{
  public InvalidGradeException(String msg)

  {
    super("Invalid name: " + msg);
  }
}
