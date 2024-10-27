package com.backend;

import software.amazon.awssdk.services.polly.endpoints.internal.Value;

import java.util.*;
public class DataConstants
{
<<<<<<< HEAD
    protected static final String USER_FILE_NAME = "./json/users.json";

    /*(System.getProperty("os.name").equals("Linux")
    ? ".json/users.json"
    : ".\\json\\users.json");*/
=======
    protected static final String USER_FILE_NAME = System.getProperty("user.dir") + "/json/users.json";

    /*(System.getProperty("os.name").equals("Linux")
    ? "./demo/src/main/java/data/user.json"
    : ".\\demo\\src\\main\\java\\data\\user.json");*/
>>>>>>> 3a2cbec2ae1214aeb223df1a9d9b179958011742
    protected static final String USER_USERNAME = "username";
    protected static final String USER_PASSWORD = "password";
    protected static final String USER_EMAIL = "email";
    protected static final String USER_BIO = "bio";
    protected static final String USER_UUID = "uuid";

    protected static final String WORD_FILE_NAME = (System.getProperty("os.name").equals("Linux")
            ? "./demo/src/main/java/data/words.json"
            : ".\\demo\\src\\main\\java\\data\\words.json");
    protected static final String LANGUAGE_FILE_NAME = "./json/language.json";




}
