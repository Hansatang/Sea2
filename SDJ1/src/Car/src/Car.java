package Car.src;

import Engine_v1.src.Engine_v1.Engine;

public class Car
{
  private final String make;
  private final String model;
  private String colour;
  private final boolean manualGear;
  private Engine engine;

  public Car(String make, String model, String colour, boolean manualGear,
      Engine engine)
  {
    this.make = make;
    this.model = model;
    this.colour = colour;
    this.manualGear = manualGear;
    this.engine = engine;
  }

  public Engine getEngine()
  {
    return engine;
  }

  public int getHorsePower()
  {
    return engine.getHorsePower();
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColour()
  {
    return colour;
  }

  public boolean hasManualGear()
  {
    return manualGear;
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public void setEngine(Engine engine)
  {
    this.engine = engine;

  }

  public String toString()
  {
    return (" The engine type is " + getMake() + " and it's model is "
        + getModel() + " and have color of " + getColour() + " and it's "
        + hasManualGear() + " information that this is diesel. " + engine
        .toString());
  }
}


