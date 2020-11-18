public class FullDegreeStudent extends Student
{
  private int semester;

  public FullDegreeStudent(String name, String address, int studentId,
      int semester)
  {
    super(name, address, studentId);
    this.semester = semester;
  }

  public int getSemester()
  {
    return semester;
  }

  public void setSemester(int semester)
  {
    this.semester = semester;
  }

  public String toString()
  {
    return super.toString()+" , semester: "+semester;
  }
  public boolean equals(Object obj)
  {
    if (!(obj instanceof FullDegreeStudent))
    {
      return false;
    }
   FullDegreeStudent other = (FullDegreeStudent) obj;
    return super.equals(other) && semester == other.getSemester();
  }

}
