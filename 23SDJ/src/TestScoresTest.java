import java.util.ArrayList;
import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    TestScores score = new TestScores();
    ArrayList<Integer> grades = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++)
    {
      System.out.println("Enter grade:");
      int z = input.nextInt();
      grades.add(z);

    }
    System.out.println(grades);
    score = new TestScores(grades);


    System.out.println(score.getAverage());

  }
}
