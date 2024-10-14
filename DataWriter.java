import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataWriter extends DataConstants
{
    private ObjectMapper objectMapper;

    public DataWriter() 
    {
        this.objectMapper = new ObjectMapper(); 
    }

    public boolean saveUsers (ArrayList<User> users) //thought maybe we should add this paramater??
    {
        try 
        {
            objectMapper.writeValue(new File(/*file name??*/), users);
            return true; 
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveLearning (LanguageApplication learningToSave) //this one too
    {
        try 
        {
            objectMapper.writeValue(new File(USER_FILE_NAME.replace(/*file name??*/)), learningToSave);
            return true; 
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return false; 
        }
    }
}

