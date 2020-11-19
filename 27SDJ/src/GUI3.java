import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GUI3 extends Application
{
  private Scene scene;
  private FlowPane mainPane;
  private Label textlabel;
  private TextField textField;
  private Button clickMeButton;

  public void start(Stage window)
  {
    window.setTitle("A Simple Window 3");
    textlabel = new Label("Text: ");
    textField = new TextField();
    clickMeButton = new Button("Click me");
    clickMeButton.setOnAction(new MyListener());
    mainPane = new FlowPane(5, 10);
    mainPane.setAlignment(Pos.BASELINE_CENTER);
    mainPane.setPadding(new Insets(5, 15, 0, 15));
    mainPane.getChildren().add(textlabel);
    mainPane.getChildren().add(textField);
    mainPane.getChildren().add(clickMeButton);
    scene = new Scene(mainPane, 272, 120);
    window.setScene(scene);
    window.show();
  }

  private class MyListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      String input = textField.getText();
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setHeaderText(null);
      alert.setContentText("You wrote: " + input);
      alert.showAndWait();
    }
  }
}
