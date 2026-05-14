package Year2026.APIAutomationFramework.Services;

import Year2026.APIAutomationFramework.Config.ConfigManager;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DarServices {

    public Response getDAR(String apikey) {
        return given()
                .header("apikey", apikey)
                .queryParam("programid", ConfigManager.getProgramId())
                .when()
                .get("/academicAchievements/dar")
                .then().log().all().statusCode(200).extract().response();
    }
}
