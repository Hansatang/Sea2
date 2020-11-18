package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;

public class Project implements Serializable
{

  private ArrayList<Requirement> requirements;
  private String projectName;
  private Status status;

  public Project(String projectName)
  {
    this.projectName = projectName;
    requirements = new ArrayList<>();
    status = Status.NOT_STARTED;
    System.out.println("Yes");
  }

  public void addRequirement(String requirementName, String userStory, LocalDate reqDeadline, ArrayList<Member> members)
  {
    Requirement requirement = new Requirement(requirements.size(),requirementName, userStory, this, reqDeadline, members);
    requirements.add(requirement);

  }

  public String getProjectName()
  {
    return projectName;
  }

  public ArrayList<Requirement> getRequirements()
  {
    return requirements;
  }
}
