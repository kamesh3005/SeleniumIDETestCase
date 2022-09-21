// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestCase2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testCase1() {
    driver.get("http://automationpractice.com/index.php");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("kameshkam3094@gmail.com");
    driver.findElement(By.id("passwd")).click();
    driver.findElement(By.id("passwd")).sendKeys("Kamesh@30");
    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    driver.findElement(By.cssSelector(".lnk_wishlist span")).click();
    driver.findElement(By.cssSelector("li:nth-child(1) > .btn > span")).click();
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(3) .button:nth-child(1) > span")).click();
    driver.findElement(By.cssSelector(".fancybox-item")).click();
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(3) .button:nth-child(2) > span")).click();
    driver.findElement(By.cssSelector(".icon-plus")).click();
    driver.findElement(By.id("group_1")).click();
    {
      WebElement dropdown = driver.findElement(By.id("group_1"));
      dropdown.findElement(By.xpath("//option[. = 'M']")).click();
    }
    driver.findElement(By.id("color_13")).click();
    driver.findElement(By.cssSelector(".exclusive > span")).click();
    driver.findElement(By.cssSelector(".button-medium > span")).click();
  }
}
