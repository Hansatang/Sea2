package main;

import JSON.JSONFileSaver;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static final String filePath = System.getProperty("user.dir")+"//project_";

    public static ArrayList<Project> projects   = new ArrayList<>();
    public static ArrayList<Member> members     = new ArrayList<>();

    public static Member Esben      = new Member("Esben",       Role.SCRUM_MASTER);
    public static Member Krzysztof  = new Member("Krzysztof",   Role.TEAM_MEMBER);
    public static Member Simon      = new Member("Simon",       Role.TEAM_MEMBER);
    public static Member Dorin      = new Member("Dorin",       Role.PRODUCT_OWNER);
    public static Member Allan      = new Member("Allan",       Role.TEAM_MEMBER);


    @Override
    public void start(Stage primaryStage) throws Exception{

        JSONFileSaver fileSaver = new JSONFileSaver();

        fileSaver.saveJSONToProjects(projects);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("ColorIT PMS");

        primaryStage.setOnCloseRequest(e -> fileSaver.saveProjectsToJSON(projects));
        primaryStage.setScene(new Scene(root, 750, 400));
        primaryStage.show();

        System.out.println(projects.size());

    }

    public static void main(String[] args) {
        members.add(Esben);
        members.add(Krzysztof);
        members.add(Simon);
        members.add(Dorin);
        members.add(Allan);
        launch(args);
    }
}
