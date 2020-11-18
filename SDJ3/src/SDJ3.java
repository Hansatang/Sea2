public class SDJ3
{
  /*
  private String name;
  private String birthday;

  public SDJ3()
  {
    this.name = name;
    this.birthday = birthday;
  }
  public String getName()
  {
    return name;
  }

  public String getBirthday()
  {
    return birthday;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setBirthday(String birthday)
  {
    this.birthday = birthday;
  }
   */
  private int day;
  private int month;
  private int year;

  SDJ3 Date = new SDJ3();

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void setDay(int day)
  {
    this.day = day;
  }

  public void setMonth(int month)
  {
    this.month = month;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public String displayDate()
  {
   return (getDay() + "/" + getMonth() + "/" + getYear());
  }

}
