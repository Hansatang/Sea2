public class Van extends Car
{
  private int maxLoad;
  public Van(String owner, double price, String regNo,int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad=maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  public void setMaxLoad(int maxLoad)
  {
    this.maxLoad = maxLoad;
  }

  public String toString()
  {
    return super.toString()+" , maxLoad: "+maxLoad;
  }
};

