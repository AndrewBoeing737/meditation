package com.example.meditation;

public class methodConstuctor {
private String method;
private String description;

    public methodConstuctor(String method, String description) {
        this.method = method;
        this.description = description;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
