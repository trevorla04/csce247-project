import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A class for writing user and learning data to files using Jackson's ObjectMapper.
 */
public class DataWriter extends DataConstants {
    
    /** The ObjectMapper instance used for converting objects to JSON. */
    private ObjectMapper objectMapper;

    /**
     * Constructs a new DataWriter instance and initializes the ObjectMapper.
     */
    public DataWriter() {
        this.objectMapper = new ObjectMapper(); 
    }

    /**
     * Saves a list of users to a specified file.
     * @param users an ArrayList of User objects to be saved
     * @return true if the users were successfully saved; false otherwise
     */
    public boolean saveUsers(ArrayList<User> users) {
        try {
            objectMapper.writeValue(new File(/*file name??*/), users);
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Saves a LanguageApplication instance to a specified file.
     * @param learningToSave the LanguageApplication object to be saved
     * @return true if the learning data was successfully saved; false otherwise
     */
    public boolean saveLearning(LanguageApplication learningToSave) {
        try {
            objectMapper.writeValue(new File(USER_FILE_NAME.replace(/*file name??*/)), learningToSave);
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
    }
}
