import java.util.ArrayList;

public class Kinder
{
  private int countTeacher;
  private ArrayList<Child> kids;

  public Kinder()
  {
    this.countTeacher = 0;
    this.kids = new ArrayList<Child>();
  }

  public void addTeacher()
  {
    countTeacher++;
  }

  public int countKids()
  {
    return kids.size();
  }

  public int countTeacher()
  {
    return countTeacher;
  }

  public int KidsAverageAge()
  {
    int amount=0;
    for (int i = 0; i < kids.size(); i++)
    {
      amount=amount+kids.get(i).getAge();
    }
    return amount/kids.size();
  }
}
