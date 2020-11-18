public class Studencina
{
  private String name;
  private int grade;

  public Studencina(String name, int grade)
  {
    this.name = name;
    switch (grade)
    {
      case -3:
      case 0:
      case 2:
      case 4:
      case 7:
      case 10:
      case 12:
        this.grade = grade;
        break;
      default:
        this.grade=grade;
        throw new InvalidGradeException("Grade is incorrect");
    }
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    switch (grade)
    {
      case -3:
      case 0:
      case 2:
      case 4:
      case 7:
      case 10:
      case 12:
        this.grade = grade;
      default:
        throw new InvalidGradeException("Grade is null");
    }
  }
}

