import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataWriter {
    
    private ObjectMapper objectMapper = new ObjectMapper();

    public boolean writeUsersToJson(List<User> users, String filePath) 
    {
        try 
        {
            objectMapper.writeValue(new File(filePath), users);
            return true; 
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            return false; 
        }
    }
}

