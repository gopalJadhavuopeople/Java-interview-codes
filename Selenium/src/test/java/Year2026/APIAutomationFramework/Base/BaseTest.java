package Year2026.APIAutomationFramework.Base;

import Year2026.APIAutomationFramework.Config.ConfigManager;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void setUpSuite() {
        System.out.println("Setting up test suite...");
        RestAssured.baseURI = ConfigManager.getBaseURI();
    }
}
