import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application
{
  private Scene scene;
  private VBox mainPane;
  private TextField textField;
  private String calculation;

  private Button b1;
  private Button b2;
  private Button b3;
  private Button b4;
  private Button b5;
  private Button b6;
  private Button b7;
  private Button b8;
  private Button b9;
  private Button b10;
  private Button b11;
  private Button b12;
  private Button b13;
  private Button b14;
  private Button b15;
  private Button b16;
  private Button[] btn;
  private Button[] btc;
  private Button clear;
  private MyActionListener listener;
  private Clearer clear1;
  private Remover remove1;
  private Button remove;
  private int k;

  public void start(Stage window)
  {
    window.setTitle("A Simple Window 1");

    mainPane = new VBox();
    textField = new TextField();
    textField.setPrefWidth(300);
    textField.setAlignment(Pos.CENTER_RIGHT);
    listener = new MyActionListener();
    clear1 = new Clearer();
    remove1 = new Remover();

    GridPane g1 = new GridPane();

    remove = new Button("Clear");
    remove.setPrefWidth(300);
    remove.setOnAction(remove1);

    clear = new Button("Remove");
    clear.setPrefWidth(300);
    clear.setOnAction(clear1);

    b1 = new Button("7");
    b1.setOnAction(listener);
    b1.setPrefWidth(450);
    b1.setPrefHeight(450);

    b2 = new Button("4");
    b2.setOnAction(listener);
    b2.setPrefWidth(450);
    b2.setPrefHeight(450);

    b3 = new Button("1");
    b3.setOnAction(listener);
    b3.setPrefWidth(450);
    b3.setPrefHeight(450);

    b4 = new Button("0");
    b4.setOnAction(listener);
    b4.setPrefWidth(450);
    b4.setPrefHeight(450);

    b5 = new Button("8");
    b5.setOnAction(listener);
    b5.setPrefWidth(450);
    b5.setPrefHeight(450);

    b6 = new Button("5");
    b6.setOnAction(listener);
    b6.setPrefWidth(450);
    b6.setPrefHeight(450);

    b7 = new Button("2");
    b7.setOnAction(listener);
    b7.setPrefWidth(450);
    b7.setPrefHeight(450);

    b8 = new Button(".");
    b8.setOnAction(listener);
    b8.setPrefWidth(450);
    b8.setPrefHeight(450);

    b9 = new Button("9");
    b9.setOnAction(listener);
    b9.setPrefWidth(450);
    b9.setPrefHeight(450);

    b10 = new Button("6");
    b10.setOnAction(listener);
    b10.setPrefWidth(450);
    b10.setPrefHeight(450);

    b11 = new Button("3");
    b11.setOnAction(listener);
    b11.setPrefWidth(450);
    b11.setPrefHeight(450);

    b12 = new Button("=");
    b12.setOnAction(listener);
    b12.setPrefWidth(450);
    b12.setPrefHeight(450);

    b13 = new Button("/");
    b13.setOnAction(listener);
    b13.setPrefWidth(450);
    b13.setPrefHeight(450);

    b14 = new Button("*");
    b14.setOnAction(listener);
    b14.setPrefWidth(450);
    b14.setPrefHeight(450);

    b15 = new Button("-");
    b15.setOnAction(listener);
    b15.setPrefWidth(450);
    b15.setPrefHeight(450);

    b16 = new Button("+");
    b16.setOnAction(listener);
    b16.setPrefWidth(450);
    b16.setPrefHeight(450);

    btc = new Button[16];
    btc[12] = b13;
    btc[13] = b14;
    btc[14] = b15;
    btc[15] = b16;

    btn = new Button[16];
    btn[0] = b1;
    btn[1] = b2;
    btn[2] = b3;
    btn[3] = b4;
    btn[4] = b5;
    btn[5] = b6;
    btn[6] = b7;
    btn[7] = b8;
    btn[8] = b9;
    btn[9] = b10;
    btn[10] = b11;

    g1.add(b1, 0, 0);
    g1.add(b2, 0, 1);
    g1.add(b3, 0, 2);
    g1.add(b4, 0, 3);
    g1.add(b5, 1, 0);
    g1.add(b6, 1, 1);
    g1.add(b7, 1, 2);
    g1.add(b8, 1, 3);
    g1.add(b9, 2, 0);
    g1.add(b10, 2, 1);
    g1.add(b11, 2, 2);
    g1.add(b12, 2, 3);
    g1.add(b13, 3, 0);
    g1.add(b14, 3, 1);
    g1.add(b15, 3, 2);
    g1.add(b16, 3, 3);

    calculation = "";
    int k = 0;

    mainPane.getChildren().add(textField);
    mainPane.getChildren().add(g1);
    mainPane.getChildren().add(clear);
    mainPane.getChildren().add(remove);
    scene = new Scene(mainPane, 300, 250);
    window.setScene(scene);
    window.show();
  }

  private class Remover implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      System.out.println("M");
      if (e.getSource() == remove)
      {
        String temp1 ="";
        String[] temp = calculation.split("");
        for (int i = 0; i < calculation.length()-1; i++)
        {
          temp1+=temp[i];
        }
        calculation=temp1;
        textField.setText(calculation);

      }
    }
  }

  private class Clearer implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      System.out.println("M");
      if (e.getSource() == clear)
      {
        System.out.println("Z");
        calculation = "";
        textField.setText("");
        k = 0;

      }
    }
  }

  public String calcc(String rownanie)
  {
    String p = rownanie;

    if (rownanie.contains(".") && rownanie.contains("-"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("-");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) - Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }

    }
    else if (!(rownanie.contains(".")) && rownanie.contains("-"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("-");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) - Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    if (rownanie.contains(".") && rownanie.contains("+"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("\\+");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) + Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }

    }
    else if (!(rownanie.contains(".")) && rownanie.contains("+"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("\\+");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    if (rownanie.contains(".") && rownanie.contains("*"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("\\*");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) * Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }
    }
    else if (!(rownanie.contains(".")) && rownanie.contains("*"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("\\*");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    if (rownanie.contains(".") && rownanie.contains("/"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("/");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) / Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }
    }
    else if (!(rownanie.contains(".")) && rownanie.contains("/"))
    {
      System.out.println("robot");
      String[] str = rownanie.split("/");
      if (str.length == 1)
      {
        p=String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) / Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    return p;
  }

  private class MyActionListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      System.out.println("active");
      if (e.getSource() == b12)
      {
        textField.setText(calcc(calculation));
        calculation=calcc(calculation);
        if (calcc(calculation)==null)
        {
          calculation="";
          textField.setText(calculation);
        }

      }

      for (int i = 0; i < btc.length; i++)
      {
        if (e.getSource() == btc[i])
        {
          if (k != 0)
          {
            calculation = calcc(calculation);

          }

          System.out.println("ll");
          calculation += btc[i].getText();
          textField.setText(calculation);
          k++;

          break;
        }

      }

      for (int i = 0; i < btn.length; i++)
      {
        if (e.getSource() == btn[i])
        {
          System.out.println(calculation);
          System.out.println("ll");
          calculation += btn[i].getText();
          System.out.println(calculation);
          textField.setText(calculation);

          break;
        }
      }

    }

  }
}
