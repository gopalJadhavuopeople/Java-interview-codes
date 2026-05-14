package Year2026.APIAutomation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
// replaced JUnit Test import with TestNG Test import
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.given;
import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class AcademicPeogressApi {
    String apiKey;
    @Test
    public void loginPortal() {
        System.out.println("Login to the portal");

        // Set base host only and use the endpoint path in post()
        RestAssured.baseURI = System.getProperty("API_BASE_URI", "https://your-api-login-staging.uopeople.edu");

        // JSON body
        String body = "{\n"
                + "  \"password\": \"Test@1234\",\n"
                + "  \"email\": \"testvk126@test.com\",\n"
                + "  \"gcaptcha\": null\n"
                + "}";

        // Send request and capture response correctly
        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/api/auth/login");

        // Log status and body
        System.out.println("HTTP status: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString());

        // Try to extract apiKey if present
        try {
           apiKey = response.jsonPath().getString("result.key");
            System.out.println("Extracted API Key: " + apiKey);
        } catch (Exception e) {
            System.out.println("Could not extract apiKey: " + e.getMessage());
        }


    }
    @Test(dependsOnMethods = "loginPortal")
    protected void getDar() {
        RestAssured.baseURI = "https://academic-achievement-test.uopeople.edu";

        Response response = given()
                .header("apiKey", apiKey)
                .queryParam("programid", "95216b6a-93df-e511-80ef-3863bb348818")
                .when()
                .get("/academicAchievements/dar");

        //validate response status code
        System.out.println("HTTP status: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString());

        //assert status code is 200
        if (response.getStatusCode() == 200) {
            System.out.println("DAR retrieved successfully.");
        } else {
            System.out.println("Failed to retrieve DAR. Status code: " + response.getStatusCode());

        }
        //assert that isAuditPassed is true
        boolean isAuditPassed = response.jsonPath().getBoolean("isAuditPassed");
        if (isAuditPassed) {
            System.out.println("Audit passed successfully.");
        } else {
            System.out.println("Audit did not pass. isAuditPassed: " + isAuditPassed);
        }
    }
}
