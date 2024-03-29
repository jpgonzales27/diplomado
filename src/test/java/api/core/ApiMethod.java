package api.core;

public enum ApiMethod {
    GET("GET"),
    POST("POST"),
    DELETE("DELETE"),
    PUT("PUT");

    private final String name;

    ApiMethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
