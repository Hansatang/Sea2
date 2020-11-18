import java.util.Scanner;

public class GradeList
{
  public int[] grades;

  public GradeList(int numberOfGrade)
  {
    Scanner input = new Scanner(System.in);
    int[] grod = new int[numberOfGrade];
    int p;
    for (int i = 0; i < numberOfGrade; i++)
    {
      System.out.println(" Grade " + (i + 1) + ": ");
      grod[i] = input.nextInt();
      while (!(grod[i] == -3 || grod[i] == 0 || grod[i] == 2 || grod[i] == 4 || grod[i] == 7 || grod[i] == 10
          || grod[i] == 12))
      {
        System.out.println("Wrong format, please try again :");
        grod[i] = input.nextInt();
      }
    }
    this.grades = grod;
  }

  public GradeList()
  {

    int[] grod = new int[3];
    grod[0] = 7;
    grod[1] = 10;
    grod[2] = 12;
    this.grades = grod;
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public int getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(int index, int grade)
  {
    grades[index] = grade;
  }

  public double average()
  {
    int sum = 0;
    for (int i = 0; i < grades.length; i++)
    {
      sum = sum + grades[i];
    }
    return (double) sum / grades.length;
  }

  public String toString()
  {
    String str = "List of " + grades.length + " consist of:";
    for (int i = 0; i < grades.length; i++)
    {
      str = str + " Grade " + (i + 1) + " is " + grades[i] + ", ";
    }
    str = str + " and the average is equal to " + average() + ".";
    return str;
  }

  public boolean equals(GradeList list2)
  {
    boolean arraysEqual = true;
    if (getNumberOfGrades() != list2.getNumberOfGrades())
      arraysEqual = false;
    else
    {
      for (int i = 0; i < getNumberOfGrades(); i++)
      {
        if (grades[i] != list2.getGrade(i))
        {
          arraysEqual = false;
          break;
        }
      }
    }
    return arraysEqual;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of grades: ");
    int x = input.nextInt();
    GradeList list = new GradeList(x);
    GradeList list2 = new GradeList();
    System.out.println(list.getNumberOfGrades());
    System.out.println(list.getGrade(0));
    System.out.println(list.getGrade(1));
    System.out.println(list.getGrade(2));
    System.out.println(list.average());
    System.out.println(list.toString());
    System.out.println(list.equals(list2));
  }

}
