package seleniumtest.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.aeonbits.owner.ConfigCache;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfigurationManager {

  public static Configuration getConfiguration() {
    return ConfigCache.getOrCreate(Configuration.class);
  }
}
