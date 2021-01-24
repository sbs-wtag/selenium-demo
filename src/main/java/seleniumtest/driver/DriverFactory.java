package seleniumtest.driver;

import org.openqa.selenium.WebDriver;
import seleniumtest.config.Configuration;
import seleniumtest.config.ConfigurationManager;
import seleniumtest.driver.local.LocalDriverManager;

public class DriverFactory implements IDriver {

  @Override
  public WebDriver createInstance(String browser) {
    final Configuration configuration = ConfigurationManager.getConfiguration();
    return new LocalDriverManager().createInstance(configuration.browser());
  }
}
