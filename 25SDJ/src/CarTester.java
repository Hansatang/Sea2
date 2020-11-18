public class CarTester
{
  public static void main(String[] args)
  {
    Owner o1 = new Owner("Allan","Henriksen");
    Car c1 = new Car("AL19742","Ferrari","F50",1997,o1 );
    Owner o2 = new Owner("Not","Me");
    Car c2 = new Car("HE23477","Audi","A7",2014,o2 );
    Owner o3 = new Owner("Charlie","Pace");
    Car c3 = new Car("XY54679","Toyota","Yaris",2007,o3 );

    CarList cl = new CarList();
    cl.addCar(c1);
    cl.addCar(c2);


   CarFileAdapter cfa = new CarFileAdapter("Caro.bin");
   cfa.saveCars(cl);
    System.out.println(cfa.getAllcars().toString());
    cfa.addCar(c3);
    System.out.println(cfa.getAllcars().toString());
    System.out.println("A");
    cfa.deleteCar(c1);
    System.out.println("B");
    System.out.println(cfa.getAllcars().toString());
  }
}
