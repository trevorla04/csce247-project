package com.backend;

import software.amazon.awssdk.services.polly.endpoints.internal.Value;

import java.util.*;
public class DataConstants
{
    /*(System.getProperty("os.name").equals("Linux")
    ? ".json/users.json"
    : ".\\json\\users.json");*/
    //protected static final String USER_FILE_NAME = System.getProperty("user.dir") + "/json/users.json";
    protected static final String USER_FILE_NAME = System.getProperty("user.dir") + "/src/test/resources/data/users.json";

    /*(System.getProperty("os.name").equals("Linux")
    ? "./demo/src/main/java/data/user.json"
    : ".\\demo\\src\\main\\java\\data\\user.json");*/
    protected static final String USER_USERNAME = "username";
    protected static final String USER_PASSWORD = "password";
    protected static final String USER_EMAIL = "email";
    protected static final String USER_BIO = "bio";
    protected static final String USER_UUID = "uuid";
    protected static final String USER_PROGRESS = "progress";

    protected static final String LANGUAGE_NAME = "name";
    protected static final String LANGUAGE_WORDS = "words";


    protected static final String WORD_FILE_NAME = (System.getProperty("os.name").equals("Linux")
            ? "./demo/src/main/java/data/words.json"
            : ".\\demo\\src\\main\\java\\data\\words.json");
    protected static final String LANGUAGE_FILE_NAME = "./json/language.json";




}
