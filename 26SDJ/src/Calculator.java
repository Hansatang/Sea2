import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application
{
  private Scene scene;
  private FlowPane mainPane;
  private Label textLabel;
  private TextField textField;
  private Button clickMeButton;

  public void start(Stage window)
  {
    window.setTitle("A Simple Window 1");

    VBox mainPane = new VBox();
    TextField t1 = new TextField();
    t1.setPrefWidth(300);


    Button[] btn = new Button[16];
    GridPane g1 = new GridPane();

    int l = 0;
    String[] cars = {"7", "4", "1", "0", "8", "5", "2", ".", "9", "6", "3", "=",
        "/", "*", "-", "+"};
    for (int i = 0; i < 4; i++)
    {
      for (int j = 0; j < 4; j++)
      {
        System.out.print(l + " " + i + " " + j + "\n");
        btn[l] = new Button(cars[l]);
        btn[l].setPrefWidth(450);
        btn[l].setPrefHeight(450);

        g1.add(btn[l], i, j);
        l++;
      }
    }

    mainPane.getChildren().add(t1);
    mainPane.getChildren().add(g1);
    scene = new Scene(mainPane, 300, 250);
    window.setScene(scene);
    window.show();
  }
}
