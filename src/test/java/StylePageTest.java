import driver.driverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StylePageTest extends stylePage{
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driverSetup driverSetup = new driverSetup();
        driverSetup.setUp();
        driver.get("https://picsartstage2.com/style-transfer");
    }

    @Test
    public void test1(){
        stylePage page = new stylePage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(page.getUrl(),"https://picsartstage2.com/style-transfer",
                "Style page is not opened");
        page.clickStyleButton();
        softAssert.assertTrue(page.isRegistrationPopUpOpened(),
                "Registration pup up is not displayed when clicked on style button");
        softAssert.assertAll();


    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
