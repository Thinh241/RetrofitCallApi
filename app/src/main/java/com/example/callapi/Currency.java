package com.example.callapi;

public class Currency {
    private Boolean success;
    private String terms;
    private String privacy;
    private Float timestamp;
    private String source;
    private Entry quotes;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Float timestamp) {
        this.timestamp = timestamp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Entry getQuotes() {
        return quotes;
    }

    public void setQuotes(Entry quotes) {
        this.quotes = quotes;
    }
}
