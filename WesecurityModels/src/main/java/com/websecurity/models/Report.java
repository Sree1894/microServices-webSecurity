package com.websecurity.models;


public class Report {

   private String  reportId;


    org.bson.Document report;



    public Report() {
    }

    public Report(String  reportId,org.bson.Document report) {
        this.reportId = reportId;

        this.report = report;

    }

}
