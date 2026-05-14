package Year2026.APIAutomationFramework.Services;

import Year2026.APIAutomationFramework.Config.ConfigManager;
import Year2026.APIAutomationFramework.Models.LoginRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthServices {

    public String login() {

        LoginRequest loginRequest =
                new LoginRequest(ConfigManager.getEmail(),
                        ConfigManager.getPassword(),ConfigManager.getGcaptcha());

        // Use the login-specific base URI for the auth call
        Response response = given()
                .baseUri(ConfigManager.getLoginURI())
                .contentType(ContentType.JSON)
                .body(loginRequest)
                .when()
                .post("/api/auth/login");

        // Log and handle non-200 gracefully
        if (response == null) {
            System.out.println("AuthServices.login: response is null");
            return null;
        }
        System.out.println("AuthServices.login: status=" + response.getStatusCode());
        System.out.println("AuthServices.login: body=" + response.getBody().asString());

        if (response.getStatusCode() != 200) {
            System.out.println("AuthServices.login failed: unexpected status code " + response.getStatusCode());
            return null;
        }

        return response.jsonPath().getString("result.key");
    }
}
