import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Circle extends Application
{
  private Scene scene;
  private HBox mainPane;
  private VBox v1;
  private Label l1;
  private Label l2;
  private TextField t1;
  private VBox fs1;

  private Event1 ev1;
  private Button btn1;

  public void start(Stage window)
  {
    window.setTitle("A Simple Window 1");

    mainPane = new HBox();
    v1 = new VBox(5);
    v1.setPadding(new Insets(5, 15, 0, 15));
    v1.setSpacing(10);
    v1.setAlignment(Pos.CENTER);
    ev1 = new Event1();
    btn1 = new Button("Calculate");
    btn1.setOnAction(ev1);

    v1.getChildren().add(btn1);

    l1 = new Label("Area:");
    l2 = new Label("Circumference:");
    t1 = new TextField();
    t1.setPrefWidth(100);
    fs1 = new VBox();
    fs1.setAlignment(Pos.CENTER_LEFT);
    fs1.setAlignment(Pos.CENTER);
    fs1.getChildren().add(t1);
    fs1.getChildren().add(l1);
    fs1.getChildren().add(l2);

    mainPane.getChildren().addAll(v1, fs1);

    scene = new Scene(mainPane, 450, 120);
    window.setScene(scene);
    window.show();
  }

  private class Event1 implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == btn1)
      {
        l1.setText(
            "Area: " + (Integer.parseInt(t1.getText()) * Integer.parseInt(t1.getText()) * Math.PI));
        l2.setText(
            "Circumference: " + (2 * Integer.parseInt(t1.getText()) * Math.PI));
      }
    }
  }
}
