package Base;

import Pages.LogInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {

    public static ExcelReader excelReader;
    public static WebDriver driver;
    public static LogInPage logInPage;

    @BeforeClass
    public  void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        excelReader = new ExcelReader("src/test/java/Base/login.xlsx");

    }
}
