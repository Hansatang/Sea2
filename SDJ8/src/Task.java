public class Task
{
   private int reqId;
   private int taskId;
   private String taskDescriptor;
   private int taskEstimate;
   private int taskDeadline;
   private String memberName;
   private String taskStatus;
   private int taskHours;
   private WorkDone workDone;

   public Task(int reqId, int taskId, String taskDescriptor, int taskEstimate,
       int taskDeadline, String memberName, String taskStatus, int taskHours,
       WorkDone workDone)
   {
      this.reqId = reqId;
      this.taskId = taskId;
      this.taskDescriptor = taskDescriptor;
      this.taskEstimate = taskEstimate;
      this.taskDeadline = taskDeadline;
      this.memberName = memberName;
      this.taskStatus = taskStatus;
      this.taskHours = taskHours;
      this.workDone = workDone;
   }
}
