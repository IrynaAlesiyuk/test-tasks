package utils;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

    @SneakyThrows
    public static String propFile(String propItem) {
        Properties properties = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream("localEnvironment.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
        return properties.getProperty(propItem);
    }
}
