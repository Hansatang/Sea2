public class AlternatingHarmonicSeries
{

  public double alternatingHarmonicSeries(double n)
  {
    // TODO implement method
    double result = 0;
    double part1 = (-1)*(-1);
    for (int i = 1; i < n; i++)
    {

      result += part1/i;
      part1=part1*(-1);
    }
    System.out.println(result);
    return result;

  }
}
