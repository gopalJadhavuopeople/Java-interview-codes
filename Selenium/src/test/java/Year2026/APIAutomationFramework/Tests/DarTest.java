package Year2026.APIAutomationFramework.Tests;

import Year2026.APIAutomationFramework.Base.BaseTest;
import Year2026.APIAutomationFramework.Services.AuthServices;
import Year2026.APIAutomationFramework.Services.DarServices;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DarTest extends BaseTest {
    private String apiKey;
    private DarServices darServices;

    @BeforeClass
    public void setUpTest() {
        AuthServices authService = new AuthServices();
        darServices = new DarServices();
        apiKey = authService.login();

        Assert.assertNotNull(apiKey, "Login failed - apiKey is null. Check AuthServices.login() output/logs.");
        System.out.println("Using API key prefix: " + (apiKey.length() > 10 ? apiKey.substring(0, 10) + "..." : apiKey));
    }

    @Test
    public void validateIsAuditPassed() {
        Response response = darServices.getDAR(apiKey);

        // Basic response validation
        Assert.assertNotNull(response, "DAR response is null");

        String rawBody = "";
        if (response.getBody() != null) {
            rawBody = response.getBody().asString();
        }

        Assert.assertEquals(response.getStatusCode(), 200,
                "Unexpected status code from DAR endpoint. Response body: " + rawBody);

        // Use wrapper Boolean to avoid NullPointerException when the field is missing
        Boolean isAuditPassed = null;
        try {
            isAuditPassed = response.jsonPath().getBoolean("isAuditPassed");
        } catch (Exception e) {
            // include body in message for easier debugging
            Assert.fail("Failed to read isAuditPassed from response. Error: " + e.getMessage() + " Response body: " + rawBody);
        }

        Assert.assertNotNull(isAuditPassed,
                "isAuditPassed field missing. Response body: " + rawBody);

        // Use Boolean.TRUE.equals to avoid NPE and include response body on failure
        Assert.assertTrue(Boolean.TRUE.equals(isAuditPassed),
                "Audit did not pass. isAuditPassed=" + isAuditPassed + ". Response body: " + rawBody);
    }
}
