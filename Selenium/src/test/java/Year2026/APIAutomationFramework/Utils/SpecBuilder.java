package Year2026.APIAutomationFramework.Utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpecBuilder {

    public static RequestSpecification getRequestSpec(String apiKey) {

        return new RequestSpecBuilder()
                .addHeader("apikey", apiKey)
                .setContentType(ContentType.JSON)
                .build();
    }
}
