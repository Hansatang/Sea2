public class Grade1
{
  public String name;
  public int  grade;

  public Grade1(String name, int grade)
  {
    this.name = name;
    this.grade = grade;
  }

  public String getName()
  {
    return name;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public String toString()
  {
    return "Name : "+name+" and grade : "+grade;
  }
}
