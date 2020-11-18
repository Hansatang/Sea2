package JSON;

import main.Main;
import main.Project;

import java.util.ArrayList;

public class JSONFileSaver
{

  public static void saveProjectsToJSON(ArrayList<Project> projects){
    for(int i = 0 ; i < projects.size() ; i++){
      JSONFileWriter.write(projects.get(i),i, Main.filePath);
      System.out.println("Saved " + projects.get(i).getProjectName());
    }
  }

  public static void saveJSONToProjects(ArrayList<Project> projects){

    int projectNumber = 0;

    Project project = JSONFileReader.read(projectNumber, Main.filePath);

    while(project != null){
      projects.add(project);
      System.out.println("Project '" + project.getProjectName() + "' is saved.");
      projectNumber++;
      project = JSONFileReader.read(projectNumber, Main.filePath);
    }
    System.out.println("There have been saved " + projectNumber + " projects.");
  }

}
