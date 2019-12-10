package com.websecurity.models;


import org.bson.Document;

public class Scans {

    private String scanName;
    private String status;
    private String createdDate;
    private String updatedDate;
    private String nextSchedule;
    private org.bson.Document report;

    public Scans() {
    }

    public Scans(String scanName, String status, String createddate, String updatedDate, String nextSchedule) {
        this.scanName = scanName;
        this.status = status;
        this.createdDate = createddate;
        this.updatedDate = updatedDate;
        this.nextSchedule = nextSchedule;
    }

    public String getScanName() {
        return scanName;
    }

    public Scans setScanName(String scanName) {
        this.scanName = scanName;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Scans setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCreateddate() {
        return createdDate;
    }

    public Scans setCreateddate(String createddate) {
        this.createdDate = createddate;
        return this;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public Scans setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public String getNextSchedule() {
        return nextSchedule;
    }

    public Scans setNextSchedule(String nextSchedule) {
        this.nextSchedule = nextSchedule;
        return this;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public Scans setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public Document getReport() {
        return report;
    }

    public Scans setReport(Document report) {
        this.report = report;
        return this;
    }
}
