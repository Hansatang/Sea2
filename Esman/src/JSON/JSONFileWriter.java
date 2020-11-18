package JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import main.Project;

import java.io.FileWriter;
import java.io.IOException;

public class JSONFileWriter
{

  public static void write(Object obj, int projectNumber, String filePath) {

    if(obj instanceof Project){

      Project project = (Project) obj;

      Gson gson = new GsonBuilder().setPrettyPrinting().create();

      String json = gson.toJson(project);

      try(FileWriter writer = new FileWriter(filePath + projectNumber + ".json")){
        gson.toJson(project, writer);
      } catch (IOException e){
        e.printStackTrace();
      }
    }

  }

}
