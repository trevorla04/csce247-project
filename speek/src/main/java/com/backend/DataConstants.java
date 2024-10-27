package com.backend;

import java.util.*;
public class DataConstants
{
    protected static final String USER_FILE_NAME = "./json/users.json";

    /*(System.getProperty("os.name").equals("Linux")
    ? ".json/users.json"
    : ".\\json\\users.json");*/
    protected static final String USER_USERNAME = "username";
    protected static final String USER_PASSWORD = "password";
    protected static final String USER_EMAIL = "email";
    protected static final String USER_BIO = "bio";
    protected static final UUID USER_UUID = UUID.randomUUID();

    protected static final String WORD_FILE_NAME = (System.getProperty("os.name").equals("Linux")
            ? "./demo/src/main/java/data/words.json"
            : ".\\demo\\src\\main\\java\\data\\words.json");





}
