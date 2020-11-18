package JSON;

import com.google.gson.Gson;
import main.Project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class JSONFileReader
{

  public static Project read (int projectNumber, String filePath) {
    Gson gson = new Gson();
    Reader reader = null;
    try
    {
      reader = new FileReader(filePath + projectNumber + ".json");
    }
    catch (FileNotFoundException e)
    {
      return null;
    }
    return gson.fromJson(reader, Project.class);
  }

}
