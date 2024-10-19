package UAPAdminPOM;

import org.apache.poi.xslf.draw.geom.XSLFPolarAdjustHandle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uapadmincreateschedule {

    public Uapadmincreateschedule(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);
    }

    public static WebDriver driver;
    @FindBy(xpath = "//div//img[@src='../../../assets/schedule-icon.svg']")
    private WebElement schedule;
    @FindBy(xpath = "//button[@class='schedulebth']")
    private WebElement newschedule;
    @FindBy(xpath = "//nz-select/nz-select-top-control/nz-select-search/input")
    private WebElement organisationdropdown;
    @FindBy(xpath = "//nz-option-container/div/cdk-virtual-scroll-viewport/div/nz-option-item[@title='LTIMindtree']")
    private WebElement organisationpick;
    @FindBy(xpath = "//input[@formcontrolname='browserTolerance']")
    private WebElement browsertolerance;
    @FindBy(xpath = "//input[@formcontrolname='scheduleName']")
    private WebElement schedulename;
    @FindBy(xpath = "//input[@formcontrolname='idealTimeCapture']")
    private WebElement idletimecapture;
    @FindBy(xpath = "//input[@formcontrolname='scheduleDescription']")
    private WebElement scheduledescription;
    @FindBy(xpath = "//label[contains(text(),'Display Gen')]/following-sibling::div/descendant::input[@id='mat-radio-2-input']")
    private WebElement displayinstruction;
    @FindBy(xpath = "//button//span[contains(text(),'Add Instructions')]")
    private WebElement addinstruction;
    @FindBy(xpath = "//div[@role='textbox']")
    private WebElement instruction;
    @FindBy(xpath = "//div//button[contains(text(),'Submit')]")
    private WebElement instructionsubmit;
    @FindBy(xpath = "(//input[contains(@class,'search-input')])[2]")
    private WebElement verificationprocess;
    @FindBy(xpath = "//div//nz-option-item[@title='No']")
    private WebElement verificationprocessselect;
    @FindBy(xpath = "//input[contains(@value,'sequential')]")
    private WebElement sequential;
    @FindBy(xpath = "//input[contains(@placeholder,'Search and select assessment name')]")
    private WebElement assessmentdropdown;
    @FindBy(xpath = "//input[@placeholder='Search and select assessment name']")
    private WebElement asnameinput;
    //MODIFY THE BELOW XPATH BASED ON THE ASSESSMENT NAME GIVEN IN THE PROPERTIES FILE
    @FindBy(xpath = "//div[contains(@class,'cdk-overlay-pane')]/descendant::div[contains(text(),'Stdbuildautomation__101724')]")
    private WebElement assessname;
    @FindBy(xpath = "//input[contains(@placeholder,'Select date & time')]")
    private WebElement selectdatetime;
    //CHANGE DATE BELOW AS REQUIRED
    @FindBy(xpath = "//table//descendant::td[@title='10/17/2024']")
    private WebElement datepick;
    @FindBy(xpath = "//div//ul//descendant::div[contains(text(),'18')]")
    private WebElement minutepick;
    @FindBy(xpath = "//button//span[contains(text(),'Ok')]")
    private WebElement datepickok;
    @FindBy(xpath = "//a[text()=' Now ']")
    private WebElement currentdatetime;
    @FindBy(xpath = "//nz-input-group//input[@formcontrolname='startDuration']")
    private WebElement startduration;
    @FindBy(xpath = "//div//button//span[contains(text(),'Check')]")
    private WebElement schedulecheck;
    @FindBy(xpath = "(//nz-select//nz-select-top-control[contains(@class,'ant-select-selector')])[7]")
    private WebElement choosetemplate;
    @FindBy(xpath = "//div//nz-option-item[@title='Default Template']")
    private WebElement picktemplate;
    @FindBy(xpath = "//button//span[contains(text(),'Upload Candidates')]")
    private WebElement uploadcandidates;
    @FindBy(css = "input[type='file']")
    private WebElement fileinput;
    @FindBy(xpath = "//button[@accept='.csv']")
    private WebElement uploadfile;
    @FindBy(xpath = "//div[@class='success-btn']//span[contains(text(),'Ok')]")
    private WebElement uploadokbutton;
    @FindBy(xpath = "//div//input[@id='mat-radio-15-input']")
    private WebElement proctorcheck;
    @FindBy(xpath = "//div[@class='align-btns']//button[contains(text(),'Create Schedule')]")
    private WebElement createschedule;
    @FindBy(xpath = "//span//u[contains(text(),'Create Delivery')]")
    private WebElement createdelivery;

    public WebElement getSchedule() {
        return schedule;
    }

    public WebElement getNewschedule() {
        return newschedule;
    }

    public WebElement getOrganisationdropdown() {
        return organisationdropdown;
    }

    public WebElement getOrganisationpick() {
        return organisationpick;
    }

    public WebElement getBrowsertolerance() {
        return browsertolerance;
    }

    public WebElement getSchedulename() {
        return schedulename;
    }

    public WebElement getIdletimecapture() {
        return idletimecapture;
    }

    public WebElement getScheduledescription() {
        return scheduledescription;
    }

    public WebElement getDisplayinstruction() {
        return displayinstruction;
    }

    public WebElement getAddinstruction() {
        return addinstruction;
    }

    public WebElement getInstruction() {
        return instruction;
    }

    public WebElement getInstructionsubmit() {
        return instructionsubmit;
    }

    public WebElement getVerificationprocess() {
        return verificationprocess;
    }

    public WebElement getVerificationprocessselect() {
        return verificationprocessselect;
    }

    public WebElement getSequential() {
        return sequential;
    }

    public WebElement getAssessmentdropdown() {
        return assessmentdropdown;
    }

    public WebElement getAssessname() {
        return assessname;
    }

    public WebElement getSelectdatetime() {
        return selectdatetime;
    }

    public WebElement getDatepick() {
        return datepick;
    }

    public WebElement getMinutepick() {
        return minutepick;
    }

    public WebElement getDatepickok() {
        return datepickok;
    }

    public WebElement getCurrentdatetime() {
        return currentdatetime;
    }

    public WebElement getStartduration() {
        return startduration;
    }

    public WebElement getSchedulecheck() {
        return schedulecheck;
    }

    public WebElement getChoosetemplate() {
        return choosetemplate;
    }

    public WebElement getPicktemplate() {
        return picktemplate;
    }

    public WebElement getUploadcandidates() {
        return uploadcandidates;
    }

    public WebElement getFileinput() {
        return fileinput;
    }

    public WebElement getUploadfile() {
        return uploadfile;
    }

    public WebElement getUploadokbutton() {
        return uploadokbutton;
    }

    public WebElement getProctorcheck() {
        return proctorcheck;
    }

    public WebElement getCreateschedule() {
        return createschedule;
    }

    public WebElement getCreatedelivery() {
        return createdelivery;
    }

    public WebElement getAsnameinput() {
        return asnameinput;
    }

}
