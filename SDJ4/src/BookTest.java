import java.util.ArrayList;
import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
      String z, x;
      double c;
      int  v;

      Scanner input = new Scanner(System.in);
      ArrayList<Book> books = new ArrayList<Book>();

      for (int i = 0; i < 2; i++)
      {
        System.out.println("Enter name");
        z = input.nextLine();
        System.out.println("What title");
        x = input.nextLine();
        System.out.println("What price");
        c = input.nextDouble();
        System.out.println("Amount of pages");
        v = input.nextInt();
        input.nextLine();


        books.add(new Book(z,x,c,v));

        System.out.println(i);
        System.out.println(books.get(i));
        books.get(i).setLowerPay(c);
        System.out.println(books.get(i));

      }

      System.out.println("Books:");
      System.out.println(books.get(0));
      System.out.println(books.get(1));

      /*
      System.out.println("Enter name");
      z = input.nextLine();
      System.out.println("What title");
      x = input.nextLine();
      System.out.println("What price");
      c = input.nextDouble();
      System.out.println("Amount of pages");
      v = input.nextInt();
      input.nextLine();

      Book booki = new Book(z,x,c,v);

      System.out.println(booki.toString());
      booki.setLowerPay(c);
      System.out.println(booki.toString());

      System.out.println("Enter name");
      z = input.nextLine();
      System.out.println("What title");
      x = input.nextLine();
      System.out.println("What price");
      c = input.nextDouble();
      System.out.println("Amount of pages");
      v = input.nextInt();

      Book booki2 = new Book(z,x,c,v);
      System.out.println(booki2.toString());
      booki2.setLowerPay(c);
      System.out.println(booki2.toString());
      System.out.println(booki.toString());
       */
    }
}
