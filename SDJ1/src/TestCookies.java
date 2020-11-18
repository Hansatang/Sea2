import java.util.Scanner;
public class TestCookies

{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many cookies did you eat??");
    int quantity = input.nextInt();
    while (quantity > 40) {
      quantity = input.nextInt();
}

    Cookies cookies = new Cookies(quantity);
    System.out.println(cookies.toString());
}
}
