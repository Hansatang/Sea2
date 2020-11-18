package Calendar.src;

public class Calendar
{
   private int day;
   private int month;
   private int year;

   public Calendar(int day,int month,int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   
   }
   

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public void setDate(int day,int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
  

   public String toString()
   {
      return (getDay() + "/"
            + getMonth() + "/" + getYear() ) ;
   }
}
