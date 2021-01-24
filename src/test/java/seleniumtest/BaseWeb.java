package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import seleniumtest.config.Configuration;
import seleniumtest.config.ConfigurationManager;
import seleniumtest.driver.DriverFactory;
import seleniumtest.driver.DriverManager;
public abstract class BaseWeb {

  @BeforeSuite
  public void beforeSuite() {
  }

  @BeforeMethod(alwaysRun = true)
  @Parameters("browser")
  public void preCondition(@Optional("chrome") String browser) {
    Configuration configuration = ConfigurationManager.getConfiguration();

    DriverFactory driverFactory = new DriverFactory();
    WebDriver driver = driverFactory.createInstance(browser);
    DriverManager.setDriver(driver);

    DriverManager.getDriver().get(configuration.url());
  }

  @AfterMethod(alwaysRun = true)
  public void postCondition() {
    DriverManager.quit();
  }
}
