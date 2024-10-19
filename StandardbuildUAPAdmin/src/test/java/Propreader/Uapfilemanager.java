package Propreader;

public class Uapfilemanager {
    private Uapfilemanager() {

    }

    public static Uapfilemanager getInstance() {
        Uapfilemanager ufm = new Uapfilemanager();
        return ufm;
    }

    public static Uappropertyreader getInstanceupr() throws Throwable {
        Uappropertyreader upr = new Uappropertyreader();
        return upr;
    }

}
