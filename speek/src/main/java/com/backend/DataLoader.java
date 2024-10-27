package com.backend;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public class DataLoader extends DataConstants {
    public static UserList loadUsers()  {
        UserList users = UserList.getInstance();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);

            JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);


            for (int i = 0; i < usersJSON.size(); i++) 
            {
                JSONObject userJSON = (JSONObject) usersJSON.get(i);
                if (userJSON != null) {
                    String password = (String) userJSON.get(USER_PASSWORD);
                    String userName = (String) userJSON.get(USER_USERNAME);
                    UUID userID = UUID.fromString((String) userJSON.get(USER_UUID));
                    String email = (String) userJSON.get(USER_EMAIL);
                    User aU = new User(userName, email, password,userID);
                    users.addUser(aU);
                }
            }
            reader.close();
            return users;

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



    public static LanguageList loadLanguages(){
        LanguageList languageList = LanguageList.getInstance();
        try {
            FileReader reader = new FileReader(LANGUAGE_FILE_NAME);



        }
        catch (Exception e){
            e.printStackTrace();
        }


        return languageList;
    }




//    public static WordList loadWords(){
//        WordList words = WordList.getInstance();
//        try{
//            FileReader reader = new FileReader(WORD_FILE_NAME);
//            JSONObject jsonObj = (JSONObject) new JSONParser().parse(reader);
//            Iterator<String> keys = (Iterator<String>) jsonObj.keySet().iterator();
////            JSONArray wordsJSON = (JSONArray) new JSONParser().parse(reader);
//            while(keys.hasNext())
//            {
//                String uuid = keys.next();
//                JSONObject wordJSON = (JSONObject) jsonObj.get(uuid);
//
//                if (wordJSON != null) {
//
//                    Word word = new Word(null,UUID.fromString(uuid));
//                    words.addWord(word);
//                }
//            }
//            reader.close();
//            return words;
//
//
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }


}