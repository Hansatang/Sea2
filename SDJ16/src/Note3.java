public class Note3
{
  private String message;
  private boolean highPriority;

  public Note3(String message)
  {
    this.message = message;
    highPriority = false;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }



  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setToHighPriority()
  {
    highPriority = true;
  }

  public void setToLowPriority()
  {
    highPriority = false;
  }

  public Note3 copy()
  {

    Note3 note3 = new Note3(message);

    if(highPriority)
    {
      note3.setToHighPriority();
    }

    return note3;
  }

  public String toString()
  {
    String str = message;

    if(highPriority)
    {
      str+= " (high priority)";
    }

    return str;
  }
}
