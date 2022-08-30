package Navigation;

import Utilities.BrowserCreater;
import Utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Navigation {
    public static void test(String browser){
        WebDriver driver=BrowserCreater.getDriver(browser);

        driver.get("https://google.com");
        String googleTitleBefore=driver.getTitle();

        driver.get("https://etsy.com");
        String etsyTitleBefore=driver.getTitle();

        driver.navigate().back();
        String googleTitleAfter=driver.getTitle();
        System.out.println("Verification of Google Title:");
        StringUtility.verifyEquals(googleTitleBefore,googleTitleAfter);

        driver.navigate().forward();
        String etsyTitleAfter=driver.getTitle();
        System.out.println("Verification of Etsy Title: ");
        StringUtility.verifyEquals(etsyTitleBefore,etsyTitleAfter);



    }
    public static void main(String[] args) {
        /*
        Test the cases in three browsers
        1. Open browser
        2. Go to website https://google.com
        3. Save the title in a string variable
        4. Go to https://etsy.com
        5. Save the title in a string variable
        6. Navigate back to previous page
        7. Verify that title is same is in step 3
        8. Navigate forward to previous page
        9. Verify that title is same is in step 5

         */

       test("chrome");
       test("firefox");
       test("edge");



    }
}
