import driver.driverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class stylePage extends driverSetup {

   WebDriver driver;

    public void clickStyleButton(){
        driver.findElement(By.cssSelector("[data-test='action-button-1-Picsart’s-Style-Transfer-Tool-Transforms-Images-to-Masterpieces']")).click();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public boolean isRegistrationPopUpOpened(){
        WebElement regPopUp = driver.findElement(By.cssSelector("[class*='pa-uiLib-modal-modalContent']"));
        return regPopUp.isDisplayed();
    }


    
}
