package helpers;

import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;


public class Browserstack {
    private static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class);


    public static String videoUrl(String sessionId) {
        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(config.getUser(), config.getPassword())
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}