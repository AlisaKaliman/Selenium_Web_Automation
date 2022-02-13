import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\QA automation\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        String URL="https://www.techlistic.com/p/selenium-practice-form.html";

        driver.get(URL);

        driver.manage().window().maximize();

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Alisa");
        Thread.sleep(1000);

        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Kali");
        Thread.sleep(1000);

        WebElement acceptCookies= driver.findElement(By.cssSelector("[id=\"ez-accept-all\"]"));
        acceptCookies.click();
        Thread.sleep(3000);

        WebElement cookies= driver.findElement(By.cssSelector("[id=\"cookieChoiceDismiss\"]"));
        cookies.click();
        Thread.sleep(1000);

        WebElement gender= driver.findElement(By.cssSelector("#sex-1"));
        gender.click();
        Thread.sleep(1000);

        WebElement yearsOfExperience= driver.findElement(By.cssSelector("#exp-3"));
        yearsOfExperience.click();
        Thread.sleep(1000);

        WebElement date= driver.findElement(By.cssSelector("#datepicker"));
        date.sendKeys("13.02.2022");
        Thread.sleep(1000);

        WebElement profession= driver.findElement(By.cssSelector("#profession-1"));
        profession.click();
        Thread.sleep(1000);

        WebElement automationTools1= driver.findElement(By.cssSelector("[value=\"Selenium Webdriver\"]"));
        automationTools1.click();
        WebElement automationTools2= driver.findElement(By.cssSelector("[value=\"QTP\"]"));
        automationTools2.click();
        Thread.sleep(1000);

        WebElement continents= driver.findElement(By.cssSelector("#continents"));
        continents.click();
        driver.findElement(By.xpath("//option[. = \"South America\"]")).click();
        //Pokusaj da se drop-down odradi preko Selecta
        //Select continent= new Select(driver.findElement(By.cssSelector("#continents")));
        //continent.selectByVisibleText("South America");

        driver.findElement(By.xpath("//option[.=\"Wait Commands\"]")).click();

        //driver.findElement(By.cssSelector("#photo")).click();

        //WebElement link= driver.findElement(By.xpath("//a[.=\"Click here to Download File\"]"));
        //link.click();

        driver.findElement(By.cssSelector("#submit")).click();

        driver.quit();

        System.out.println("Test is passed");




    }
}
