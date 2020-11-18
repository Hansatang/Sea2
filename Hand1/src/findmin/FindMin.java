package findmin;

public class FindMin
{
  public int findMin(int input1, int input2)
  {
    // TODO implement method
    {
      if (input1 < input2)
      {
        return input1;
      }
      if (input2 < input1)
      {
        return input2;
      }
      else
      {
        return 0;
      }
    }
  }
}

