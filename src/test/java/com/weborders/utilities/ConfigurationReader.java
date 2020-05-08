package com.weborders.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static{

        try {
            //location of the properties file
            String path = System.getProperty("user.dir") + "/configuration.properties";
            //to get that file as a stream
            //this class to get smtg outside Java . and config it
            FileInputStream input = new FileInputStream(path);
            //create object of Properties class
            configFile = new Properties();
            //;load properties file into Properties object
            configFile.load(input);
            //close the input stream st the end
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        throw new RuntimeException("Failed to load properties file!");
        }

    }

    /***
     * This method returns property value from configuration.properties file
     * @param keyName property name
     * @return property value
     */
    public static String getProperty(String keyName){
        return configFile.getProperty(keyName);
    }
}
