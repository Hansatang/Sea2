public class Test2
{
  public static void main(String[] args)
  {
    Teacher t1 = new Teacher("Mark", "Nie", 12);
    System.out.println(t1.toString());
    Teacher t2 = new Teacher("Mark", "Nie", 12);
    System.out.println(t2.toString());
    System.out.println(t2.equals(t1));
    FullDegreeStudent f1 = new FullDegreeStudent("John", "Tak", 33, 2);
    System.out.println(f1.toString());
    FullDegreeStudent f2 = new FullDegreeStudent("John", "Tak", 33, 2);
    System.out.println(f2.toString());
    System.out.println(f2.equals(f1));
  }
}
