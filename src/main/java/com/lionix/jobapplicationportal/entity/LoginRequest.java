package com.lionix.jobapplicationportal.entity;

public class LoginRequest {
    String empId;
    String password;

    public LoginRequest() {
    }

    public LoginRequest(String empId, String password) {
        this.empId = empId;
        this.password = password;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "empId='" + empId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
