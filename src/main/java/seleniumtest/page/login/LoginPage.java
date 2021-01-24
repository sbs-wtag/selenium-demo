package seleniumtest.page.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumtest.page.AbstractPageObject;

public class LoginPage extends AbstractPageObject {

  @FindBy(id = "email")
  private WebElement email;

  @FindBy(id = "password")
  private WebElement password;

  @FindBy(xpath = "/html/body/div/div/div/div/div/div/div[3]/div/form/div[4]/div/button")
  private WebElement login;

  public void fillEmail(String value) {
    email.sendKeys(value);
  }

  public void fillPassword(String value) {
    password.sendKeys(value);
  }

  public void pressLogin() {
    login.click();
  }
}
