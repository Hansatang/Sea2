import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ButtonType;

public class StudentFileAdapterGUI extends Application
{
  private StudentFileAdapter adapter;

  private VBox mainPane;

  private TabPane tabPane;
  private Tab allStudentsTab;
  private Tab changeCountryTab;
  private Tab studentFromCountryTab;

  private VBox studentFromCountryPane;

  private TextArea allStudentsArea;
  private TextArea StudentsCountryArea;
  private TextField con;

  private ScrollPane allStudentsScrollPane;
  private ScrollPane StudentsCountryScrollPane;

  private Button getButton;
  private Button updateButton;

  private Button getCountryButton;
  private Button updateCountryButton;

  private VBox allStudentsPane;
  private HBox h1;

  private VBox changeCountryPane;
  private HBox changeCountryTopPane;
  private FlowPane comboPane;

  private Label firstNameLabel;
  private Label lastNameLabel;
  private Label countryLabel;
  private Label l1;

  private GridPane changeCountryInputPane;
  private FlowPane comboComboPane;
  private ComboBox countryBox;

  private ComboBox<Student> studentBox;
  private TextField firstNameField;
  private TextField lastNameField;
  private TextField countryField;

  private FlowPane imagePane;
  private Image logo;
  private ImageView logoView;

  private MenuBar menuBar;

  private Menu fileMenu;
  private Menu editMenu;
  private Menu aboutMenu;

  private MenuItem exitMenuItem;
  private MenuItem aboutMenuItem;

  private CheckMenuItem editAreaMenuItem;
  private CheckMenuItem editFieldsMenuItem;
  private CheckMenuItem editCountryItem;

  private MyActionListener listener;
  private MyTabListener tabListener;

  public void start(Stage window)
  {
    window.setTitle("Student File Adapter GUI");

    adapter = new StudentFileAdapter("students.bin");

    listener = new MyActionListener();
    tabListener = new MyTabListener();

    tabPane = new TabPane();
    tabPane.getSelectionModel().selectedItemProperty().addListener(tabListener);

    allStudentsTab = new Tab("All Students");
    changeCountryTab = new Tab("Change Country");
    studentFromCountryTab = new Tab("Student from Country");

    StudentsCountryArea = new TextArea();
    StudentsCountryArea.setPrefRowCount(16);
    StudentsCountryArea.setPrefColumnCount(50);
    StudentsCountryArea.setEditable(false);
    StudentsCountryScrollPane = new ScrollPane(StudentsCountryArea);
    StudentsCountryScrollPane.setFitToWidth(true);

    getCountryButton = new Button("Get Students from Country");
    getCountryButton.setOnAction(listener);
    l1 = new Label("Country");
    con = new TextField();
    h1 = new HBox(l1, con, getCountryButton);
    h1.setAlignment(Pos.CENTER_LEFT);
    updateCountryButton = new Button("Update");
    updateCountryButton.setOnAction(listener);

    studentFromCountryPane = new VBox(10);
    studentFromCountryPane.setAlignment(Pos.CENTER);
    studentFromCountryPane.getChildren().add(StudentsCountryScrollPane);
    studentFromCountryPane.getChildren().add(h1);

    allStudentsArea = new TextArea();
    allStudentsArea.setPrefRowCount(16);
    allStudentsArea.setPrefColumnCount(50);
    allStudentsArea.setEditable(false);

    allStudentsScrollPane = new ScrollPane(allStudentsArea);
    allStudentsScrollPane.setFitToWidth(true);

    getButton = new Button("Get Students");
    getButton.setOnAction(listener);
    updateButton = new Button("Update");
    updateButton.setOnAction(listener);

    allStudentsPane = new VBox(10);
    allStudentsPane.setAlignment(Pos.CENTER);
    allStudentsPane.getChildren().add(allStudentsScrollPane);
    allStudentsPane.getChildren().add(getButton);

    changeCountryPane = new VBox(20);
    changeCountryPane.setPadding(new Insets(10));

    changeCountryTopPane = new HBox(20);

    studentBox = new ComboBox<Student>();
    studentBox.setOnAction(listener);

    countryBox = new ComboBox<String>();
    countryBox.setOnAction(listener);

    comboComboPane = new FlowPane();
    comboComboPane.setAlignment(Pos.BASELINE_RIGHT);
    comboComboPane.setPrefWidth(200);
    comboComboPane.getChildren().add(countryBox);

    comboPane = new FlowPane();
    comboPane.setAlignment(Pos.BASELINE_RIGHT);
    comboPane.setPrefWidth(200);
    comboPane.getChildren().add(studentBox);

    firstNameLabel = new Label("First name:");
    lastNameLabel = new Label("Last name:");
    countryLabel = new Label("Country:");

    firstNameField = new TextField();
    firstNameField.setEditable(false);
    lastNameField = new TextField();
    lastNameField.setEditable(false);
    countryField = new TextField();
    countryField.setEditable(false);

    changeCountryInputPane = new GridPane();
    changeCountryInputPane.setHgap(5);
    changeCountryInputPane.setVgap(5);
    changeCountryInputPane.addRow(0, firstNameLabel, firstNameField);
    changeCountryInputPane.addRow(1, lastNameLabel, lastNameField);
    changeCountryInputPane.addRow(2, countryLabel, countryField);

    changeCountryTopPane.getChildren().add(changeCountryInputPane);
    changeCountryTopPane.getChildren().add(comboPane);
    changeCountryTopPane.getChildren().add(countryBox);

    logo = new Image("file:img/vialogoah.gif");
    logoView = new ImageView(logo);
    imagePane = new FlowPane();
    imagePane.setPrefHeight(200);
    imagePane.setAlignment(Pos.BOTTOM_CENTER);
    imagePane.getChildren().add(logoView);

    changeCountryPane.getChildren().add(changeCountryTopPane);
    changeCountryPane.getChildren().add(updateButton);
    changeCountryPane.getChildren().add(imagePane);

    allStudentsTab.setContent(allStudentsPane);
    changeCountryTab.setContent(changeCountryPane);
    studentFromCountryTab.setContent(studentFromCountryPane);

    tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
    tabPane.getTabs().add(allStudentsTab);
    tabPane.getTabs().add(changeCountryTab);
    tabPane.getTabs().add(studentFromCountryTab);

    exitMenuItem = new MenuItem("Exit");
    exitMenuItem.setOnAction(listener);

    aboutMenuItem = new MenuItem("About");
    aboutMenuItem.setOnAction(listener);

    editAreaMenuItem = new CheckMenuItem("Edit student area");
    editAreaMenuItem.setOnAction(listener);

    editCountryItem = new CheckMenuItem("Edit country area");
    editCountryItem.setOnAction(listener);

    editFieldsMenuItem = new CheckMenuItem("Edit name fields");
    editFieldsMenuItem.setOnAction(listener);

    fileMenu = new Menu("File");
    editMenu = new Menu("Edit");
    aboutMenu = new Menu("About");

    fileMenu.getItems().add(exitMenuItem);

    editMenu.getItems().add(editAreaMenuItem);
    editMenu.getItems().add(editFieldsMenuItem);
    editMenu.getItems().add(editCountryItem);

    aboutMenu.getItems().add(aboutMenuItem);

    menuBar = new MenuBar();

    menuBar.getMenus().add(fileMenu);
    menuBar.getMenus().add(editMenu);
    menuBar.getMenus().add(aboutMenu);

    mainPane = new VBox();
    mainPane.getChildren().add(menuBar);
    mainPane.getChildren().add(tabPane);

    Scene scene = new Scene(mainPane, 620, 390);

    window.setScene(scene);
    window.setResizable(false);
    window.show();
  }

  private void updateStudentBox()
  {
    int currentIndexStudent = studentBox.getSelectionModel().getSelectedIndex();

    int currentIndexStudentCountry = countryBox.getSelectionModel()
        .getSelectedIndex();

    studentBox.getItems().clear();
    countryBox.getItems().clear();

    String[] str2 = adapter.getCountries();
    for (int i = 0; i < str2.length - 1; i++)
    {
      countryBox.getItems().add(str2[i]);
    }

    if (currentIndexStudentCountry == -1 && countryBox.getItems().size() > 0)
    {
      countryBox.getSelectionModel().select(0);
    }
    else
    {
      countryBox.getSelectionModel().select(currentIndexStudentCountry);
    }

    StudentList students = adapter.getAllStudents();
    for (int i = 0; i < students.size(); i++)
    {
      studentBox.getItems().add(students.get(i));
    }

    if (currentIndexStudent == -1 && studentBox.getItems().size() > 0)
    {
      studentBox.getSelectionModel().select(0);
    }
    else
    {
      studentBox.getSelectionModel().select(currentIndexStudent);
    }
  }

  private void updateStudentArea()
  {
    StudentList students = adapter.getAllStudents();
    allStudentsArea.setText(students.toString());
  }

  private void updateStudentFromCountryArea()
  {
    StudentList students = adapter.getAllStudents();
    StudentsCountryArea.setText(students.toString());
  }

  private class MyActionListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == getCountryButton)
      {
        if (con.getText().isEmpty())
        {
          StudentsCountryArea.clear();
          updateStudentFromCountryArea();
        }
        else
        {
          StudentsCountryArea.clear();
          StudentList students = adapter.getStudentsFrom(con.getText());
          StudentsCountryArea.setText(students.toString());
        }
      }
      if (e.getSource() == getButton)
      {
        updateStudentArea();
      }
      else if (e.getSource() == updateButton)
      {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String country = countryField.getText();

        if (country.isEmpty())
        {
          country = "?";
        }

        adapter.changeCountry(firstName, lastName, country);
        updateStudentBox();
        countryField.setText("");
      }
      else if (e.getSource() == studentBox)
      {
        Student temp = studentBox.getSelectionModel().getSelectedItem();

        if (temp != null)
        {
          firstNameField.setText(temp.getFirstName());
          lastNameField.setText(temp.getLastName());
          countryField.setText(temp.getCountry());
        }
      }

      else if (e.getSource() == countryBox)
      {
        Student temp = studentBox.getSelectionModel().getSelectedItem();
        String cont = String
            .valueOf(countryBox.getSelectionModel().getSelectedItem());
        if (temp != null)
        {
          firstNameField.setText(temp.getFirstName());
          lastNameField.setText(temp.getLastName());
          countryField.setText(cont);
        }
      }

      else if (e.getSource() == exitMenuItem)
      {
        Alert alert = new Alert(AlertType.CONFIRMATION,
            "Do you really want to exit the program?", ButtonType.YES,
            ButtonType.NO);
        alert.setTitle("Exit");
        alert.setHeaderText(null);

        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES)
        {
          System.exit(0);
        }
      }

      else if (e.getSource() == editAreaMenuItem)
      {
        if (editAreaMenuItem.isSelected())
        {
          allStudentsArea.setEditable(true);
        }
        else
        {
          allStudentsArea.setEditable(false);
        }
      }

      else if (e.getSource() == editFieldsMenuItem)
      {
        if (editFieldsMenuItem.isSelected())
        {
          firstNameField.setEditable(true);
          lastNameField.setEditable(true);
        }
        else
        {
          firstNameField.setEditable(false);
          lastNameField.setEditable(false);
        }
      }

      else if (e.getSource() == editCountryItem)
      {
        if (editCountryItem.isSelected())
        {
          countryField.setEditable(true);
        }
        else
        {
          countryField.setEditable(false);
        }
      }

      else if (e.getSource() == aboutMenuItem)
      {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("About");
        alert.setContentText(
            "This is just a little program that demonstrates some of the GUI features in Java");
        alert.showAndWait();
      }
    }
  }

  private class MyTabListener implements ChangeListener<Tab>
  {
    public void changed(ObservableValue<? extends Tab> tab, Tab oldTab,
        Tab newTab)
    {
      if (newTab == allStudentsTab)
      {
        updateStudentArea();

      }
      else if (newTab == changeCountryTab)
      {
        updateStudentBox();
      }
      else if (newTab == studentFromCountryTab)
      {
        updateStudentFromCountryArea();
        con.setText("");
      }
    }
  }
}
