package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class driverSetup {

    WebDriver driver;
    Properties p = new Properties();

    public void setUp() {
        FileInputStream loc = null;
        try {
            loc = new FileInputStream("/Users/mesropandranikyan1/Desktop/myProject/properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            p.load(loc);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(p.getProperty("browser").contains("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/mesropandranikyan1/Desktop/myProject/driver/chromedriver");
            driver = new ChromeDriver();
        }
        else{
            System.setProperty("webdriver.gecko.driver", "/Users/mesropandranikyan1/Desktop/myProject/driver/geckodriver");
            driver = new FirefoxDriver();
        }
    }
}
