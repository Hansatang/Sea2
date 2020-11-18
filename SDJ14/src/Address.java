

public class Address
{
  public String street, number, postalCode, city, country;

  public Address(String st, String nu, String pc, String ci, String co)
  {
    this.street = st;
    this.number = nu;
    this.postalCode = pc;
    this.city = ci;
    this.country = co;
  }

  public void setAdress(String street, String number, String postalCode,
      String city, String country)
  {
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }

  public String getStreet()
  {
    return street;
  }

  public String getNumber()
  {
    return number;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public boolean equal(Object obj)
  {
    if (!(obj instanceof Address))
    {
      return false;
    }
    Address other = (Address) obj;
    return getPostalCode().equals(other.getPostalCode()) && getStreet()
        .equals(other.getStreet()) && getCity().equals(other.getCity())
        && getCountry().equals(other.getCountry()) && getNumber()
        .equals(other.getNumber());
  }

  public String toString()
  {
    return "I live at street " + getStreet() + ", number " + getNumber()
        + ", postalCode " + getPostalCode() +   ", city " + getCity()
        + ", country " + getCountry() ;
  }
}
