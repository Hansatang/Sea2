public abstract class animal
{
  private int age;

  public animal(int age)
  {
    this.age = age;
  }

  public abstract String speak();

  public boolean equals(Object obj)
  {
    if (!(obj instanceof animal))
    {
      return false;
    }
    animal other = (animal) obj;
    return age - other.age == 0;
  }
}
