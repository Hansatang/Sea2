public class Auto
{
  public String make, model, color;
  public int licenseNumber, year;

  public Auto(String make, String model, String color, int licenseNumber,
      int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Auto(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = 00000;
    this.year = year;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public int getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getYear()
  {
    return year;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(int licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Auto copy()
  {
    return new Auto(make, model, color, licenseNumber, year);
  }

  public String toString()
  {
    return "Auto{" + "make='" + make + '\'' + ", model='" + model + '\''
        + ", color='" + color + '\'' + ", licenseNumber=" + licenseNumber
        + ", year=" + year + '}';
  }

  public boolean equals(Auto obj)
  {
    if (this.make.equals(obj.getMake()) && this.model.equals(obj.getModel())
        && this.color.equals(obj.getColor()) && this.licenseNumber == obj
        .getLicenseNumber() && this.year == obj.getYear())
    {
      return true;
    }
    else
    {
      return false;
    }

  }
}
