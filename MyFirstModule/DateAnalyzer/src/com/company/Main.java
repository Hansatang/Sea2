package com.company;

import java.util.Scanner;

public class Main {

    public static class Date{
        int Day;
        int Month;
        int Year;
    }

    private static final String[] Months = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };

    private static final int[] CenturyCodeGregorian = {4, 2, 0, 6, 4, 2, 0 };

    private static final int[] MonthCode = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

    private static final int[] DaysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private static final String[] ZodiacSigns = { "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer",
            "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn" };

    private static final int[] ZodiacDays = { 21, 20, 21, 21, 21, 22, 23, 23, 22, 23, 23, 22 };

    private static final String[] DaysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    public String DateToString(Date D){return D.Day + " " +  Months[D.Month - 1] + " " + D.Year;}

    public Date GetDate(){
        Scanner in = new Scanner(System.in);
        Date Temp = new Date();
        System.out.println("Enter Year: ");
        Temp.Year = in.nextInt();

        System.out.println("Enter Month: ");
        Temp.Month = in.nextInt();
        while(Temp.Month < 1 || Temp.Month > 12){
            System.out.println("Enter Correct Month: ");
            Temp.Month = in.nextInt();
        }

        System.out.println("Enter Day: ");
        Temp.Day = in.nextInt();
        if(Temp.Month == 2 && (Temp.Year % 4) == 0){
            while (Temp.Day < 1 || Temp.Day > DaysInMonths[Temp.Month - 1] + 1){
                System.out.println("Enter Correct Day: ");
                Temp.Day = in.nextInt();
            }
        }
        else
            while (Temp.Day < 1 || Temp.Day > DaysInMonths[Temp.Month - 1]){
                System.out.println("Enter Correct Day: ");
                Temp.Day = in.nextInt();
            }

        return Temp;
    }

    public int CalculateDayInYear(Date D){
        int DayOfTheYear = D.Day;
        int LeapFactor = 0;
        if(D.Year % 4 == 0) LeapFactor = 1;

        for(int i = 1; i < D.Month; i++){
            if(i == 2)
                DayOfTheYear = DayOfTheYear + DaysInMonths[i - 1] + LeapFactor;
            else
                DayOfTheYear = DayOfTheYear + DaysInMonths[i - 1];
        }


        return DayOfTheYear;
    }

    public int CalculateDayInWeek(Date D){
        int CenturyCode;
        int CenturyFactor = D.Year / 100;
        if(CenturyFactor > 16 && CenturyFactor < 24) {
            CenturyCode = CenturyCodeGregorian[CenturyFactor - 17];
        } else {
            CenturyCode = (18 - D.Year % 100) % 7;
        }

        int YearsLastTwoDigits = D.Year - (D.Year / 100) * 100;
        int YearCode = (YearsLastTwoDigits + YearsLastTwoDigits / 4) % 7;
        int LeapCode = 0;
        if(D.Year % 4 == 0 && D.Month == 1) LeapCode = 1;
        if(D.Year % 4 == 0 && D.Month == 2) LeapCode = 1;

        return (YearCode + MonthCode[D.Month - 1] + CenturyCode + D.Day - LeapCode) % 7;
    }

    public int CalculateZodiacSign(Date D){
        Date Temp = new Date();
        Temp.Year = D.Year;
        Temp.Month = D.Month;
        Temp.Day = ZodiacDays[Temp.Month - 1];

        int ZodiacSignNumber;
        int Day = CalculateDayInYear(D);
        int SignDay = CalculateDayInYear(Temp);

        if(D.Month == 1 && Day <= SignDay)
            ZodiacSignNumber = 11;
        else if(Day < SignDay)
            ZodiacSignNumber = Temp.Month - 2;
        else
            ZodiacSignNumber = Temp.Month - 1;


        return ZodiacSignNumber;
    }

    public static void main(String[] args){
        Main obj = new Main();
        Date CurrentDate = obj.GetDate();

        System.out.println(obj.DateToString(CurrentDate) + " is " + DaysOfTheWeek[obj.CalculateDayInWeek(CurrentDate)]);
        System.out.println(obj.DateToString(CurrentDate) + " is the " + obj.CalculateDayInYear(CurrentDate) + " day of the year.");
        System.out.println("The zodiac sign for "+ obj.DateToString(CurrentDate) + " is: " + ZodiacSigns[obj.CalculateZodiacSign(CurrentDate)] + ".");
    }
}
