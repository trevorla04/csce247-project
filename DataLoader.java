import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;

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
                if (userJSON != null) {
                    String password = (String) userJSON.get(USER_PASSWORD);
                    String userName = (String) userJSON.get(USER_USERNAME);
                    UUID userID = UUID.fromString((String) userJSON.get(USER_ID));
                    String type = (String) userJSON.get(USER_TYPE);
                    String email = (String) userJSON.get(USER_EMAIL);
                    User aU = new User(userName, email, password);
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