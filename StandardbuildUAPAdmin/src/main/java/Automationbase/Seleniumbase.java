package Automationbase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Seleniumbase {
    public static WebDriver driver;

    public static WebDriver browserlaunch()  {
        System.setProperty("webdriver.chrome.driver", "D://Driver//Chromedriveroct//chromedriver-win64//chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver Newwindow() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--new-window");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        return driver;
    }

    public static void url(String url) throws Exception {

        try {
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("url is not found ");
        }
    }

    public static void close() {

        driver.close();
    }

    public static void quit() {

        driver.quit();
    }

    public static void navigateTo(String url) {

        driver.navigate().to(url);
    }

    public static void navigateBack() {

        driver.navigate().back();
    }

    public static void navigateForward() {

        driver.navigate().forward();
    }

    public static void navigateRefresh() {

        driver.navigate().refresh();
    }

    public static String currenturl() throws Exception {
        String currenturl = null;
        try {
            currenturl = driver.getCurrentUrl();
            System.out.println(currenturl);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("if url is not present");

        }
        return currenturl;
    }

    public static void Alert1(WebElement Element, String var) {
        Element.click();

        Alert alert = driver.switchTo().alert();
        if (var == "OK") {
            alert.accept();
            driver.switchTo().defaultContent();
        } else {
            alert.dismiss();
            driver.switchTo().defaultContent();
        }
    }

    public static void Alert2(WebElement Element, String value) {
        Element.click();
        Alert alt = driver.switchTo().alert();
        alt.sendKeys(value);

    }

    public static void Movetoelement(WebElement Element) {

        Actions act = new Actions(driver);
        act.moveToElement(Element).build().perform();
    }

    public static void Click(WebElement Element) {
        Actions act1 = new Actions(driver);

        act1.click().perform();
    }

    public static void Clickandhold(WebElement Element) {
        Actions act2 = new Actions(driver);
        act2.clickAndHold().perform();
    }

    public static void Contextclick(WebElement Element) {
        Actions act3 = new Actions(driver);
        act3.contextClick().perform();
    }

    public static void doubleClick(WebElement Element) {
        Actions act4 = new Actions(driver);

        act4.doubleClick().perform();
    }

    public static void draganddrop(WebElement source, WebElement destination) {
        Actions act5 = new Actions(driver);

        act5.dragAndDrop(source, destination);
    }

    public static void release(WebElement Element) {
        Actions act6 = new Actions(driver);
        act6.release().perform();

    }

    public static void frames(WebElement Element) {

        driver.switchTo().frame(Element);

    }

    public static void Robot() throws AWTException {

        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_DOWN);
        bot.keyRelease(KeyEvent.VK_DOWN);

        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void WindowHandles(WebElement element) {
        String win = driver.getWindowHandle();
        element.click();
        Set<String> newwin = driver.getWindowHandles();
        for (String w : newwin) {
            driver.switchTo().window(w);
        }

    }

    public static void Dropdown(WebElement Element, String value, String i) {

        Select s = new Select(Element);

        if (value.equalsIgnoreCase("byindex")) {

            int index = Integer.parseInt(i);

            s.selectByIndex(index);
        } else if (value.equalsIgnoreCase("byVisibleText")) {

            s.selectByVisibleText(i);
        } else if (value.equalsIgnoreCase("byValue")) {

            s.selectByValue(i);
        }
    }

    public static void Checkbox() {

        WebElement Chkbox = driver.findElement(By.xpath(""));

        Chkbox.click();
    }

    public static boolean isEnable(WebElement Element) {

        boolean enable = false;
        enable = Element.isEnabled();
        return enable;
    }

    public static boolean isDisplayed(WebElement Element) {

        boolean display = false;
        display = Element.isDisplayed();
        return display;

    }

    public static boolean isSelected(WebElement Element) {

        boolean Selected = false;
        Selected = Element.isSelected();
        return Selected;
    }

    public static void Getoptions(WebElement Element) {

        Select options = new Select(Element);

        java.util.List<WebElement> drop = options.getOptions();

        for (WebElement w : drop) {

            System.out.println(w.getText());
        }

    }

    public static void firstseleoptions(WebElement Element) {

        Select s = new Select(Element);

        WebElement fso = s.getFirstSelectedOption();

        System.out.println((fso.getText()));

    }

    public static void allselectedoptions(WebElement Element) {

        Select s = new Select(Element);

        List<WebElement> k = s.getAllSelectedOptions();

        for (WebElement a : k) {

            System.out.println(a.getText());
        }
    }

    public static String Gettitle() {

        String title = null;
        try {
            title = driver.getTitle();
            System.out.println(title);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return title;
    }

    public static void Gettext(WebElement element) {

        System.out.println(element.getText());
    }

    public static void Getattribute(WebElement attribute) {

        String att = attribute.getAttribute("value");
        System.out.println(att);

    }

    public static void screenshot(String ss) throws Throwable {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File dest = new File("C://Users//20334262//IdeaProjects//OpenAssessmentTech" + ss);

        FileHandler.copy(source, dest);
    }

    public static void Scrolltoelement(WebElement element) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    public static void Scroll_up() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,-3000)");
    }

    public static void Scroll_down() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,3000);");
    }

    public static void Sendkeys(WebElement Element, String var) {

        Element.sendKeys(var);
    }

    public static void sendusername(WebElement Element, String username) {
        Element.sendKeys(username);
    }

    public static void sendtestplayername(WebElement Element, String login) {
        Element.sendKeys(login);
    }
    public static void sendtestplayerpassword (WebElement Element, String keyword){
        Element.sendKeys(keyword);
    }
    public static void sendpassword(WebElement Element, String password) {
        Element.sendKeys(password);
    }

    public static void isMultiple() {

        WebElement ismulti = driver.findElement(By.xpath(""));

        Select s = new Select(ismulti);

        boolean k = s.isMultiple();
    }

    public static void click(WebElement Element) {

        Element.click();
    }

    public static void Radio(WebElement Element) {
        Element.click();
    }

    public static void Sleep(int value) {
        try {
            Thread.sleep(value);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void deletecookies() {
        driver.manage().deleteAllCookies();
    }

    public static void clear(WebElement element) {
        element.clear();
    }

    public static void driverwaitexplicit(WebDriver driver, WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

    public static void elementclickwait(WebDriver driver, WebElement element, int timeoutInSeconds) {
        WebDriverWait elementwait = new WebDriverWait(driver, 20);
        try {
            elementwait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (ElementClickInterceptedException e) {
            elementwait.until(ExpectedConditions.elementToBeClickable(element));
        }
    }

    public static void waitforPageload() {
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
    }

    public static void Simplealert(WebElement element) {
        element.click();
        driver.switchTo().alert().accept();
    }

    public void Sendkeyschord(WebElement Element, String var) {
        Element.sendKeys(Keys.chord(Keys.CONTROL, var));
    }

    public void SendkeysEnter(WebElement Element) {
        Element.sendKeys(Keys.chord(Keys.ENTER));
    }

    public static String Randomemail() {
        String Email = RandomStringUtils.randomAlphanumeric(8);
        return "Star" + Email + "@dispostable.com";
    }

    public void Mail(WebElement element) {
        String newemail = Randomemail();
        element.sendKeys(newemail);
    }

    public static String Currentdatetime() {
        LocalDateTime currentdate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String datetime = currentdate.format(formatter);
        return datetime;
    }

    public void StartDatetime(WebElement element) {
        String datetime = Currentdatetime();
        element.sendKeys(datetime);
    }

    public static String Futuredatetime() {
        LocalDateTime currentdate = LocalDateTime.now();
        LocalDateTime futuredate = currentdate.plusDays(5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedfuturedatetime = futuredate.format(formatter);
        return formattedfuturedatetime;

    }

    public void waitforallelements() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void EndDatetime(WebElement element) throws IOException {
        String Enddatetime = Futuredatetime();
        element.sendKeys(Enddatetime);
    }

    public static void Pageup() throws Throwable{
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_END);
        for (int i = 0; i < 5; i++) {
            r.keyPress(KeyEvent.VK_UP);
            r.keyRelease(KeyEvent.VK_UP);
            Thread.sleep(100);
        }

    }

    public static void Pagedown() throws Throwable {
        Robot ro = new Robot();
        ro.keyPress(KeyEvent.VK_DOWN);
        ro.keyRelease(KeyEvent.VK_DOWN);
    }
}
