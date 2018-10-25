package com.nsv.jsmbaba.domain;

public enum Source {
    ENTERED_BY_HUMAN("00"),
    AUTOMATED("01"),
    UNKNOWN("02");

    private String sourceValue;

    private Source(String s) {
        this.sourceValue = s;
    }

    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }
}
