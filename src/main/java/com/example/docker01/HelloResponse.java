package com.example.docker01;

public class HelloResponse {
    private String message;
    private String url;

    public HelloResponse() {
    }

    public HelloResponse(String message, String url) {
        this.message = message;
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
