package com.project.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Logger log = LogManager.getLogger(ConfigReader.class);
    private static Properties properties = new Properties();


    public static void loadProperties(){
        try(InputStream input = new FileInputStream("src/main/resources/config.properties")){
            properties.load(input);
            log.info("Properties file has been loaded");
        } catch (IOException e) {
            log.info("Unable to read properties file" + " " + e);
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);

    }

}
