public class Test
{
  public static void main(String[] args)
  {
    parkingMeter meter = new parkingMeter(325);
    ParkedCar car = new ParkedCar();
    car.setMake("Q");
    car.setColor("red");
    car.setLicenseNumber("125");
    car.setMake("Hyoundai");
    car.setMeter(meter);

    Officer man = new Officer("John", 357);
    man.check(car);
  }
}
