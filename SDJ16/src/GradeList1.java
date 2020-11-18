import java.util.Scanner;

public class GradeList1
{
  public Grade1[] grades;

  public GradeList1(int numberOfGrade)
  {
    String n;
    int g;
    Grade1 g1 = new Grade1("q", 1);
    Scanner input = new Scanner(System.in);
    Grade1[] grod = new Grade1[numberOfGrade];
    for (int i = 0; i < numberOfGrade; i++)
    {
      System.out.println(" Grade " + (i + 1) + ": ");
      g = input.nextInt();
      input.nextLine();
      while ((!(g == -3 || g == 0 || g == 2 || g == 4 || g == 7 || g == 10
          || g == 12)))
      {
        System.out.println("Wrong format, please try again :");
        g = input.nextInt();
        input.nextLine();
      }
      System.out.println(" Course " + (i + 1) + ": ");
      n = input.nextLine();
      g1.setGrade(g);
      g1.setName(n);
      grod[i] = g1;

    }
    this.grades = grod;
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public Grade1 getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(int index, int grade)
  {
    grades[index].setGrade(grade); ;
  }

  public double average()
  {
    int sum = 0;
    for (int i = 0; i < grades.length; i++)
    {
      sum = sum + grades[i].getGrade();
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

  public boolean equals(GradeList1 list2)
  {
    boolean arraysEqual = true;
    if (getNumberOfGrades() != list2.getNumberOfGrades())
      arraysEqual = false;
    else
    {
      for (int i = 0; i < getNumberOfGrades(); i++)
      {
        if (grades[i].getGrade() != list2.getGrade(i).getGrade())
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
    int y = input.nextInt();
    GradeList1 list = new GradeList1(x);
    GradeList1 list2 = new GradeList1(y);
    System.out.println(list.getNumberOfGrades());
    System.out.println(list.getGrade(0));
    System.out.println(list.getGrade(1));
   // System.out.println(list.getGrade(2));
    System.out.println(list.average());
    System.out.println(list.toString());
    System.out.println(list.equals(list2));
  }

}


