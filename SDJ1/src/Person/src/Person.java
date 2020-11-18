package Person.src;

public class Person
{

  private String name;
  private int age;
  private char gender;

  public Person(String name, int age, char gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;

  }

  public Person(String name, char gender)
  {
    this.name = name;
    this.age = 0;
    this.gender = gender;

  }

  public Person(char gender)
  {
    this.name = "qwerty";
    this.age = 0;
    this.gender = gender;

  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public char getGender()
  {
    return gender;
  }

  public String toString()
  {
    return ("The name is " + getName() + " and it have age of  " + getAge()
        + " and it's gender is " + getGender());
  }

  public String getAgeStatus()
  {
    if (age == 0)
    {
      return "Error";
    }
    else if (age > 0 && age <= 12)
    {
      return "Child";
    }
    else if (age > 12 && age <= 19)
    {
      return "Teenager";
    }
    else if (age > 19 && age <= 65)
    {
      return "Adult";
    }
    else
    {
      return "Senior";
    }
  }

    public String getStatus () {
    if (age <= 0)
    {
      return "Error";
    }
    else if (gender == 'm' || gender == 'M')
    {
      if (age <= 18)
      {
        return "Boy";
      }
      else
      {
        return "Man";
      }
    }
    else
    {
      if (age <= 18)
      {
        return "Girl";
      }
      else
      {
        return "Woman";
      }
    }
  }

}
   
