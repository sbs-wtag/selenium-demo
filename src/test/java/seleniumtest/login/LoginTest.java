package seleniumtest.login;

import org.testng.annotations.Test;
import seleniumtest.BaseWeb;
import seleniumtest.data.login.User;
import seleniumtest.page.login.LoginPage;
import seleniumtest.page.workspace.WorkspacePage;

public class LoginTest extends BaseWeb {

  @Test
  public void login() {
    User user = User.builder()
        .email("demo@aiaibot.com")
        .password("demo@aiaibot.com")
        .build();

    LoginPage loginPage = new LoginPage();
    loginPage.fillEmail(user.getEmail());
    loginPage.fillPassword(user.getPassword());
    loginPage.pressLogin();

    WorkspacePage workspacePage = new WorkspacePage();
    workspacePage.avatarIsDisplayed();
  }
}
