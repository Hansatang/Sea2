public class SquareAndMultiply
{
  public int squareAndMultiply(int base, int exponent, int modulo)
  {
    int[] exponentAsArr = new int[32];
    for (int i = 31; i >= 0; i--)
    {
      exponentAsArr[i] = exponent % 2;
      exponent = exponent / 2;
    }

    int start = 0;
    for (int i = 0; i < exponentAsArr.length; i++)
    {
      if (exponentAsArr[i] == 1)
      {
        start = i + 1;
        break;
      }
    }
    int z = base;
    for (int i = start; i < exponentAsArr.length; i++)
    {
      if (exponentAsArr[i] == 0)
      {
        z = (z * z) % modulo;
      }
      else if (exponentAsArr[i] == 1)
      {
        z = (z * z * base) % modulo;
      }
    }
    return z;
  }

}
