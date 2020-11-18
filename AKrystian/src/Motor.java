public class Motor extends Vehicle {
  private String name;
  public Motor(String name) {
    this.name = name;
  }
  @Override
  public void drive() {
    System.out.println("Wheeeeleeee yuuuuuuuuuuuuuuhu");
  }
  @Override
  public double getSpeed() {
    return 120;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return "rampampam";
  }
}
