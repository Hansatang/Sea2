public class StudencinaTest
{

  public static void main(String[] args)
  {
    Studencina s1 = new Studencina("mark", 4);
    try
    {
      Studencina s2 = new Studencina("mark2", 22);
      System.out.println(s2.getGrade());
    }
    catch (InvalidGradeException e)
    {
      e.printStackTrace();
      System.out.println(e.getMessage());

    }

    System.out.println("malpa");

    try
    {
      s1.setGrade(77);
    }
    catch (InvalidGradeException e)
    {

      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println(s1.getGrade());
    }

  }
}
