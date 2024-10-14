import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataWriter extends DataConstants 
{
    
    private ObjectMapper objectMapper = new ObjectMapper();

    public boolean writeUsersToJson(List<User> users) 
    {
        try 
        {
            objectMapper.writeValue(new File(USER_FILE_NAME), users);
            return true; 
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return false; 
        }
    }
}


