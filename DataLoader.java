import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A class for loading user and learning data from JSON files using Jackson's ObjectMapper.
 */
public class DataLoader extends DataConstants {
    
    /** The ObjectMapper instance used for converting JSON to objects. */
    private ObjectMapper objectMapper; // Not too familiar with this class; discovered it while researching how to read JSON files.

    /**
     * Constructs a new DataLoader instance and initializes the ObjectMapper.
     */
    public DataLoader() {
        this.objectMapper = new ObjectMapper(); 
    }

    /**
     * Retrieves a list of users from a specified JSON file.
     * @return an ArrayList of User objects, or an empty list if an error occurs
     */
    public ArrayList<User> getUsers() {
        try {
            return objectMapper.readValue(new File(/*file name?? */), new TypeReference<ArrayList<User>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>(); 
        }
    }

    /**
     * Retrieves a LanguageApplication instance from a specified JSON file.
     * @return a LanguageApplication object, or null if an error occurs
     */
    public LanguageApplication getLearning() {
        try {
            return objectMapper.readValue(new File(/*file name?? */), LanguageApplication.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }
}