package com.nsv.jsmbaba.domain;

public class Rpan {

    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Rpan(String source) {
        this.source = source;
    }

    public Rpan() {
    }

    @Override
    public String toString() {
        return "Rpan{" +
                "source='" + source + '\'' +
                '}';
    }


}
