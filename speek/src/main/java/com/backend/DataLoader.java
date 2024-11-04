package com.backend;

import org.json.simple.*;
import org.json.simple.parser.*;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

public class DataLoader extends DataConstants {

    public static ArrayList<User> loadUsers()  {



        ArrayList<User> users = new ArrayList<>();

        try {
            System.out.println("Loading users");
            FileReader reader = new FileReader(USER_FILE_NAME);

            JSONArray usersJSON = (JSONArray) new JSONParser().parse(reader);


            for (Object o : usersJSON) {
                JSONObject userJSON = (JSONObject) o;
                if (userJSON != null) {
                    String password = (String) userJSON.get(USER_PASSWORD);
                    String userName = (String) userJSON.get(USER_USERNAME);
                    UUID userID = UUID.fromString((String) userJSON.get(USER_UUID));
                    String email = (String) userJSON.get(USER_EMAIL);

                    User aU = new User(userName, email, password, userID);

                    JSONArray userProgress = (JSONArray) userJSON.get(USER_PROGRESS);
                    for(Object p: userProgress){
                        JSONObject progressJSON = (JSONObject) p;

                        String[] keySetArray = (String[]) progressJSON.keySet().toArray();
                        for(String key:keySetArray){


                        }

                    }
                    //Progress


                    //System.out.println("User: " + aU);
                    users.add(aU);

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



    public static ArrayList<Language> loadLanguages(){
        ArrayList<Language> languages = new ArrayList<Language>();
        System.out.println("Loading languages. This may take a moment.");
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);

            JSONArray languagesJSON = (JSONArray) new JSONParser().parse(reader);


            for (Object o : languagesJSON) {
                JSONObject languageJSON = (JSONObject) o;
                if(languageJSON == null) {
                    continue;
                }
                String name = (String) languageJSON.get(LANGUAGE_NAME);
                UUID uuid = UUID.fromString((String) languageJSON.get(USER_UUID));
                JSONArray words = (JSONArray) languageJSON.get(LANGUAGE_WORDS);
                WordList wordList = new WordList();
                for(Object idx : words){
                    JSONArray wordArray = (JSONArray) idx;
                    // These are hard-coded indicies because this 200 level class
                    // has the work requirements of a full-time developer and is eating
                    // into the few days I have to myself.
                    // I have neither time nor patience to do this the "right way"
                    String wordString = (String) wordArray.get(0);
                    String wordDefinition = (String) wordArray.get(1);
                    UUID wordUUID = UUID.fromString((String) wordArray.get(2));
                    Word word = new Word(wordString,wordDefinition,wordUUID);
                    wordList.addWord(word);
                }
                //System.out.println("User: " + aU);
                Language language = new Language(name, wordList, null, uuid);
                languages.add(language);




            }
            reader.close();

            return languages;

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }





}