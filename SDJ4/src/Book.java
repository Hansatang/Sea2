public class Book
{
  private String name;
  private String title;
  private double pay;
  private int pages;

  public Book( String name,String title, double pay, int pages)
  {
    this.name = name;
    this.title = title;
    this.pay = pay;
    this.pages = pages;
  }

  public String getName()
  {
    return name;
  }

  public String getTitle()
  {
    return title;
  }

  public double getPay()
  {
    return pay;
  }

  public int getPages()
  {
    return pages;
  }

  public void setBook(String name, String title, double pay, int pages)
  {
    this.name = name;
    this.title = title;
    this.pay = pay;
    this.pages = pages;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setTitle()
  {
    this.title = title;
  }

  public void setPay(double pay)
  {
    this.pay = pay;
  }

  public void setPages(int pages)
  {
    this.pages = pages;
  }

  public void setLowerPay(double pay)
  {
    this.pay = 0.8*pay;
  }

  public String toString()
  {
    return getName()+" "+getTitle()+" "+getPay()+" "+getPages();
  }
}
