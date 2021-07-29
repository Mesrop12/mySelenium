import driver.driverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class stylePage extends driverSetup {

    WebDriver driver;
    public stylePage(WebDriver driver ) {
        this.driver = driver;

    }
    By styleButton = By.cssSelector("[data-test='action-button-1-Picsart’s-Style-Transfer-Tool-Transforms-Images-to-Masterpieces']");
    By regPopup = By.cssSelector("[class*='pa-uiLib-modal-modalContent']");

    public void clickStyleButton() {
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(styleButton));
        driver.findElement(styleButton).click();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isRegistrationPopUpOpened() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(regPopup));
        WebElement regPopUp = driver.findElement(regPopup);
        return regPopUp.isDisplayed();
    }

}
