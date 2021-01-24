package seleniumtest.page.workspace;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seleniumtest.page.AbstractPageObject;

public class WorkspacePage extends AbstractPageObject {

  @FindBy(xpath = "//*[@id=\"__layout\"]/main/header/div[3]/div[2]/div[1]/button/div")
  private WebElement userAvatar;

  public void avatarIsDisplayed() {
    userAvatar.isDisplayed();
  }
}
