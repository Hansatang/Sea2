import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {
    this.cars = new ArrayList<>();
  }

  public ArrayList<Car> getCars()
  {
    return cars;
  }

  public Car getCar(int index)
  {
    return cars.get(index);
  }

  public void addCar(Car car)
  {
    if (indexOfRegNumber(car.getRegNumber()) == -1)
    {
      cars.add(car);
    }
  }



  public void deleteCarByReg(String req)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if(cars.get(i).getRegNumber().equals(req))
      {
        cars.remove(i);
        break;
      }
    }
  }

  public Car getCar(String str)
  {
    if ((indexOfRegNumber(str)) != -1)
    {
      return cars.get(indexOfRegNumber(str));
    }
    else
    {
      return null;
    }
  }

  public int getSize()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String str)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(str))
      {
        return i;
      }
    }
    return -1;
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < cars.size(); i++)
    {
      str+= "\n "+cars.get(i).toString();
    }
    return str;
  }
}
