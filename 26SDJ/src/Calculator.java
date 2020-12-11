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

  private GridPane mainGridPane;

  private final String title = "Calculator";
  private final String clearText = "Clear";
  private final String removeText = "Remove";

  private String calculation = "";

  private Button[] numbersButtons = new Button[9];
  private Button[] btn;
  private Button[] btc;

  private Button b4;
  private Button b8;
  private Button b12;
  private Button b13;
  private Button b14;
  private Button b15;
  private Button b16;
  private Button clear;
  private Button remove;

  private MyActionListener listener;
  private Clearer clearer;
  private Remover remove1;

  private int k;
  private final int buttonSize = 450;
  private final int sceneWidth = 300;
  private final int sceneHeight = 250;

  private final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8",
      "9"};

  public void start(Stage window)
  {
    window.setTitle(title);

    mainPane = new VBox();
    textField = new TextField();
    textField.setPrefWidth(sceneWidth);
    textField.setAlignment(Pos.CENTER_RIGHT);
    listener = new MyActionListener();
    clearer = new Clearer();
    remove1 = new Remover();

    mainGridPane = new GridPane();

    remove = new Button(removeText);
    remove.setPrefWidth(sceneWidth);
    remove.setOnAction(remove1);

    clear = new Button(clearText);
    clear.setPrefWidth(sceneWidth);
    clear.setOnAction(clearer);

    int l = 0;
    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        System.out.print(l + " " + i + " " + j + "\n");
        numbersButtons[l] = new Button(numbers[l]);
        numbersButtons[l].setOnAction(listener);
        numbersButtons[l].setPrefWidth(buttonSize);
        numbersButtons[l].setPrefHeight(buttonSize);

        mainGridPane.add(numbersButtons[l], i, j);
        l++;
      }
    }

    b4 = new Button("0");
    b4.setOnAction(listener);
    b4.setPrefWidth(buttonSize);
    b4.setPrefHeight(buttonSize);

    b8 = new Button(".");
    b8.setOnAction(listener);
    b8.setPrefWidth(buttonSize);
    b8.setPrefHeight(buttonSize);

    b12 = new Button("=");
    b12.setOnAction(listener);
    b12.setPrefWidth(buttonSize);
    b12.setPrefHeight(buttonSize);

    b13 = new Button("/");
    b13.setOnAction(listener);
    b13.setPrefWidth(buttonSize);
    b13.setPrefHeight(buttonSize);

    b14 = new Button("*");
    b14.setOnAction(listener);
    b14.setPrefWidth(buttonSize);
    b14.setPrefHeight(buttonSize);

    b15 = new Button("-");
    b15.setOnAction(listener);
    b15.setPrefWidth(buttonSize);
    b15.setPrefHeight(buttonSize);

    b16 = new Button("+");
    b16.setOnAction(listener);
    b16.setPrefWidth(buttonSize);
    b16.setPrefHeight(buttonSize);

    btc = new Button[4];
    btc[0] = b13;
    btc[1] = b16;
    btc[2] = b15;
    btc[3] = b14;

    btn = new Button[2];

    btn[0] = b4;
    btn[1] = b8;

    mainGridPane.add(b4, 0, 3);
    mainGridPane.add(b8, 1, 3);
    mainGridPane.add(b12, 2, 3);
    mainGridPane.add(b13, 3, 0);
    mainGridPane.add(b14, 3, 1);
    mainGridPane.add(b15, 3, 2);
    mainGridPane.add(b16, 3, 3);

    mainPane.getChildren().add(textField);
    mainPane.getChildren().add(mainGridPane);
    mainPane.getChildren().add(clear);
    mainPane.getChildren().add(remove);
    scene = new Scene(mainPane, sceneWidth, sceneHeight);
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
        String temp1 = "";
        String[] temp = calculation.split("");
        for (int i = 0; i < calculation.length() - 1; i++)
        {
          temp1 += temp[i];
        }
        calculation = temp1;
        textField.setText(calculation);

      }
    }
  }

  private class Clearer implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == clear)
      {
        calculation = "";
        textField.setText("");
        k = 0;

      }
    }
  }

  public String stringSizeChecker(String[] checkObject)
  {
    String k;
    if (checkObject.length == 1)
    {
     k = String.valueOf(checkObject[0]);
    }
    else
    {
      double l = Double.parseDouble(checkObject[0]) * Double.parseDouble(checkObject[1]);
      k = String.valueOf(l);
    }

    return k;
  }

  public String calculate(String equation)
  {
    String p = equation;

    if (equation.contains(".") && equation.contains("*"))
    {
      System.out.println("robot");
      String[] str = equation.split("\\*");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) * Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }
     String y = stringSizeChecker(str);
      System.out.println("y"+y);
      System.out.println("p"+p);
    }
    else if (!(equation.contains(".")) && equation.contains("*"))
    {
      System.out.println("robot");
      String[] str = equation.split("\\*");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    if (equation.contains(".") && equation.contains("-"))
    {
      System.out.println("robot");
      String[] str = equation.split("-");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) - Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }

    }
    else if (!(equation.contains(".")) && equation.contains("-"))
    {
      System.out.println("robot");
      String[] str = equation.split("-");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) - Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    if (equation.contains(".") && equation.contains("+"))
    {
      System.out.println("robot");
      String[] str = equation.split("\\+");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) + Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }

    }
    else if (!(equation.contains(".")) && equation.contains("+"))
    {
      System.out.println("robot");
      String[] str = equation.split("\\+");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        int l = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
        p = String.valueOf(l);
      }
    }

    if (equation.contains(".") && equation.contains("/"))
    {
      System.out.println("robot");
      String[] str = equation.split("/");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
      }
      else
      {
        double l = Double.parseDouble(str[0]) / Double.parseDouble(str[1]);
        p = String.valueOf(l);
      }
    }
    else if (!(equation.contains(".")) && equation.contains("/"))
    {
      System.out.println("robot");
      String[] str = equation.split("/");
      if (str.length == 1)
      {
        p = String.valueOf(str[0]);
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
        textField.setText(calculate(calculation));
        calculation = calculate(calculation);
        if (calculate(calculation) == null)
        {
          calculation = "";
          textField.setText(calculation);
        }

      }

      //      if (e.getSource()==btc[3])
      //      {
      //
      //      }

      for (int i = 0; i < btc.length; i++)
      {
        if (e.getSource() == btc[i])
        {
          if (k != 0)
          {
            calculation = calculate(calculation);
          }

          System.out.println("ll");
          calculation += btc[i].getText();
          textField.setText(calculation);
          k++;

          break;
        }

      }

      for (int i = 0; i < numbersButtons.length; i++)
      {
        if (e.getSource() == numbersButtons[i])
        {
          System.out.println(calculation);
          System.out.println("ll");
          calculation += numbersButtons[i].getText();
          System.out.println(calculation);
          textField.setText(calculation);

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
