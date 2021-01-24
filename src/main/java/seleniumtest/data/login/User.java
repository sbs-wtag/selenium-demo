package seleniumtest.data.login;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

  private final String email;
  private final String password;
}
