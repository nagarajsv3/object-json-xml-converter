package com.nsv.jsmbaba.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class Student {
    private String id;
    private String name;
    private List<Address> addresses;
    private List<String> subjects;

    public Student() {
    }

    public Student(String id, String name, List<Address> addresses, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                ", subjects=" + subjects +
                '}';
    }
}
