package com.websecurity.models;

public class ApiResponse {


    private Boolean success;
    private String message;
    private Object responseObject;

    public ApiResponse( Boolean success, String message, Object responseObject) {

        this.success = success;
        this.message = message;
        this.responseObject = responseObject;
    }



    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Object responseObject) {
        this.responseObject = responseObject;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                ", success=" + success +
                ", message='" + message + '\'' +
                ", responseObject=" + responseObject +
                '}';
    }
}
