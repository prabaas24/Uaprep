package UAPAdminPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uapadminloginpage {

    public Uapadminloginpage(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);
    }

    public static WebDriver driver;

    @FindBy(xpath = "//div//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//div//input[@placeholder='Enter password']")
    private WebElement password;
    @FindBy(xpath = "//button[@id='login']")
    private WebElement login;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLogin() {
        return login;
    }
}
