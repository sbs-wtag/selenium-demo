package seleniumtest.exception;

import io.github.bonigarcia.wdm.config.DriverManagerType;

public class BrowserNotSupportedException extends RuntimeException {

  public BrowserNotSupportedException(DriverManagerType type) {
    super(type.name());
  }
}
