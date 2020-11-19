import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Windows extends Application
{
  private Scene scene;
  private FlowPane mainPane;
  private Label l1;
  private Label l2;
  private TextField t1;
  private TextField t2;
  private Button clickMeButton;
  private Event1 ev1;
  private Button btn1;
  private Button btn2;
  private Button btn3;
  private RadioButton radio1;
  private RadioButton radio2;

  public void start(Stage window)
  {
    window.setTitle("A Simple Window 1");

    BorderPane mainPane = new BorderPane();
    VBox v1 = new VBox(5);
    v1.setPadding(new Insets(5, 15, 0, 15));
    v1.setSpacing(10);
    v1.setAlignment(Pos.CENTER);
    ev1 = new Event1();
    btn1 = new Button("Ok");
    btn1.setOnAction(ev1);
    btn2 = new Button("Cancel");
    btn2.setOnAction(ev1);
    btn3 = new Button("Clear");
    btn3.setOnAction(ev1);
    v1.getChildren().add(btn1);
    v1.getChildren().add(btn2);
    v1.getChildren().add(btn3);

    VBox v2 = new VBox(5);
    v2.setSpacing(10);
    v2.setAlignment(Pos.CENTER);
    l1 = new Label("X: ");
    t1 = new TextField();
    t1.setPrefWidth(150);
    FlowPane fs1 = new FlowPane();
    fs1.setAlignment(Pos.CENTER);
    fs1.getChildren().add(l1);
    fs1.getChildren().add(t1);
    l2 = new Label("Y: ");
    t2 = new TextField();
    t2.setPrefWidth(150);
    FlowPane fs2 = new FlowPane();
    fs2.setAlignment(Pos.CENTER);
    fs2.getChildren().add(l2);
    fs2.getChildren().add(t2);
    v2.getChildren().add(fs1);
    v2.getChildren().add(fs2);

    VBox v3 = new VBox(10);
    v3.setSpacing(10);
    v3.setAlignment(Pos.CENTER_LEFT);
    v3.setPadding(new Insets(0, 15, 0, 15));
    ToggleGroup group = new ToggleGroup();
    radio1 = new RadioButton("Exit on ok");
    radio2 = new RadioButton("Exit on cancel");

    radio1.setToggleGroup(group);
    radio2.setToggleGroup(group);
    v3.getChildren().add(radio1);
    v3.getChildren().add(radio2);

    mainPane.setLeft(v3);
    mainPane.setRight(v1);
    mainPane.setCenter(v2);
    scene = new Scene(mainPane, 450, 120);
    window.setScene(scene);
    window.show();
  }

  private class Event1 implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == btn2)
      {

        if (radio2.isSelected())
        {
          System.exit(0);
        }

      }
      else if (e.getSource() == btn1)
      {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
            "Do you really want to exit the program?"+t1.getText()+t2.getText(), ButtonType.YES,
            ButtonType.NO);
        alert.setTitle("Exit");
        alert.setHeaderText(null);
        alert.setContentText(t1.getText()+"\n"+t2.getText());


        alert.showAndWait();

        if (radio1.isSelected() && alert.getResult() == ButtonType.YES)
        {
          System.exit(0);
        }
      }
      else if (e.getSource() == btn3)
      {
        t1.setText("");
        t2.setText("");
      }
    }
  }
}
