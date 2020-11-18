public class ParkedCar
{
  public String make, model, color, licenseNumber;
  public parkingMeter meter;

  public ParkedCar()
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.meter = new parkingMeter();
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

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public int getMeter()
  {
    return meter.getMinutes();
  }

  public void setMeter(parkingMeter meter)
  {
    this.meter = meter;
  }
}
