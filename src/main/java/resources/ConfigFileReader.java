package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private static  ConfigFileReader configFileReader;
    Properties properties;
    public ConfigFileReader() throws IOException {
        String configFilePath = "src/main/java/resources/config.properties";
        properties=new Properties();
        FileInputStream fis = new FileInputStream(configFilePath);
        properties.load(fis);
    }

    public static ConfigFileReader getInstance(){
        return configFileReader;
    }

    public static ConfigFileReader getConfigFileReader() throws IOException {
        return (configFileReader==null)? new ConfigFileReader():configFileReader;
    }

    public  String getValue(String value){
        return properties.getProperty(value);
    }
}
