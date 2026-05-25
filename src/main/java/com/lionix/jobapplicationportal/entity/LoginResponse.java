package com.lionix.jobapplicationportal.entity;

import java.time.LocalDateTime;

public class LoginResponse {
    int statusCode;
    String reposeMessage;
    String message;
    LocalDateTime timeStamp;
    String path;

    public LoginResponse() {
    }

    public LoginResponse(int statusCode, String reposeMessage, String message, LocalDateTime timeStamp, String path) {
        this.statusCode = statusCode;
        this.reposeMessage = reposeMessage;
        this.message = message;
        this.timeStamp = timeStamp;
        this.path = path;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getReposeMessage() {
        return reposeMessage;
    }

    public void setReposeMessage(String reposeMessage) {
        this.reposeMessage = reposeMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "statusCode=" + statusCode +
                ", reposeMessage='" + reposeMessage + '\'' +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                ", path='" + path + '\'' +
                '}';
    }
}
