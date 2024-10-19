package Propreader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Uappropertyreader {

    public static Properties p;

    public Uappropertyreader() throws Throwable {
        File f = new File("D://Selenium//eclipse-workspace//eclipse-workspace//Projectmaven//StandardbuildUAPAdmin//Uapadmin.properties");
        FileInputStream fis = new FileInputStream(f);
        p = new Properties();
        p.load(fis);
    }

    public String getUapadminurl() {
        String Uapadminurl = p.getProperty("Uapadminurl");
        return Uapadminurl;
    }

    public String getusername() {
        String username = p.getProperty("username");
        return username;
    }

    public String getpassword() {
        String password = p.getProperty("password");
        return password;
    }

    public String getassessmentname() {
        String assessmentname = p.getProperty("assessmentname");
        return assessmentname;
    }

    public String getdescription() {
        String description = p.getProperty("description");
        return description;
    }

    public String getorganisationname() {
        String organisationname = p.getProperty("organisationname");
        return organisationname;
    }

    public String getbrowsertolerance() {
        String browsertolerance = p.getProperty("browsertolerance");
        return browsertolerance;
    }

    public String getschedulename() {
        String schedulename = p.getProperty("schedulename");
        return schedulename;
    }

    public String getidletimecapture() {
        String idletimecapture = p.getProperty("idletimecapture");
        return idletimecapture;
    }

    public String getscheduledescription() {
        String scheduledescription = p.getProperty("scheduledescription");
        return scheduledescription;
    }

    public String getinstruction() {
        String instruction = p.getProperty("instruction");
        return instruction;
    }

    public String getstartduration() {
        String startduration = p.getProperty("startduration");
        return startduration;
    }

    public String getfileinput() {
        String fileinput = p.getProperty("fileinput");
        return fileinput;
    }


}
