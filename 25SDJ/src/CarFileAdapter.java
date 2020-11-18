import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class CarFileAdapter implements Serializable
{
  private MyFileIO mfio;
  private String fileName;

  public CarFileAdapter(String fileName)
  {
    mfio = new MyFileIO();
    this.fileName = fileName;
  }

  public CarList getAllcars()
  {
    CarList cars = new CarList();
    try
    {
      cars = (CarList) mfio.readObjectFromFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return cars;
  }

  public void addCar(Car car)
  {
    CarList cars = getAllcars();
    cars.addCar(car);
    saveCars(cars);
  }

  public void deleteCar(Car car)
  {
    CarList cars = getAllcars();

    CarList cars1= new CarList();
    
    for (int i = 0; i < cars.getSize(); i++)
    {

      if(!(cars.getCar(i).equals(car)))
      {

        cars1.addCar(cars.getCar(i));

      }
    }

    saveCars(cars1);
  }

  public void deleteCarByReg(String regNumber)
  {
    CarList cars = getAllcars();
    CarList cars1= new CarList();
    for (int i = 0; i < cars.getSize(); i++)
    {
      if(!(cars.getCar(i).getRegNumber().equals(regNumber)))
      {

        cars1.addCar(cars.getCar(i));


      }
    }
    saveCars(cars1);
  }

  public void addCars(CarList cars)
  {
    CarList cars1 = getAllcars();
    for (int i = 0; i <cars.getSize() ; i++)
    {
      cars1.addCar(cars.getCar(i));
    }

    saveCars(cars1);
  }

  public void saveCars(CarList cars)
  {
    try
    {
      mfio.writeToFile(fileName, cars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }


}
