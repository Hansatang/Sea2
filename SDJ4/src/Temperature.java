public class Temperature
{
  private  double ftemp;

  public Temperature(double ftemp)
  {
    this.ftemp = ftemp;
  }

  public double getFtemp()
  {
    return ftemp;
  }

  public void setFtemp(double ftemp)
  {
    this.ftemp = ftemp;
  }

  public double getCelsius()
  {
    double ctemp = (((ftemp-32)*5))/9;
    return ctemp;
  }

  public double getKelvin()
  {
    double ktemp = ((((ftemp-32)*5)/9))+273;
    return ktemp;
  }
}
