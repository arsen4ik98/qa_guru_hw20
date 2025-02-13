package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:remote.properties"
})
public interface WebDriverConfig extends Config{
    @Key("baseUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getBaseUrl();

    @Key("user")
    @DefaultValue("bsuser_l0AOgt")
    String getUser();

    @Key("password")
    @DefaultValue("bGUiUj1HLxF5cFKoR86U")
    String getPassword();

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("device")
    @DefaultValue("Google Pixel 6 Pro")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("13.0")
    String getOsVersion();
}