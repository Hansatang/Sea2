import java.util.ArrayList;
import java.util.Scanner;

public class TestScores
{
  private int grade1, grade2, grade3;

  public TestScores(int grade1, int grade2, int grade3)
  {
    this.grade1 = grade1;
    this.grade2 = grade2;
    this.grade3 = grade3;
  }

  public TestScores(ArrayList<Integer> grades)
  {

    this.grade1 = grades.get(0);
    this.grade2 = grades.get(grades.size() - 2);
    this.grade3 = grades.get(grades.size() - 1);
  }

  public TestScores()
  {
    this.grade1 = grade1;
    this.grade2 = grade2;
    this.grade3 = grade3;
  }

  public int getGrade1()
  {
    return grade1;
  }

  public int getGrade2()
  {
    return grade2;
  }

  public int getGrade3()
  {
    return grade3;
  }

  public void setGrade(int grade1, int index)
  {
    this.grade1 = grade1;
  }

  public void setGrade1(int grade1)
  {
    this.grade1 = grade1;
  }

  public void setGrade2(int grade2)
  {
    this.grade2 = grade2;
  }

  public void setGrade3(int grade3)
  {
    this.grade3 = grade3;
  }

  public int getAverage()
  {
    return (grade3 + grade2 + grade1) / 3;
  }

  public String toString()
  {
    return getGrade1() + " " + getGrade2() + " " + getGrade3();
  }

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    TestScores score = new TestScores();
    ArrayList<Integer> grades = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++)
    {
      while (grades.size() != 3)
      {
        try
        {
          System.out.println("Enter grade:");
          int z = input.nextInt();

          if (z > 100)
          {
            throw new InvalidTestScore("Hue hue");
          }
          if (z < 0)
          {
            throw new InvalidTestScore("HA HA ha");

          }
          grades.add(z);
        }
        catch (InvalidTestScore e)
        {
          e.printStackTrace();
        }

      }
    }

    System.out.println(grades);
    score = new TestScores(grades);

    System.out.println(score.getAverage());

  }
}
