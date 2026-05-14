package Year2026.APIAutomationFramework.Config;

public class ConfigManager {

    public static String getBaseURI() {
        return System.getProperty("API_BASE_URI",
                "https://academic-achievement-test.uopeople.edu");
    }

    public static String getLoginURI() {
        return System.getProperty("API_LOGIN_URI",
                "https://your-api-login-staging.uopeople.edu");
    }

    public static String getEmail() {
        return "testvk126@test.com";
    }

    public static String getPassword() {
        return "Test@1234";
    }
    public static String getGcaptcha() {
        return null;
    }

    public static String getProgramId() {
        return "95216b6a-93df-e511-80ef-3863bb348818";
    }
}
