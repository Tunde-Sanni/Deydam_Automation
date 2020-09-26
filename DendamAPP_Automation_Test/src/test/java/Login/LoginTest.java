package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

class LoginTests {
    //import selenium webDriver
    private WebDriver driver;
    //import ChromeDriver

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //input project URL = dendam signin URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        //waiting for globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //maximize the window
        driver.manage().window().maximize();

        //get project title
        System.out.println(driver.getTitle());

        //Locate username fields
        driver.findElement(By.name("username")).sendKeys("shile");

        //locate password fields
        driver.findElement(By.name("password")).sendKeys("SEXXY007");

        // Click on the login button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();

        Thread.sleep(3000);

        //close the Browser after test
        driver.quit();
    }

    //initiate the test run command

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();


    }


}





