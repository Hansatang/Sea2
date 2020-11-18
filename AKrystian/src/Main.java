import java.util.ArrayList;

public class Main
{

  public static void main(String[] args)
  {
    Auto pojazd = new Auto(0,4,"red");
    Motor motor2 = new Motor("Janusz");

    Vehicle vehicle = new Auto(0,2,"Maruna");
    Vehicle vehicle2 = new Motor("Honda");

    ArrayList<Vehicle> lista= new ArrayList<>();
    lista.add(vehicle);
    lista.add(vehicle2);

    for (Vehicle spis: lista)
    {
      System.out.println(spis.getSpeed());
      System.out.println(spis.getText());
    }
  }

}
