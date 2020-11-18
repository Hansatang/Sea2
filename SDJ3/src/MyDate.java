import java.util.GregorianCalendar;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;

  }

  public MyDate(MyDate obj)
  {
    this.day = obj.getDay();
    this.month = obj.getMonth();
    this.year = obj.getYear();
  }

  public MyDate()
  {
    this.day = currentDate.get(GregorianCalendar.DATE);
    this.month = currentDate.get(GregorianCalendar.MONTH) + 1;
    this.year = currentDate.get(GregorianCalendar.YEAR);
  }

  GregorianCalendar currentDate = new GregorianCalendar();
  int currentDay = currentDate.get(GregorianCalendar.DATE);
  int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
  int currentYear = currentDate.get(GregorianCalendar.YEAR);

  public static MyDate today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);

    return new MyDate(currentDay, currentMonth, currentYear);
  }

  String[] zodiac = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo",
      "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};

  String[] weekly = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday",
      "Thursday", "Friday"};

  String[] monthly = {"January", "February", "March", "April", "May", "June",
      "July", "August", "September", "October", "November", "December"};

  public boolean isBefore(MyDate obj)
  {
    if (year < obj.getYear())
    {
      return true;
    }
    else if (year > obj.getYear())
    {
      return false;
    }
    else
    {
      if (month < obj.getMonth())
      {
        return true;
      }
      else if (month > obj.getMonth())
      {
        return false;
      }
      else
      {
        if (day < obj.getDay())
        {
          return true;
        }
        else if (day > obj.getDay())
        {
          return false;
        }
        else
        {
          return true;
        }
      }
    }
  }

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

  public boolean isLeapYear(int year)
  {
    if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int defGregorian()
  {
    int leaper = 0;
    for (int i = 1582; i <= year + 1; i++)
    {
      if (isLeapYear(i))
      {
        System.out.println("Enter AA");
        leaper++;
      }

    }
    return leaper;
  }

  public int defGregorian(int startY, int endY)
  {
    int leaper = 0;
    for (int i = startY; i <= endY + 1; i++)
    {
      if (isLeapYear(i))
      {
        System.out.println("Enter AA");
        leaper++;
      }

    }
    return leaper;
  }

  public int nextDays(int times)
  {
    for (int i = 1; i <= times; i++)
    {
      nextDay();
    }
    return day;
  }

  public int nextDay()
  {
    day = day + 1;
    if (day == getDayInMonth(month) + 1)
    {
      day = 1;
      month = month + 1;
      if (month == 13)
      {
        month = 1;
        year = year + 1;
      }
      return day;
    }
    else
    {
      return day;
    }
  }

  public boolean equals(MyDate obj)
  {
    return year == obj.getYear() && month == obj.getMonth() && day == obj
        .getDay();
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public int dayTill()
  {
    MyDate date1 = new MyDate(21, 10, 2020);
    int daysTill = 0;

    for (int k = year; k <= date1.getYear(); k++)
      if (year != date1.getYear())
      {

        for (int j = 1; j <= 12; j++)
        {
          for (int i = day; i <= getDayInMonth(month); i++)
          {
            nextDay();
            daysTill = daysTill + 1;
            if (month == date1.getMonth() && day == date1.getDay())
            {
              break;
            }
          }
        }
      }
      else
      {
        System.out.print("k ");
        System.out.println(k);
        for (int j = month; j <= date1.getMonth(); j++)
        {
          System.out.print("j ");
          System.out.println(j);
          for (int i = day; i <= getDayInMonth(month); i++)
          {
            System.out.print("i ");
            System.out.println(i);
            nextDay();
            daysTill = daysTill + 1;
            if (month == date1.getMonth() && day == date1.getDay())
            {
              break;
            }
          }
        }
      }
    System.out.println();
    return daysTill;
  }

  public void setDay(int day)
  {
    try
    {
      if (day>getDayInMonth(month))
      {
        throw new IllegalDateException("fuck");
      }
      this.day = day;
    }
    catch (IllegalDateException e)
    {
      e.printStackTrace();
    }

  }

  public void setMonth(int month)
  {

    try
    {
      if (month>12)
      {
        throw new IllegalDateException("fuck");
      }
      this.month = month;
    }
    catch (IllegalDateException e)
    {
      e.printStackTrace();
    }

  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public String displayDate()
  {
    return (getDay() + "/" + getMonth() + "/" + getYear());
  }

  public String getMonthName(int month)
  {
    return monthly[month - 1];
  }

  public int getDayInMonth(int month)
  {
    switch (month)
    {
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      case 1:
        return 31;
      case 11:
      case 9:
      case 6:
      case 4:
        return 30;
      case 2:
        if (!isLeapYear(year))
        {
          return 28;
        }
        else
        {
          return 29;
        }
      default:
        return 0;
    }
  }

  private boolean zodiacHelp(int dayStart, int monthStart, int dayEnd,
      int monthEnd)
  {
    return (month == monthStart && day >= dayStart
        || month == monthEnd && day <= dayEnd);
  }

  public String zodiac()
  {
    if (dayInYear() >= 20 && dayInYear() <= 49)
    {
      return zodiac[10];
    }
    else if (dayInYear() >= 50 && dayInYear() <= 81)
    {
      return zodiac[11];
    }
    else if (zodiacHelp(19, 3, 19, 4))
    {
      return zodiac[0];
    }
    else if (dayInYear() >= 113 && dayInYear() <= 142)
    {
      return zodiac[1];
    }
    else if (dayInYear() >= 143 && dayInYear() <= 173)
    {
      return zodiac[2];
    }
    else if (dayInYear() >= 174 && dayInYear() <= 206)
    {
      return zodiac[3];
    }
    else if (dayInYear() >= 207 && dayInYear() <= 237)
    {
      return zodiac[4];
    }
    else if (dayInYear() >= 238 && dayInYear() <= 267)
    {
      return zodiac[5];
    }
    else if (dayInYear() >= 268 && dayInYear() <= 297)
    {
      return zodiac[6];
    }
    else if (dayInYear() >= 298 && dayInYear() <= 327)
    {
      return zodiac[7];
    }
    else if (dayInYear() >= 328 && dayInYear() <= 358)
    {
      return zodiac[8];
    }
    else
    {
      return zodiac[9];
    }
  }

  public String getDayName()
  {
    int q = getDay();
    int m;

    if (month <= 2)
    {
      m = month + 12;
    }
    else
    {
      m = month;
    }
    int k, j;
    if (m == 13 || m == 14)
    {
      k = (getYear() - 1) % 100;
    }
    else
    {
      k = getYear() % 100;
    }

    if (m == 13 || m == 14)
    {
      j = (getYear() - 1) / 100;
    }
    else
    {
      j = getYear() / 100;
    }

    int a;
    a = (int) ((q + 0.2 * (13 * m + 13) + k + 0.25 * k + 0.25 * j + 5 * j) % 7);
    return weekly[a];
  }

  public int dayInYear()
  {
    int j = 0;
    for (int i = 0; i < month; i++)
    {
      j += getDayInMonth(i);
    }
    return j + getDay();


    /*
    int tm = month + 1;
    int j = 0;
    int[] nums = {0, 31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int i = 0; i < month; i++)
    {
      j = j + nums[i];
    }
    return j + day;

     */
     /* System.out.println(tm);
      if (i == 2 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
      {
        j = j + 31;
      }
      if (i == 4 || i == 6 || i == 9 || i == 11)
      {
        j = j + 30;
      }
      if (i == 3 && !isLeapYear())
      {
        j = j + 28;
      }
      if (i == 3 && isLeapYear())
      {
        j = j + 29;
      }
      else
      {
        j = 0;
      }
    }
    return j + day;

      */
  }

  public int yearsTillToday()
  {
    MyDate dzis = new MyDate();

    return -year + dzis.getYear();
  }
}

