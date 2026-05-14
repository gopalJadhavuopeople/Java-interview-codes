package Year2026.APIAutomationFramework.Models;

public class LoginRequest {
    private String email;
    private String password;
    private String gcaptcha;

    public LoginRequest(String email, String password,String gcaptcha) {
        this.email = email;
        this.password = password;
        this.gcaptcha = null;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGcaptcha() {
        return gcaptcha;
    }
}
