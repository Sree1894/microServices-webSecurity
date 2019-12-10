package com.websecurity.models;


import java.util.List;

public class Applications {

    private String applicationId;
    private String applicationName;
    private String applicationCreatedDate;
    private String applicationUpdatedDate;
    private String applicationURL;
    private boolean enabled;
    private String lowVulnerabilities;
    private String mediumVulnerabilities;
    private String highVulnerabilities;
    private List<Scans> applicationScanDetails;


    public Applications() {
    }

    public Applications(String applicationId, String applicationName, String applicationCreatedDate, String applicationUpdatedDate, String applicationURL, boolean enabled, String lowVulnerabilities, String mediumVulnerabilities, String highVulnerabilities, List<Scans> applicationScanDetails) {
        this.applicationId = applicationId;
        this.applicationName = applicationName;
        this.applicationCreatedDate = applicationCreatedDate;
        this.applicationUpdatedDate = applicationUpdatedDate;
        this.applicationURL = applicationURL;
        this.enabled = enabled;
        this.lowVulnerabilities = lowVulnerabilities;
        this.mediumVulnerabilities = mediumVulnerabilities;
        this.highVulnerabilities = highVulnerabilities;
        this.applicationScanDetails = applicationScanDetails;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public Applications setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public Applications setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    public String getApplicationURL() {
        return applicationURL;
    }

    public Applications setApplicationURL(String applicationURL) {
        this.applicationURL = applicationURL;
        return this;
    }

    public String getApplicationCreatedDate() {
        return applicationCreatedDate;
    }

    public Applications setApplicationCreatedDate(String applicationCreatedDate) {
        this.applicationCreatedDate = applicationCreatedDate;
        return this;
    }

    public String getApplicationUpdatedDate() {
        return applicationUpdatedDate;
    }

    public Applications setApplicationUpdatedDate(String applicationUpdatedDate) {
        this.applicationUpdatedDate = applicationUpdatedDate;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Applications setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getLowVulnerabilities() {
        return lowVulnerabilities;
    }

    public Applications setLowVulnerabilities(String lowVulnerabilities) {
        this.lowVulnerabilities = lowVulnerabilities;
        return this;
    }

    public String getMediumVulnerabilities() {
        return mediumVulnerabilities;
    }

    public Applications setMediumVulnerabilities(String mediumVulnerabilities) {
        this.mediumVulnerabilities = mediumVulnerabilities;
        return this;
    }

    public String getHighVulnerabilities() {
        return highVulnerabilities;
    }

    public Applications setHighVulnerabilities(String highVulnerabilities) {
        this.highVulnerabilities = highVulnerabilities;
        return this;
    }


    public List<Scans> getApplicationScanDetails() {
        return applicationScanDetails;
    }

    public Applications setApplicationScanDetails(List<Scans> applicationScanDetails) {
        this.applicationScanDetails = applicationScanDetails;
        return this;
    }

    @Override
    public String toString() {
        return "Applications{" +
                "applicationId='" + applicationId + '\'' +
                ", applicationName='" + applicationName + '\'' +
                ", applicationCreatedDate='" + applicationCreatedDate + '\'' +
                ", applicationUpdatedDate='" + applicationUpdatedDate + '\'' +
                ", applicationURL='" + applicationURL + '\'' +
                ", enabled=" + enabled +
                ", lowVulnerabilities='" + lowVulnerabilities + '\'' +
                ", mediumVulnerabilities='" + mediumVulnerabilities + '\'' +
                ", highVulnerabilities='" + highVulnerabilities + '\'' +
                ", applicationScanDetails=" + applicationScanDetails +
                '}';
    }
}
