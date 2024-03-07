package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReader {
    public String returnValueFromFile(String parameter, String path) throws IOException {
        Properties properties=new Properties();
        FileInputStream fis = new FileInputStream(path);
        properties.load(fis);
        return properties.getProperty(parameter);
    }
}
