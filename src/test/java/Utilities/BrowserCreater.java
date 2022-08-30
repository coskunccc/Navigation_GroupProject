package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCreater {

    public static WebDriver getDriver(String browser) {
        browser = browser.toLowerCase();
        if (browser.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.contains("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browser.contains("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else return null;
    }


}
