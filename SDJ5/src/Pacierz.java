import java.util.Scanner;

public class Pacierz {
    private static int[] grades = {0, 0, 0};

    private static int getGrade(int index){
            return grades[index];
    }

    private static void addGrade(int value, int index){
        grades[index] = value;
    }

    private static int getAverage(){
        int average;
        average = (grades[0] + grades[1] + grades[2]) / 3;
        return average;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Pacierz score = new Pacierz();

        for(int i = 0; i<3; i++){
            System.out.println("Enter grade:");
            int value = input.nextInt();
            addGrade(value, i);
        }

        for(int i = 0; i<3; i++){
            int value = getGrade(i);
            System.out.println(value + " ");
        }

        int average = score.getAverage();
        System.out.println("Average: " + average + " ");
    }

}
