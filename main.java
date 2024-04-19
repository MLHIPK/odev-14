import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://demoqa.com/elements";
        driver.get(url);
        WebElement web = driver.findElement(By.cssSelector("div[class='element-group']>div>ul>li[id='item-3']"));
        web.click();
        WebElement add = driver.findElement(By.cssSelector("button#addNewRecordButton"));
        add.click();
        WebElement firstName = driver.findElement(By.cssSelector("div.col-md-6>input#firstName"));
        firstName.sendKeys("Meliha");
        WebElement lastName = driver.findElement(By.cssSelector("div.col-md-6>input#lastName"));
        lastName.sendKeys("İPEK");
        WebElement userEmail = driver.findElement(By.cssSelector("div.col-sm-12>input#userEmail"));
        userEmail.sendKeys("pekm.3366@gmail.com");
        WebElement age = driver.findElement(By.cssSelector("div.col-sm-12>input#age"));
        age.sendKeys("33");
        WebElement salary = driver.findElement(By.cssSelector("div.col-sm-12>input#salary"));
        salary.sendKeys("40000");

        WebElement department = driver.findElement(By.cssSelector("div.col-md-6>input#department"));
        department.sendKeys("Destek Uzmanı");
        WebElement submit = driver.findElement(By.cssSelector("div>button#submit"));
        submit.click();
        Thread.sleep(500);
        WebElement edit = driver.findElement(By.cssSelector("div.action-buttons>span#edit-record-3"));
        edit.click();
        WebElement userEmailEdit = driver.findElement(By.cssSelector("div.col-sm-12>input#userEmail"));
        userEmailEdit.sendKeys("pekm.3366@gmail.com");
        WebElement salaryEdit = driver.findElement(By.cssSelector("div.col-sm-12>input#salary"));
        salaryEdit.sendKeys("45000");
        WebElement submitClick = driver.findElement(By.cssSelector("div>button#submit"));
        submitClick.click();
        Thread.sleep(100);
        WebElement elementButtons = driver.findElement(By.cssSelector("li#item-4"));
        elementButtons.click();
        WebElement elementButtons2 = driver.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6']>div>:nth-child(4)"));
        elementButtons2.sendKeys(Keys.ENTER);
        WebElement clickText = driver.findElement(By.cssSelector("p#dynamicClickMessage"));
        String message = clickText.getText();
        System.out.println("Görünen Mesaj: " + message);
        driver.quit();
    }
}
