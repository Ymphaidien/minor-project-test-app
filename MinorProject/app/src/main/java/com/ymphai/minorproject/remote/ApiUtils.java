package com.ymphai.minorproject.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://10.0.2.2:8000/api/v1/";

    public static UserService getUserService() {
        return Client.getClient(BASE_URL).create(UserService.class);
    }
}
