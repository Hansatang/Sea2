public class MyPerson
{
  public Brain brain;
  public String name;
  public MyDate birthday;
  public Address address;

  public MyPerson(String name, Address address, MyDate birthday, int size)
  {
    this.name = name;
    this.address = new Address("", "", "", "", "");
    this.birthday = birthday;
    this.brain = new Brain(size);
  }

  public MyPerson(String name, MyDate birthday,int size)
  {
    this.name = name;
    this.address = new Address("", "", "", "", "");
    birthday = new MyDate(0, 0, 0);
    this.brain = new Brain(size);
  }

  public MyPerson(MyDate birthday)
  {
    this.name = null;
    this.address = new Address("", "", "", "", "");
    birthday = new MyDate(0, 0, 0);
    this.brain = new Brain(4);
  }

  public String getShortAdress()
  {
    return address.getStreet() + " " + address.getNumber();
  }

  public boolean doYouRemember(String topic)
  {
    for (int i = 0; i < brain.MemoryItem.length; i++)
    {
      if (brain.MemoryItem[i]==null)
      {
        continue;
      }
      else if (brain.MemoryItem[i].equals(topic))
      {
        return true;
      }
    }
    return false;
  }

  public void rememberThis(String topic)
  {
    if (!doYouRemember(topic))
    {
      brain.remember(topic);
    }
    else
    {
      brain.refresh(topic);
    }
  }

  public String whatAreYouThinking()
  {
    return brain.recall();
  }

  public String getName()
  {
    return name;
  }

  public Address getAddress()
  {
    return address;
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

  public void setAddress(Address address)
  {
    this.address = address;
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
    return "I'm " + name + ", " + address + ", my birthday is on  " + birthday
        .getDay() + "/" + birthday.getMonth() + "/" + birthday.getYear()
        + ", " + brain.toString();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyPerson))
    {
      return false;
    }
    MyPerson other = (MyPerson) obj;
    return name.equals(other.name) && address.equals(other.address)
        && birthday.getDay() == other.birthday.getDay()
        && birthday.getMonth() == other.birthday.getMonth()
        && birthday.getYear() == other.birthday.getYear();
  }
}


