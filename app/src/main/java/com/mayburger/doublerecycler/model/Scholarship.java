package com.mayburger.doublerecycler.model;

import java.io.Serializable;

/**
 * Created by Mayburger on 11/20/18.
 */

public class Scholarship implements Serializable{

    private String name;
    private String deadline;
    private String degree;
    private String location;

    public Scholarship(String name, String deadline, String degree, String location) {
        this.name = name;
        this.deadline = deadline;
        this.degree = degree;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
