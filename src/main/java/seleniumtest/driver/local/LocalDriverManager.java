package seleniumtest.driver.local;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import seleniumtest.config.ConfigurationManager;
import seleniumtest.driver.IDriver;
import seleniumtest.exception.BrowserNotSupportedException;
import seleniumtest.exception.HeadlessNotSupportedException;

public class LocalDriverManager implements IDriver {

  @Override
  public WebDriver createInstance(String browser) {
    final DriverManagerType driverManagerType = DriverManagerType.valueOf(browser.toUpperCase());
    final boolean isHeadless = ConfigurationManager.getConfiguration().headless();
    WebDriverManager.getInstance(driverManagerType).setup();
    switch (driverManagerType) {
      case CHROME:
        return isHeadless ? new ChromeDriver(new ChromeOptions().setHeadless(true)) : new ChromeDriver();
      case FIREFOX:
        return isHeadless ? new FirefoxDriver(new FirefoxOptions().setHeadless(true)) : new FirefoxDriver();
      case SAFARI:
        if (isHeadless) throw new HeadlessNotSupportedException(driverManagerType);
        return new SafariDriver();
      default:
        throw new BrowserNotSupportedException(driverManagerType);
    }
  }
}
