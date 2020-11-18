public class Weeki
{
  private int q, m, k, j;

  public Weeki(int day, String month, int year)
  {
    this.q = day;
    if (month.equals("January"))
    {
      this.m = 13;
    }
    else if (month.equalsIgnoreCase("February"))
    {
      this.m = 14;
    }
    else if (month.equalsIgnoreCase("march"))
    {
      this.m = 3;
    }
    else if (month.equalsIgnoreCase("April"))
    {
      this.m = 4;
    }
    else if (month.equalsIgnoreCase("May"))
    {
      this.m = 5;
    }
    else if (month.equalsIgnoreCase(" June"))
    {
      this.m = 6;
    }
    else if (month.equalsIgnoreCase("July"))
    {
      this.m = 7;
    }
    else if (month.equalsIgnoreCase("August"))
    {
      this.m = 8;
    }
    else if (month.equalsIgnoreCase("September"))
    {
      this.m = 9;
    }
    else if (month.equalsIgnoreCase("October"))
    {
      this.m = 10;
    }
    else if (month.equalsIgnoreCase("November"))
    {
      this.m = 11;
    }
    else if (month.equalsIgnoreCase("December"))
    {
      this.m = 12;
    }
    else
      this.m = 0;

    if (m == 13 || m == 14)
    {
      this.k = (year - 1) % 100;
    }
    else
    {
      this.k = year % 100;
    }

    if (m == 13 || m == 14)
    {
      this.j = (year - 1) / 100;
    }
    else
    {
      this.j = year / 100;
    }
  }

  public String getDay()
  {
    System.out.println(q);
    System.out.println(m);
    System.out.println(k);
    System.out.println(j);
    int a;
    a = (int) ((q + 0.2 * (13 * m + 13) + k + 0.25 * k+0.25*j + 5 * j) % 7);
    System.out.println(a);
    if (a==0)
    {
      return "Saturday";
    }
    else if (a==1)
    {
      return "Sunday";
    }
    else if (a==2)
    {
      return "Monday";
    }
    else if (a==3)
    {
      return "Tuesday";
    }
    else if (a==4)
    {
      return "Wednesday";
    }
    else if (a==5)
    {
      return "Thursday";
    }
    else if (a==7)
    {
      return "Friday";
    }
    else
    {
      return null;
    }
  }
}
