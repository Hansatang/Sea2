public class Requirement
{
  private int reqId;
  private String userStory ;
  private int reqEstimate;
  private int reqDeadline;
  private String memberName;
  private String reqStatus;
  private Task task;
  private WorkDone workDone;

  public int getReqId()
  {
    return reqId;
  }

  public String getUserStory()
  {
    return userStory;
  }

  public int getReqEstimate()
  {
    return reqEstimate;
  }

  public int getReqDeadline()
  {
    return reqDeadline;
  }

  public String getMemberName()
  {
    return memberName;
  }

  public String getReqStatus()
  {
    return reqStatus;
  }

  public WorkDone getWorkDone()
  {
    return workDone;
  }
}
