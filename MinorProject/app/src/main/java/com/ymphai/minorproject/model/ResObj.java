package com.ymphai.minorproject.model;

import com.google.gson.annotations.SerializedName;


public class ResObj {
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
