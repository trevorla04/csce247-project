import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ArrayList;

public class DataLoader extends DataConstants
{
    public static ArrayList<User> loadUsers() 
    {
        users = new ArrayList<User>();

        try 
        {
            FileReader reader = new FileReader("users.json");
            JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < usersJSON.size(); i++) 
            {
                JSONObject userJSON = (JSONObject) usersJSON.get(i);
                if (userJSON != null) 
                {
                    String phoneNumber = (String) userJSON.get(USER_PHONE_NUMBER);
                    String firstName = (String) userJSON.get(USER_FIRST_NAME);
                    String lastName = (String) userJSON.get(USER_LAST_NAME);
                    String password = (String) userJSON.get(USER_PASSWORD);
                    String userName = (String) userJSON.get(USER_USERNAME);
                    UUID userID = UUID.fromString((String) userJSON.get(USER_ID));
                    String type = (String) userJSON.get(USER_TYPE);
                    String email = (String) userJSON.get(USER_EMAIL);
                    User aU = new User(userID, firstName, lastName, userName, password, email, phoneNumber, type);
                    users.add(aU);
                }
            }
            reader.close();
            return users;

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        return null;
    }
}