package Utilitypackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class commonutils {

    public static String getUrl(String PropFileName) throws IOException {
        Properties prop = new Properties();
        FileInputStream in = new FileInputStream(PropFileName);
        prop.load(in);
        return prop.getProperty("url");
    }
}