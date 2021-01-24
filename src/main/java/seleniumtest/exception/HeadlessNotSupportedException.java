package seleniumtest.exception;

import io.github.bonigarcia.wdm.config.DriverManagerType;

public class HeadlessNotSupportedException extends RuntimeException {

  public HeadlessNotSupportedException(DriverManagerType type) {
    super(type.name());
  }
}
