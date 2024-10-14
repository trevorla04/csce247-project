import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;

public class DataLoader extends DataConstants
{
    private ObjectMapper objectMapper; //not too familiar with this class. discovered it when researching how to write json files.

    public DataLoader() 
    {
        this.objectMapper = new ObjectMapper(); 
    }

    public ArrayList<Users> getUsers ()
    {
        try 
        {
            return objectMapper.readValue(new File(/*file name?? */), new TypeReference<ArrayList<User>>() {});
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            return new ArrayList<>(); 
        }
    }

    public LanguageApplication getLearning ()
    {
        try 
        {  
            return objectMapper.readValue(new File(/*file name?? */)), LanguageApplication.class);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        return null;
    }
}