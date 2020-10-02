package com.springapp.movie.exception.product;

public class ProductErrorResponse {
    private int status;
    private String message;
    private long timeSpan;

    public ProductErrorResponse() {
    }

    public ProductErrorResponse(int status, String message, long timeSpan) {
        this.status = status;
        this.message = message;
        this.timeSpan = timeSpan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(long timeSpan) {
        this.timeSpan = timeSpan;
    }

    public String getMessage() {
        return message;
    }
}
