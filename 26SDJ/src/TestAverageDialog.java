import javax.swing.JOptionPane;

public class TestAverageDialog
{
  public static void main(String[] args)
  {
    int score1, score2, score3; // Three test scores
    String strInput; // String input
    double average; // Average test score
    int repeat; // Confirm dialog button clicked

    do
    {
      // Get the first test score.
      strInput = JOptionPane.showInputDialog(null, "Enter the number.");
      score1 = Integer.parseInt(strInput);

      JOptionPane.showMessageDialog(null, "This does not compute", "Error", JOptionPane.ERROR_MESSAGE);

      // Calculate and display the average test score.
      JOptionPane.showMessageDialog(null, "Greetings");

      JOptionPane.showConfirmDialog(null,
          "Do you want to continue",
          "Please Confirm.", JOptionPane.YES_NO_CANCEL_OPTION);

      // Does the user want to average another set?
      repeat = JOptionPane.showConfirmDialog(null,
          "Do you want to continue",
          "Please Confirm.", JOptionPane.YES_NO_OPTION);

    }
    while (repeat == JOptionPane.YES_OPTION);

    System.exit(0);
  }
}