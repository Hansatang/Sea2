public class Person
{
  private String name, address;

  public Person(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String toString()
  {
    return "Name: "+name+" ,Address: "+address;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
    {
      return false;
    }
    Person other = (Person) obj;
    return name.equals(other.getName()) && address.equals(other.getAddress());
  }
}
