package Clock1;

public class Clock1
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24;
  private int isAM;

  public Clock1(int hour, int minute, int second)
  {
    if (hour >= 0 && hour < 24)
    {
      this.hour = hour;
    }
    else
    {
      System.out.println("zla wartosc minut, wprowadzono domyslnie 0");
      this.hour = 0;
    }
    if (minute >= 0 && minute < 60)
    {
      this.minute = minute;
    }
    else
    {
      System.out.println("zla wartosc minut, wprowadzono domyslnie 0");
      this.minute = 0;
    }
    if (second >= 0 && second < 60)
    {
      this.second = second;
    }
    else
    {
      System.out.println("zla wartosc sekund, wprowadzono domyslnie 0");
      this.second = 0;
    }
    this.timeFormat24 = hour >= 12;

  }

  public Clock1(int totalSeconds)
  {
    setTotalSeconds(totalSeconds);
    this.timeFormat24 = hour >= 12;
  }

  public void setTotalSeconds(int totalSeconds)
  {
    this.hour = totalSeconds / 3600;
    this.minute = (totalSeconds % 3600) / 60;
    this.second = (totalSeconds % 3600) % 60;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public int isAM()
  {
    return isAM;
  }

  public boolean isTimeFormat24()
  {
    return timeFormat24;
  }

  public int getTimeInSecond()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public void setClock(int hour, int minute, int second)
  {
    if (0 <= hour && hour < 24)
    {
      this.hour = hour;
    }
    else
    {
      System.out.println("zla wartosc godzin, wprowadzono domyslnie 0");
      this.hour = 0;
    }
    if (0 <= minute && minute < 60)
    {
      this.minute = minute;
    }
    else
    {
      System.out.println("zla wartosc minut, wprowadzono domyslnie 0");
      this.minute = 0;
    }
    if (0 <= second && second < 60)
    {
      this.second = second;
    }
    else
    {
      System.out.println("zla wartosc sekund, wprowadzono domyslnie 0");
      this.second = 0;
    }
  }

  public void setMinute(int minute)
  {
    this.minute = minute;
  }

  public void setHour(int hour)
  {
    this.hour = hour;
  }

  public void setSecond(int second)
  {
    this.second = second;
  }

  public Clock1 copy()
  {
    return new Clock1(hour, minute, second);
  }

  public void setAM(int AM)
  {
    isAM = AM;
  }

  public void setTimeFormat(int hourFormat)
  {
    if (hourFormat == 24 && !isTimeFormat24())
    {
      System.out.println("Zguba2");
      this.timeFormat24 = true;
      if(isAM==1)
      {
        setAM(0);
      }
else if (isAM == 2)
      {
        hour=hour+12 ;
        setAM(0);
      }
    }
    else if (hourFormat == 12 && isTimeFormat24())
    {
      System.out.println("Zguba2");

      if(hour >=12)
      {
        hour=hour-12;
        setAM(2);
        this.timeFormat24 = false;
      }
      else if(hour <12)
      {
        setAM(1);
        this.timeFormat24 = false;
      }
    }
    else if (hourFormat == 12 && !isTimeFormat24())
    {
      System.out.println("Zguba3");

      if(hour >=12)
      {
        hour=hour-12;
        setAM(2);
        this.timeFormat24 = false;
      }
      else if(hour <12)
      {
        setAM(1);
        this.timeFormat24 = false;
      }
    }
  }

  public void tic1()
  {
    this.second = second + 1;
    if (second == 60)
    {
      setSecond(0);
      setMinute(minute + 1);
      if (minute == 60)
      {
        setMinute(0);
        setHour(hour + 1);
      }
    }
  }

  public boolean isBefore(Clock1 time)
  {
    int sec2 = getTimeInSecond();
    return sec2 < time.getTimeInSecond();
  }

  public Clock1 timeTo(Clock1 time)
  {
    Clock1 clock3 = new Clock1(0);
    int sec2 = getTimeInSecond();
    int dif = sec2 - time.getTimeInSecond();
    if (sec2 > time.getTimeInSecond())
    {
      clock3.setTotalSeconds(86400 - dif);
      return clock3;
    }
    else if (sec2 == time.getTimeInSecond())
    {
      clock3.setTotalSeconds(86400);
      return clock3;
    }
    else
    {
      clock3.setTotalSeconds(-dif);
      return clock3;
    }
  }

  public String SimpleTime()
  {
    String str1;
    String str2;

    if (hour < 10)
    {
      str1 = "0" + hour;
    }
    else
    {
      str1 = "" + hour;
    }

    if (minute < 10 && second <= 30)
    {
      str2 = "0" + minute;
    }
    else if (minute < 10 && second >= 30)
    {
      str2 = "0" + (minute + 1);
    }
    else if (minute == 59 && second >= 30)
    {
      int temp = hour + 1;
      if (temp < 10)
      {
        str1 = "0" + temp;
      }
      else
      {
        str1 = "" + temp;
      }
      str2 = "00";
    }
    else if (minute >= 10 && second >= 30)
    {
      str2 = "" + (minute + 1);
    }
    else
    {
      str2 = "" + minute;
    }
    return (str1 + ":" + str2);
  }

  public String toString()

  {
    String str1;
    String str2;
    String str3;
    if (hour < 10)
    {
      str1 = "0" + hour;

    }
    else
    {
      str1 = "" + hour;

    }
    if (minute < 10)
    {
      str2 = "0" + minute;

    }
    else
    {
      str2 = "" + minute;

    }
    if (second < 10)
    {
      str3 = "0" + second;

    }
    else
    {
      str3 = "" + second;
    }

    if (isAM==1)
  {
    return (str1 + ":" + str2 + ":" + str3 +"AM");
  }
    else if (isAM==2)
    {
      return (str1 + ":" + str2 + ":" + str3 +"PM");
    }
    else
    {
      return (str1 + ":" + str2 + ":" + str3 +"NN" );
    }
  }
/*  public String toString()
  {
    String str1;
    String str2;
    String str3;
    int help;
    if (hour > 12 && isTimeFormat24())
    {
      System.out.println("aa");
      str1 = "" + hour;
    }
    else if (hour <= 12 && isTimeFormat24() && hour >= 10 && isAM == 0)
    {
      System.out.println("bb");
      str1 = "" + hour;
    }
    else if (hour < 10 && isTimeFormat24() && isAM == 0)
    {
      System.out.println("cc");
      str1 = "0" + hour;
    }

    else if (hour <= 12 && isTimeFormat24() && hour >= 10 && isAM == 1)
    {
      System.out.println("bb1");
      str1 = "" + hour;
    }
    else if (hour < 10 && isTimeFormat24() && isAM == 2)
    {
      System.out.println("cc2");
      str1 = "" + (hour + 12);
    }


    else if (hour >= 12 && !isTimeFormat24())
    {
      System.out.println("dd");
      str1 = "" + (hour - 12);
      setAM(2);
    }
    else if (hour <= 12 && !isTimeFormat24() && hour >= 10 && isAM==2)
    {
      System.out.println("ee4");
      str1 = "" + hour;

    }
    else if (hour <= 12 && !isTimeFormat24() && hour >= 10)
    {
      System.out.println("ee");
      str1 = "" + hour;
      setAM(1);

    }

    else if (hour < 10 && !isTimeFormat24() && isAM==2)
    {
      System.out.println("ee2");
      str1 = "" + hour;

    }
    else if (hour < 10 && !isTimeFormat24() )
    {
      System.out.println("ee1");
      str1 = "" + hour;
      setAM(1);

    }
    else
    {
      System.out.println("ff");
      str1 = "" + hour;
    }




    if (hour < 10)
    {
      str1 = "0" + hour;
    }
    else
    {
      str1 = "" + hour;
    }
    if (minute < 10)
    {
      str2 = "0" + minute;
    }
    else
    {
      str2 = "" + minute;
    }

    if (second < 10)
    {
      str3 = "0" + second;
    }
    else
    {
      str3 = "" + second;
    }

    if (!isTimeFormat24() && isAM == 1)
    {
      return (str1 + ":" + str2 + ":" + str3 + "AM");
    }
    else if (!isTimeFormat24() && isAM == 2)
    {
      return (str1 + ":" + str2 + ":" + str3 + "PM");
    }
    else
    {
      return (str1 + ":" + str2 + ":" + str3);
    }

  }


 */
}

