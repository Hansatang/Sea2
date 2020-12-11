import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * A GUI tab containing components for changing a students country.
 * @author Allan Henriksen
 * @version 3.0
 */
public class ChangeCountryTab extends Tab
{
   private VBox changeCountryPane;
   private HBox changeCountryTopPane;
   private FlowPane listPane;

   private Label firstNameLabel;
   private Label lastNameLabel;
   private Label countryLabel;

   private GridPane changeCountryInputPane;

   private ListView<Student> studentListView;
   private TextField firstNameField;
   private TextField lastNameField;
   private TextField countryField;

   private FlowPane imagePane;
   private Image logo;
   private ImageView logoView;

   private Button updateButton;

   private MyActionListener listener;
   private MyListListener listListener;

   private StudentFileAdapter adapter;

   /**
    * Constructor initializing the GUI components
    * @param title The title of the tab
    * @param adapter StudentFileAdapter object used for retrieving and storing student information
    */
   public ChangeCountryTab(String title, StudentFileAdapter adapter)
   {
      super(title);

      this.adapter = adapter;

      listener = new MyActionListener();
      listListener = new MyListListener();

      updateButton = new Button("Update");
      updateButton.setOnAction(listener);

      changeCountryPane = new VBox(20);
      changeCountryPane.setPadding(new Insets(10));

      changeCountryTopPane = new HBox(20);

      studentListView = new ListView<Student>();
      studentListView.setPrefHeight(120);
      studentListView.getSelectionModel().selectedItemProperty().addListener((listListener));

      listPane = new FlowPane();
      listPane.setAlignment(Pos.BASELINE_RIGHT);
      listPane.setPrefWidth(200);
      listPane.getChildren().add(studentListView);

      firstNameLabel = new Label("First name:");
      lastNameLabel = new Label("Last name:");
      countryLabel = new Label("Country:");

      firstNameField = new TextField();
      firstNameField.setEditable(false);
      lastNameField = new TextField();
      lastNameField.setEditable(false);
      countryField = new TextField();

      changeCountryInputPane = new GridPane();
      changeCountryInputPane.setHgap(5);
      changeCountryInputPane.setVgap(5);
      changeCountryInputPane.addRow(0, firstNameLabel, firstNameField);
      changeCountryInputPane.addRow(1, lastNameLabel, lastNameField);
      changeCountryInputPane.addRow(2, countryLabel, countryField);

      changeCountryTopPane.getChildren().add(changeCountryInputPane);
      changeCountryTopPane.getChildren().add(listPane);

      logo = new Image("file:img/vialogoah.gif");
      logoView = new ImageView(logo);
      imagePane = new FlowPane();
      imagePane.setPrefHeight(200);
      imagePane.setAlignment(Pos.BOTTOM_CENTER);
      imagePane.getChildren().add(logoView);

      changeCountryPane.getChildren().add(changeCountryTopPane);
      changeCountryPane.getChildren().add(updateButton);
      changeCountryPane.getChildren().add(imagePane);

      super.setContent(changeCountryPane);
   }

   /**
    * Enables or disables editing of firstNameField and lastNameField.
    * @param bool if true then the fields will be editable, if false then they will not
    */
   public void changeEditableState(boolean bool)
   {
      firstNameField.setEditable(bool);
      lastNameField.setEditable(bool);
   }

   /**
    * Updates the studentListView ListView with information from the students file  
    */
   public void updateStudentListView()
   {
      int currentIndex = studentListView.getSelectionModel().getSelectedIndex();

      studentListView.getItems().clear();

      StudentList students = adapter.getAllStudents();
      for (int i = 0; i < students.size(); i++)
      {
         studentListView.getItems().add(students.get(i));
      }

      if (currentIndex == -1 && studentListView.getItems().size() > 0)
      {
         studentListView.getSelectionModel().select(0);
      }
      else
      {
         studentListView.getSelectionModel().select(currentIndex);
      }
   }


   /*
    * Inner action listener class 
    * @author Allan Henriksen
    * @version 3.0
    */
   private class MyActionListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
         if (e.getSource() == updateButton)
         {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String country = countryField.getText();

            if (country.equals(""))
            {
               country = "?";
            }

            adapter.changeCountry(firstName, lastName, country);
            updateStudentListView();
            countryField.setText("");
         }
      }
   }
   
   /*
    * Inner change listener class for the ListView 
    * @author Allan Henriksen
    * @version 1.0
    */
   private class MyListListener implements ChangeListener<Student>
   {
      public void changed(ObservableValue<? extends Student> student, Student oldStudent, Student newStudent)
      {
         Student temp = studentListView.getSelectionModel().getSelectedItem();

         if (temp != null)
         {
            firstNameField.setText(temp.getFirstName());
            lastNameField.setText(temp.getLastName());
            countryField.setPromptText(temp.getCountry());
         }
      }
   }
}
