import javax.swing.*;
import java.util.Scanner;

public class PC1
{
  public static void main(String[] args)
  {
    int k = 0;
    int l = 0;
   Object[] possibleValues = { "15", "25", "50" };

    Object selectedValue = JOptionPane.showInputDialog(null,
        "Choose one", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,
        possibleValues, possibleValues[0]);
    // String diameter = JOptionPane.showInputDialog("Enter the number");
    Scanner input = new Scanner(System.in);
    double d = Double.parseDouble(String.valueOf(selectedValue));
    for (int j = 1; j <= d; j++)
    {
      k = k + j;
      l = j;
      System.out.println("Sum of " + j + " is " + k);

    }
    JOptionPane.showMessageDialog(null, "Sum of " + l + " is " + k);
  }

}
