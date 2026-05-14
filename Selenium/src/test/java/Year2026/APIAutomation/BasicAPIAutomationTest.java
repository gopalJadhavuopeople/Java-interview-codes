package Year2026.APIAutomation;

import org.junit.Test;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class BasicAPIAutomationTest {

    @Test
    public void getMethod() {
        // Read API key from environment variable first, then system property, then fallback to the previous value
        String apiKey = System.getenv("REQRES_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            apiKey = System.getProperty("reqres.api.key", "reqres_6d9283abfd2d44ed8a9817900d49548f");
            System.out.println("Warning: using fallback API key. Set REQRES_API_KEY env var or -Dreqres.api.key to override.");
        }

        String response = given()
                .baseUri("https://reqres.in/api/users")
                .header("x-api-key", apiKey)
                .when()
                .get()
                .then().log().all()
                .statusCode(200).extract().asString();

        // Basic sanity check
        Assert.assertNotNull("Response should not be null", response);
        Assert.assertFalse( response.trim().isEmpty());
    }
}
