package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesUtil {
//    public static void main(String[] args) throws IOException {
//        //specify the needed file
//        File credsFile = new File("src/test/resourses/credentials.properties");
//        //read from file
//
//        FileReader fileReader = new FileReader(credsFile);
//        Properties properties = new Properties();
//        properties.load(fileReader);
//        String login = properties.getProperty("login");
//        if (login == null) {
//            System.out.println("Sorry, no such key in properties file");
//        } else {
//            System.out.println("my login from properties file is : " + login);
//        }
//        String password = properties.getProperty("password");
//        System.out.println("my password from properties file is : " + password);
//        String url = properties.getProperty("url", "url=https://google.com");
//        System.out.println("my url from properties file is : " + url);
//        System.out.println(properties.stringPropertyNames()); //it will output only keys from properties file
//    }

    public static String getProperties(String key) throws IOException, IOException {
        //specify the needed file
        File credsFile = new File("src/test/resourses/credentials.properties");
        //read from file, it reads line by line, but it will not get you
        //keys or values seperately
        FileReader fileReader = new FileReader(credsFile);
        Properties properties = new Properties();
        properties.load(fileReader);


        Set<Object> set = properties.keySet();
        String value="";
        if(set.contains(key)){
            value=properties.getProperty(key);
            System.out.println("My key from properties file is : "+value);
            return value;
        }else {
            System.out.println("Sorry, no such key in properties file");
        }
        return value;
    }
    }

