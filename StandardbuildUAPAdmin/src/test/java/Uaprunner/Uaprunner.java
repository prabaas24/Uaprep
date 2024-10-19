package Uaprunner;

import Automationbase.Seleniumbase;
import Propreader.Uapfilemanager;
import UAPAdminPOM.Uapadmincreateassessment;
import UAPAdminPOM.Uapadmincreateschedule;
import UAPAdminPOM.Uapadminloginpage;
import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY;

public class Uaprunner extends Seleniumbase {


    public static WebDriver driver = Seleniumbase.browserlaunch();

    public static Uapadminloginpage ualp = new Uapadminloginpage(driver);

    public static Uapadmincreateassessment uaca = new Uapadmincreateassessment(driver);

    public static Uapadmincreateschedule uacs = new Uapadmincreateschedule(driver);

    public static void main(String[] args) throws Throwable {

        //UAP -- ADMIN LOGIN
        try {
            url(Uapfilemanager.getInstance().getInstanceupr().getUapadminurl());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        try {
            Sendkeys(ualp.getUsername(), Uapfilemanager.getInstance().getInstanceupr().getusername());
            Sendkeys(ualp.getPassword(), Uapfilemanager.getInstance().getInstanceupr().getpassword());
            Sleep(2000);
            click(ualp.getLogin());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        //UAP -- CREATE ASSESSMENT
        /*Sleep(5000);
        try {
            click(uaca.getCreateassessment());
            Sleep(5000);
            Sendkeys(uaca.getAssessmentname(), Uapfilemanager.getInstance().getInstanceupr().getassessmentname());
            Sendkeys(uaca.getDescription(), Uapfilemanager.getInstance().getInstanceupr().getdescription());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        driverwaitexplicit(driver, uaca.getAddtest(), 3);
        click(uaca.getAddtest());
        driverwaitexplicit(driver, uaca.getTestname(), 3);
        click(uaca.getTestname());
        driverwaitexplicit(driver, uaca.getTestselect(), 3);
        click(uaca.getTestselect());
        driverwaitexplicit(driver, uaca.getCreateassessmentbutton(), 3);
        click(uaca.getCreateassessmentbutton());
        driverwaitexplicit(driver, uaca.getViewassessment(), 3);
        click(uaca.getViewassessment());
        driverwaitexplicit(driver, uaca.getPublishassessment(), 3);
        click(uaca.getPublishassessment());*/

        //UAP -- CREATE SCHEDULE
        Sleep(10000);
        driverwaitexplicit(driver, uacs.getSchedule(), 10);
        click(uacs.getSchedule());
        driverwaitexplicit(driver, uacs.getNewschedule(), 15);
        click(uacs.getNewschedule());
        try {
            driverwaitexplicit(driver, uacs.getOrganisationdropdown(), 3);
            Sendkeys(uacs.getOrganisationdropdown(), Uapfilemanager.getInstance().getInstanceupr().getorganisationname());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        try {
            driverwaitexplicit(driver, uacs.getOrganisationpick(), 3);
            click(uacs.getOrganisationpick());
            clear(uacs.getBrowsertolerance());
            Sendkeys(uacs.getBrowsertolerance(), Uapfilemanager.getInstance().getInstanceupr().getbrowsertolerance());

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        try {
            Sendkeys(uacs.getSchedulename(), Uapfilemanager.getInstance().getInstanceupr().getschedulename());
            clear(uacs.getIdletimecapture());
            Sendkeys(uacs.getIdletimecapture(), Uapfilemanager.getInstance().getInstanceupr().getidletimecapture());
            Sendkeys(uacs.getScheduledescription(), Uapfilemanager.getInstance().getInstanceupr().getscheduledescription());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        Sleep(5000);
        click(uacs.getDisplayinstruction());
        driverwaitexplicit(driver, uacs.getAddinstruction(), 3);
        click(uacs.getAddinstruction());
        try {
            driverwaitexplicit(driver, uacs.getInstruction(), 3);
            Sendkeys(uacs.getInstruction(), Uapfilemanager.getInstance().getInstanceupr().getinstruction());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        driverwaitexplicit(driver, uacs.getInstructionsubmit(), 3);
        click(uacs.getInstructionsubmit());
        driverwaitexplicit(driver, uacs.getVerificationprocess(), 5);
        click(uacs.getVerificationprocess());
        driverwaitexplicit(driver, uacs.getVerificationprocessselect(), 3);
        click(uacs.getVerificationprocessselect());
        Sleep(5000);
        click(uacs.getSequential());
        driverwaitexplicit(driver, uacs.getAssessmentdropdown(), 5);
        click(uacs.getAssessmentdropdown());
        Sleep(3000);
        Scrolltoelement(uacs.getAssessname());
        click(uacs.getAssessname());
        Sleep(2000);
        Scroll_down();
        click(uacs.getSelectdatetime());
        click(uacs.getDatepick());
        driverwaitexplicit(driver, uacs.getMinutepick(), 5);
        click(uacs.getMinutepick());
        click(uacs.getDatepickok());
        try {
            Sendkeys(uacs.getStartduration(), Uapfilemanager.getInstance().getInstanceupr().getstartduration());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        click(uacs.getSchedulecheck());
        Sleep(2000);
        Pageup();
        Sleep(3000);
        click(uacs.getChoosetemplate());
        click(uacs.getPicktemplate());
        driverwaitexplicit(driver, uacs.getUploadcandidates(), 3);
        click(uacs.getUploadcandidates());
        Sleep(4000);
        Sendkeys(uacs.getFileinput(), Uapfilemanager.getInstance().getInstanceupr().getfileinput());
        Sleep(2000);
        click(uacs.getUploadfile());
        Sleep(2000);
        click(uacs.getUploadokbutton());
        Sleep(3000);
        click(uacs.getProctorcheck());
        Sleep(4000);
        Pagedown();
        click(uacs.getCreateschedule());
        Sleep(80000);
        click(uacs.getCreatedelivery());
    }
}
