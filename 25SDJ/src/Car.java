import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber, make, model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner)
  {
    this.regNumber = regNumber;
    this.make = make;
    this.model = model;
    this.year = year;
    this.owner = owner;
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public void setRegNumber(String regNumber)
  {
    this.regNumber = regNumber;
  }

  public String getMake()
  {
    return make;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public void setOwner(Owner owner)
  {
    this.owner = owner;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public String getModel()
  {
    return model;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public String toString()
  {
    return regNumber + " " + make + " " + model + " " + year + " " + owner
        .getFirstName() + " " + owner.getLastName();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car) obj;
    return regNumber.equals(other.getRegNumber())
        && make
        .equals(other.getMake())
        && model.equals(other.getModel())
        && year == (other.getYear())
        && owner.equals(other.owner);
  }
}
