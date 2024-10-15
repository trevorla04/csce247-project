import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter extends DataConstants 
{

    public static void saveUsers() {
        UserList users = UserList.getInstance();
        JSONArray usersJSON = new JSONArray();

        for (User user : users.getAllUsers()) {
            JSONObject userJSON = new JSONObject();
            userJSON.put(USER_USERNAME, user.getUsername());
            userJSON.put(USER_EMAIL, user.getEmail());
            userJSON.put(USER_PASSWORD, user.getPassword());
            userJSON.put(USER_UUID, user.getUUID().toString());

            usersJSON.add(userJSON);
        }

        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            file.write(usersJSON.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


