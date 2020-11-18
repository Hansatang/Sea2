package main;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {


  @FXML private Button addRequirementButtom;
  @FXML private Button addProjectButton;
  @FXML private VBox projectListContainer;

  @FXML private VBox requirementListContainer;
  @FXML private Label selectedProjectsLabel;
  @FXML private TextField searchBar;

  @FXML private SplitPane splitPane;

  private Project currentSelected = null;

  public void setCurrentProject(Project project){
    currentSelected = project;
    selectedProjectsLabel.setText(project.getProjectName());
    selectedProjectsLabel.setTextFill(Color.GREEN);
    selectedProjectsLabel.setTextAlignment(TextAlignment.CENTER);
  }

  @FXML
  protected void initialize(){
    /*for(int i = 0 ; i < Main.projects.size() ; i++){
      addProjectToList(Main.projects.get(i));
    }*/



  }

  @FXML
  private void showProjectPopUp(ActionEvent event) {
    event.consume();
    addProject();
  }

  @FXML
  private void showRequirementPopUp(ActionEvent event) {
    if(currentSelected != null)
    {
      addRequirement();
    }
    event.consume();
  }

  @FXML
  public void addProjectToList(Project project){

    ButtonBar projectBar = new ButtonBar();
    Button    projectBtn = new Button("Select");
    Label     projectLbl = new Label(project.getProjectName());

    projectBtn.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        setCurrentProject(project);
        for(int i = 0 ; i < project.getRequirements().size() ; i++){
          addRequirementToList(project.getRequirements().get(i));
          /*for(int j = 0 ; j < project.getRequirements().get(i).getTasks().size() ; j++){
            addTaskToRequirement(requirementPaneContainer, task);
          }*/
        }
      }
    });

    projectLbl.setPrefWidth(230);
    projectBar.getButtons().addAll(projectLbl, projectBtn);

    projectListContainer.getChildren().add(projectBar);
  }

  private void addProject(){

    Stage window = new Stage();

    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle("Add new project");
    window.setMinWidth(300);

    // Project name input.
    HBox nameContainer = new HBox(2);
    nameContainer.setPadding(new Insets(10,10,0,10));
    Label projectName = new Label("Project name: ");
    TextField inputProjectName = new TextField();
    inputProjectName.setPromptText("Enter project name");
    nameContainer.getChildren().addAll(projectName,inputProjectName);

    Label errorMessage = new Label("");

    Button closeButton = new Button("Add new project");

    closeButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(!(inputProjectName.getText().isEmpty() || inputProjectName.getText().equals(""))){
          window.close();
          Project project = new Project(inputProjectName.getText());
          addProjectToList(project);
          Main.projects.add(project);
          setCurrentProject(project);
        } else {
          errorMessage.setText("ERROR: invalid project name");
          errorMessage.setTextFill(Color.RED);
        }
      }
    });

    VBox layout = new VBox(10);

    layout.getChildren().addAll(nameContainer,errorMessage,closeButton);
    layout.setAlignment(Pos.CENTER);

    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();

  }

  private void addRequirement(){

    Stage window = new Stage();
    ArrayList<Member> selectedMembers = new ArrayList<>();

    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle("Add new requirement");
    window.setMinWidth(300);

    // Project name input.
    VBox nameContainer = new VBox(2);
    nameContainer.setPadding(new Insets(5));
    VBox userStoryContainer = new VBox(2);
    userStoryContainer.setPadding(new Insets(5));
    VBox deadlineContainer = new VBox(2);
    deadlineContainer.setPadding(new Insets(5));
    VBox membersContainer = new VBox(2);
    membersContainer.setPadding(new Insets(5));

    Label requirementName = new Label("Requirement name: ");
    TextField inputRequirementName = new TextField();
    inputRequirementName.setPromptText("Enter requirement name here...");
    nameContainer.getChildren().addAll(requirementName,inputRequirementName);

    Label requirementUserStory = new Label("User story: ");
    TextArea inputRequirementUserStory = new TextArea();
    inputRequirementUserStory.setPromptText("Enter user story here...");
    inputRequirementUserStory.setPrefSize(300,100);
    userStoryContainer.getChildren().addAll(requirementUserStory, inputRequirementUserStory);

    Label requirementDeadline = new Label("Deadline:");
    DatePicker inputRequirementDeadLine = new DatePicker();
    inputRequirementDeadLine.setPromptText("Set deadline..");
    deadlineContainer.getChildren().addAll(requirementDeadline, inputRequirementDeadLine);

    GridPane memberSelectionPane = new GridPane();
    Label requirementMembers = new Label("Select members:");
    for(int i = 0 ; i < Main.members.size() ; i++){
      CheckBox memberCheckBox = new CheckBox(Main.members.get(i).getName());
      memberCheckBox.setPrefWidth(125);
      memberCheckBox.setPadding(new Insets(0,0,3,0));
      GridPane.setRowIndex(memberCheckBox,i/2);
      GridPane.setColumnIndex(memberCheckBox,i%2);

      int finalI = i;
      memberCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
        @Override
        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
          if(newValue)
          {
            selectedMembers.add(Main.members.get(finalI));
          } else {
            selectedMembers.remove(Main.members.get(finalI));
          }
        }
      });

      memberSelectionPane.getChildren().add(memberCheckBox);
    }
    membersContainer.getChildren().addAll(requirementMembers, memberSelectionPane);

    Label errorMessage = new Label("");

    Button closeButton = new Button("Add new requirement");

    closeButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(!(inputRequirementName.getText().isEmpty() || inputRequirementName.getText().equals(""))){
          window.close();

          // Find the members that were selected
          currentSelected.addRequirement(inputRequirementName.textProperty().getValue(),
              inputRequirementUserStory.getText(),
              inputRequirementDeadLine.getValue(),
              selectedMembers
          );

          addRequirementToList(currentSelected.getRequirements().get(currentSelected.getRequirements().size()-1));
        } else {
          errorMessage.setText("ERROR: invalid project name");
          errorMessage.setTextFill(Color.RED);
        }
      }
    });

    VBox layout = new VBox(10);

    layout.getChildren().addAll(nameContainer,userStoryContainer,deadlineContainer,membersContainer,errorMessage,closeButton);
    layout.setAlignment(Pos.CENTER);

    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();

  }

  public void addRequirementToList(Requirement requirement){

    Label requirementIdLabel = new Label("Requirement ID:");
    requirementIdLabel.setFont(Font.font("System",FontWeight.BOLD, 12));

    Label requirementId = new Label(""+requirement.getRequirementId());

    Label requirementUserStoryLabel = new Label("User story:");
    requirementUserStoryLabel.setFont(Font.font("System",FontWeight.BOLD, 12));

    TextArea requirementUserStoryTextArea = new TextArea();
    requirementUserStoryTextArea.setPrefHeight(90);
    requirementUserStoryTextArea.setText(requirement.getUserStory());
    requirementUserStoryTextArea.setEditable(false);

    Label requirementEstimatedTimeLabel = new Label("Estimated time:");
    requirementEstimatedTimeLabel.setFont(Font.font("System",FontWeight.BOLD, 12));

    Label requirementEstimatedTime = new Label(requirement.getEstimatedTime() + " hrs");

    Label requirementMembersLabel = new Label("Members:");
    requirementMembersLabel.setFont(Font.font("System",FontWeight.BOLD, 12));

    GridPane requirementMembersGridPane = new GridPane();

    for(int i = 0 ; i < requirement.getMembers().size() ; i++)
    {
      Label memberLabel = new Label(requirement.getMembers().get(i).getName());
      memberLabel.setPrefWidth(125);
      memberLabel.setPadding(new Insets(0, 0, 3, 0));
      GridPane.setRowIndex(memberLabel, i / 2);
      GridPane.setColumnIndex(memberLabel, i % 2);
      requirementMembersGridPane.getChildren().add(memberLabel);
    }

    Accordion   requirementAccordion      = new Accordion();
    TitledPane  requirementTitledPane     = new TitledPane(requirement.getTitle() + " | " + requirement.getRequirementStatus().toString() + " | " + requirement.getRequirementDeadline().getDayOfMonth() + "-" + requirement.getRequirementDeadline().getMonthValue() + "-" + requirement.getRequirementDeadline().getYear() ,null);

    VBox        requirementPaneContainer  = new VBox();

    TitledPane  detailsPane               = new TitledPane("Requirement Details",null);
    TitledPane  taskListPane              = new TitledPane("Tasks",null);
    detailsPane.setExpanded(false);
    taskListPane.setExpanded(false);

    VBox        requirementDetail         = new VBox();
    VBox        requirementTasks          = new VBox();
    requirementDetail.setPadding(           new Insets(0,0,0,10));
    requirementTasks.setPadding(            new Insets(0,0,0,10));

    Button addTaskButton = new Button("Add task");
    addTaskButton.setPrefWidth(340);


    requirementDetail.getChildren().addAll(requirementIdLabel,
        requirementId,
        requirementUserStoryLabel,
        requirementUserStoryTextArea,
        requirementEstimatedTimeLabel,
        requirementEstimatedTime,
        requirementMembersLabel,
        requirementMembersGridPane);

    requirementTitledPane.setContent(requirementPaneContainer);
    requirementPaneContainer.getChildren().addAll(detailsPane, addTaskButton, taskListPane);

    // Add tasks here
    addTaskButton.setOnAction(e -> addTask(requirementTasks, requirement));
    // end

    for(int i = 0 ; i < requirement.getTasks().size() ; i++){
      addTaskToRequirement(requirementTasks, requirement.getTasks().get(i));
    }

    detailsPane.setContent(requirementDetail);
    taskListPane.setContent(requirementTasks);
    requirementAccordion.getPanes().add(requirementTitledPane);
    requirementListContainer.getChildren().add(requirementAccordion);

  }

  public void addTask(VBox requirementPaneContainer, Requirement requirement){
    Stage window = new Stage();
    final Member[] selectedMember = new Member[1];

    window.initModality(Modality.APPLICATION_MODAL);
    window.setTitle("Add new task");
    window.setMinWidth(300);

    VBox titleContainer = new VBox(2);
    titleContainer.setPadding(new Insets(5));
    VBox estimatedTimeContainer = new VBox(2);
    estimatedTimeContainer.setPadding(new Insets(5));
    VBox deadlineContainer = new VBox(2);
    deadlineContainer.setPadding(new Insets(5));
    VBox membersContainer = new VBox(2);
    membersContainer.setPadding(new Insets(5));

    Label taskTitle = new Label("Task name: ");
    TextField inputTaskTitle = new TextField();
    inputTaskTitle.setPromptText("Enter task name here...");
    titleContainer.getChildren().addAll(taskTitle,inputTaskTitle);

    Label estimatedTime = new Label("Estimated time: ");
    TextField inputEstimatedTime = new TextField();
    inputEstimatedTime.setPromptText("Enter estimated hours here...");
    inputEstimatedTime.textProperty().addListener(new ChangeListener<String>() {
      @Override
      public void changed(ObservableValue<? extends String> observable, String oldValue,
          String newValue) {
        if (!newValue.matches("\\d*")) {
          inputEstimatedTime.setText(newValue.replaceAll("[^\\d]", ""));
        }
      }
    });
    estimatedTimeContainer.getChildren().addAll(estimatedTime, inputEstimatedTime);

    Label taskDeadline = new Label("Deadline:");
    DatePicker inputTaskDeadLine = new DatePicker();
    inputTaskDeadLine.setPromptText("Set deadline..");
    deadlineContainer.getChildren().addAll(taskDeadline, inputTaskDeadLine);

    Label chooseMember = new Label("Member:");
    ToggleGroup group = new ToggleGroup();

    membersContainer.getChildren().add(chooseMember);

    for(int i = 0 ; i < requirement.getMembers().size() ; i++){
      RadioButton radioButton = new RadioButton(requirement.getMembers().get(i).getName());
      radioButton.setToggleGroup(group);

      int finalI = i;
      radioButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
        @Override
        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
          if(newValue)
          {
            selectedMember[0] = requirement.getMembers().get(finalI);
          }
        }
      });
      membersContainer.getChildren().add(radioButton);
    }

    Button closeButton = new Button("Add new requirement");

    closeButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        if(!(inputTaskTitle.getText().isEmpty() || inputTaskTitle.getText().equals(""))){
          window.close();

          // Find the members that were selected
          int estimatedTime = Integer.parseInt(inputEstimatedTime.getText());
          Task task = new Task(inputTaskTitle.getText(),estimatedTime,requirement,inputTaskDeadLine.getValue(),selectedMember[0]);
          requirement.getTasks().add(task);
          addTaskToRequirement(requirementPaneContainer, task);

        } else {
        }
      }
    });

    VBox layout = new VBox(10);

    layout.getChildren().addAll(titleContainer,estimatedTimeContainer,deadlineContainer,membersContainer, closeButton);
    layout.setAlignment(Pos.CENTER);

    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();
  }

  public void addTaskToRequirement(VBox requirementPaneContainer, Task task){

    Button modifyTask = new Button("Modify task");

    Label taskId = new Label("Task id: ");
    taskId.setFont(Font.font("System",FontWeight.BOLD, 12));
    Label taskIdLbl = new Label("" + task.getTaskId());

    Label taskEstimate = new Label("Task estimate: ");
    taskEstimate.setFont(Font.font("System",FontWeight.BOLD, 12));
    Label taskEstiamteLbl = new Label(task.getTaskEstimate() + " hrs");

    Label responsibleMember = new Label("Responsible member:");
    responsibleMember.setFont(Font.font("System",FontWeight.BOLD, 12));
    Label member = new Label(task.getMember().getName());

    VBox        taskPane = new VBox();
    TitledPane  taskTitledPane = new TitledPane(task.getTaskTitle() + " | " + task.getTaskStatus().toString() + " | " + task.getTaskDeadline().getDayOfMonth() + "-" + task.getTaskDeadline().getMonthValue() + "-" + task.getTaskDeadline().getYear(),null);
    taskTitledPane.setExpanded(false);

    taskPane.getChildren().addAll(modifyTask, taskId, taskIdLbl, taskEstimate, taskEstiamteLbl, responsibleMember, member);

    taskTitledPane.setContent(taskPane);
    requirementPaneContainer.getChildren().add(taskTitledPane);

  }




}