import javafx.application.Application;
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
  private Label textLabel;
  private TextField textField;
  private Button clickMeButton;

  public void start(Stage window)
  {
    window.setTitle("A Simple Window 1");

    BorderPane mainPane = new BorderPane();
    VBox v1 = new VBox(5);
    v1.setPadding(new Insets(5,15,0,15));
    v1.setSpacing(10);
    v1.setAlignment(Pos.CENTER);
    Button btn1 = new Button("Button 1");
    Button btn2 = new Button("Button 2");
    Button btn3 = new Button("Button 3");
    v1.getChildren().add(btn1);
    v1.getChildren().add(btn2);
    v1.getChildren().add(btn3);

    VBox v2 = new VBox(5);
    v2.setSpacing(10);
    v2.setAlignment(Pos.CENTER);
    Label l1 = new Label("X: ");
    TextField t1 = new TextField();
    t1.setPrefWidth(150);
    FlowPane fs1 = new FlowPane();
    fs1.setAlignment(Pos.CENTER);
    fs1.getChildren().add(l1);
    fs1.getChildren().add(t1);
    Label l2 = new Label("Y: ");
    TextField t2 = new TextField();
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
    v3.setPadding(new Insets(0,15,0,15));
    ToggleGroup group = new ToggleGroup();
    RadioButton radio1 = new RadioButton("Exit on ok");
    RadioButton radio2 = new RadioButton("Exit on cancel");

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
}
