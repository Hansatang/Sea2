public class MyPerson
{
  public String name, adress;
  public MyDate birthday;

  public MyPerson(String name, String adress, MyDate birthday)
  {
    this.name = name;
    this.adress = adress;
    this.birthday = birthday;
  }

  public MyPerson(String name, MyDate birthday)
  {
    this.name = name;
    this.adress = null;
    birthday = new MyDate(0, 0, 0);
  }

  public MyPerson(MyDate birthday)
  {
    this.name = null;
    this.adress = null;
    birthday = new MyDate(0, 0, 0);
  }

  public String getName()
  {
    return name;
  }

  public String getAdress()
  {
    return adress;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public void setBirthday(MyDate birthday)
  {
    this.birthday = birthday;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAdress(String adress)
  {
    this.adress = adress;
  }

  public int getAge()
  {
    MyDate dzis = new MyDate();
    if (birthday.getMonth() > dzis.getMonth() || birthday.getDay() > dzis
        .getDay())
    {
      System.out.println("a");
      return (birthday.yearsTillToday());
    }
    else
    {
      System.out.println("b");
      return (birthday.yearsTillToday() + 1);
    }
  }

  public String toString()
  {
    return "name= " + name + " " + ", adress= " + adress + " " + ", birthday= "
        + birthday.getDay() + "/" + birthday.getMonth() + "/" + birthday
        .getYear();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyPerson))
    {
      return false;
    }
    MyPerson other = (MyPerson) obj;
    return name.equals(other.name) && adress.equals(other.adress)
        && birthday.getDay() == other.birthday.getDay()
        && birthday.getMonth() == other.birthday.getMonth()
        && birthday.getYear() == other.birthday.getYear();
  }
}


