package testNGData;


import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.testutil.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @DataProvider
    public Object[][] getLoginData() {
        Object[][] data = TestUtil.getTestData("login");
        return data;
    }

    @Test(dataProvider = "getLoginData")
    public void loginTest(String username, String password) {

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys((password));
        driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
