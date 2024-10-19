package UAPAdminPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uapadmincreateassessment {

    public Uapadmincreateassessment(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);

    }

    public static WebDriver driver;
    @FindBy(xpath = "//div//child::span[contains(text(),'Create Assessment')]")
    private WebElement createassessment;
    @FindBy(xpath = "//input[@placeholder='Enter the Assessment Name']")
    private WebElement assessmentname;
    @FindBy(xpath = "//input[@placeholder='Enter the description']")
    private WebElement description;
    @FindBy(xpath = "//div[@class='row-wrapper']//descendant::div[contains(text(),'Add Test')]")
    private WebElement addtest;
    @FindBy(xpath = "//input[@placeholder='Select Test Name']")
    private WebElement testname;
    @FindBy(xpath = "//div[@class='cdk-overlay-container']//nz-auto-option//div[@class='ant-select-item-option-content' and contains(text(), 'Aptitude & Domain Assessments_073124')]")
    private WebElement testselect;
    @FindBy(xpath = "//div//button[contains(text(),'Create Assessment')]")
    private WebElement createassessmentbutton;
    @FindBy(xpath = "((//div)[1]//table//tbody//tr//td[7]//span//img[@src='/assets/images/Icon feather-eye.svg'])[1]")
    private WebElement viewassessment;
    @FindBy(xpath = "//div//button[contains(text(),'Publish')]")
    private WebElement publishassessment;

    public WebElement getCreateassessment() {
        return createassessment;
    }

    public WebElement getAssessmentname() {
        return assessmentname;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getAddtest() {
        return addtest;
    }

    public WebElement getTestname() {
        return testname;
    }

    public WebElement getTestselect() {
        return testselect;
    }

    public WebElement getCreateassessmentbutton() {
        return createassessmentbutton;
    }

    public WebElement getViewassessment() {
        return viewassessment;
    }

    public WebElement getPublishassessment() {
        return publishassessment;
    }
}
