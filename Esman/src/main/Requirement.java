package main;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Requirement implements Serializable {

  private int requirementId;
  private int estimatedTime; //Hours

  private String title;
  private String userStory;

  private ArrayList < Task > tasks;
  private ArrayList < Member > members;

  private LocalDate requirementDeadline;
  private Project project;
  private Status requirementStatus;

  public Requirement(int requirementId, String title, String userStory, Project project, LocalDate requirementDeadline, ArrayList < Member > members) {

    this.title = title;

    this.requirementId = requirementId;
    this.userStory = userStory;
    this.requirementDeadline = requirementDeadline;

    this.estimatedTime = 0;
    this.requirementStatus = Status.NOT_STARTED;
    this.tasks = new ArrayList < >();
    this.members = members;

  }

  public int getRequirementId() {
    return requirementId;
  }

  public ArrayList < Task > getTasks() {
    return tasks;
  }

  public String getTitle() {
    return title;
  }

  public String getUserStory() {
    return userStory;
  }

  public Status getRequirementStatus() {
    return requirementStatus;
  }

  public LocalDate getRequirementDeadline() {
    return requirementDeadline;
  }

  public int getEstimatedTime() {
    return estimatedTime;
  }

  public ArrayList < Member > getMembers() {
    return members;
  }
}