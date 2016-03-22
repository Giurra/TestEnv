import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by urke on 13-Mar-16.
 */
public class TestEnv {
    public WebDriver driver;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver = new HtmlUnitDriver();
        driver = new FirefoxDriver();
        //driver = new PhantomJSDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testEnv() {
        driver.get("http://giurra.org/roadtoqa/");
        Assert.assertEquals("RoadToQA – Just another WordPress site ", driver.getTitle());
        System.out.println("All OK: " + driver.getTitle());
    }
}
