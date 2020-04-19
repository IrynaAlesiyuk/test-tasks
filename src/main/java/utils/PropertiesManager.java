package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {
    private FileInputStream file;

    public String propFile(String propItem)  {

        Properties properties = new Properties();
        try {
            file = new FileInputStream("//Users//iral//Desktop//Project//My//testtask//localEnvironment.properties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propItem);
    }

}
