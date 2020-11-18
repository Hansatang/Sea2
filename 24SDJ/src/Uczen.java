import java.io.Serializable;

public class Uczen implements Serializable
{
  private String firstName, lastName, country;

  public Uczen(String firstName, String lastName, String country)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString()
  {
    return "\t<student>\n" +
        "\t\t<firstname>"+firstName+"</firstname>\n"
        +"\t\t<lastname>"+lastName+"</lastname>\n"
        +"\t\t<country>" +country+  "</country>\n" +
        "\t</student>" ;
  }



  public boolean equals(Object obj)
  {
    if (!(obj instanceof Uczen))
    {
      return false;
    }
    Uczen other = (Uczen) obj;
    return firstName.equals(((Uczen) obj).getFirstName())
        && lastName.equals(((Uczen) obj).getLastName()) &&
    country.equals(((Uczen) obj).getCountry());
  }
}
