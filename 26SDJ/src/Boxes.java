import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Boxes extends Application
{
  private Scene scene, scene1;
  private FlowPane mainPane;
  private Label textLabel;
  private TextField textField;
  private Button clickMeButton;

  public void start(Stage window)
  {
    window.setTitle("Message");

    BorderPane mainPane = new BorderPane();
    Label t1 = new Label("Greetings");

    window.setX(200);
    window.setY(200);

    Button btn1 = new Button("Ok");
    btn1.setPadding(new Insets(5,15,10,15));
    VBox v1 = new VBox(t1, btn1);
    v1.setAlignment(Pos.TOP_CENTER);
    v1.setSpacing(10);
    v1.setPadding(new Insets(5,15,10,15));
    mainPane.setCenter(v1);
    scene = new Scene(mainPane, 300, 100);
    window.setScene(scene);
    window.show();

    //    Stage window1 = new Stage();
    //    VBox mainPane1 = new VBox();
    //    TextField t11 = new TextField();
    //    t11.setPrefWidth(300);
    //
    //
    //    mainPane1.getChildren().add(t1);
    //
    //    scene1 = new Scene(mainPane1, 300, 250);
    //    window1.setScene(scene1);
    //    window1.show();
  }

}
