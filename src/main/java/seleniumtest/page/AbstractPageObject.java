package seleniumtest.page;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import seleniumtest.config.Configuration;
import seleniumtest.config.ConfigurationManager;
import seleniumtest.driver.DriverManager;

public abstract class AbstractPageObject {

  protected AbstractPageObject() {
    final Configuration configuration = ConfigurationManager.getConfiguration();
    final AjaxElementLocatorFactory ajaxElementLocatorFactory =
        new AjaxElementLocatorFactory(DriverManager.getDriver(), configuration.timeout());
    PageFactory.initElements(ajaxElementLocatorFactory, this);
  }
}
