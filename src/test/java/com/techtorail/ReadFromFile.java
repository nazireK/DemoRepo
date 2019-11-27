package com.techtorail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        //getProperties("aldkf").equals("");
        //specify the needed file
        File creadFile = new File("src/test/Resource/credentials.properties");
        // read from a file
        FileReader fileReader = new FileReader(creadFile);
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.stringPropertyNames());
        String login = properties.getProperty("login");
        System.out.println("my login from properties file is : " + login);
        String url = properties.getProperty("url");
        System.out.println("my login from properties file is : " + url);
        String password = properties.getProperty("password");
        System.out.println("my login from properties file is : " + password);
        System.out.println(properties.stringPropertyNames());
    }

//    }
//    public static String getProperties(String Key) throws IOException {
//        //specify the needed file
//        File creadFile=new File("src/test/Resource/credentials.properties");// I have file yani my file location
//        // read from a file
//        FileReader fileReader=new FileReader(creadFile);// please read how to that  tell me which file
//        Properties properties=new Properties();// this is properties file i need file create properties class  read by line by
//        properties.load(fileReader);// after you instance will read  please load  inside has filereader
//
//        String value=properties.getProperty(Key);// you know evertyinhg  get key  give me some key example login key retunr key the value
//        return value;
//
//    }
}
