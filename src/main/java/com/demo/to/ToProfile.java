package com.demo.to;

import java.util.ArrayList;

public class ToProfile {
    private String name;
    private String description;
    private ArrayList<ToRule> rule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<ToRule> getRule() {
        return rule;
    }

    public void setRule(ArrayList<ToRule> rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "ToProfile{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rule=" + rule +
                '}';
    }
}
