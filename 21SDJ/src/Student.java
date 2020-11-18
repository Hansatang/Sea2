import java.util.ArrayList;

public class Student extends Person
{
  private int studentId;
  private ArrayList<String> grades;


  public Student(String name, String address, int studentId
      )
  {
    super(name, address);
    this.studentId = studentId;
    this.grades = new ArrayList<>();
  }

  public int getStudentId()
  {
    return studentId;
  }

  public ArrayList<String> getGrades()
  {
    return grades;
  }

  public void setStudentId(int studentId)
  {
    this.studentId = studentId;
  }

  public void addGrades(String grade)
  {
    grades.add(grade);
  }

  public String getGrades(int index)
  {
    return grades.get(index);
  }

  public ArrayList<String> allGrades()
  {
    return grades;
  }

  public String toString()
  {
    return super.toString()+" ,StudentId: "+studentId+" , grades:"+grades;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
    {
      return false;
    }
    Student other = (Student) obj;
    return super.equals(other) && studentId == other.getStudentId() && grades.equals(other.allGrades());
  }

}
