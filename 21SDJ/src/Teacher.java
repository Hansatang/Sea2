import java.util.ArrayList;

public class Teacher extends Employee
{

  private ArrayList<String> courses;

  public Teacher(String name, String address, int employeeId)
  {
    super(name, address, employeeId);
    this.courses = new ArrayList<>();
  }

  public ArrayList<String> getCourses()
  {
    return courses;
  }

  public void AddCourses(String course)
  {
    courses.add(course);
  }

  public String getCourse(int index)
  {
    return courses.get(index);
  }

  public String toString()
  {
    return super.toString() + " , courses: " + courses;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Teacher))
    {
      return false;
    }

    Teacher other = (Teacher) obj;

    return super.equals(other) && courses.equals(other.courses);
  }
}
