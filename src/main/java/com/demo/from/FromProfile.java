package com.demo.from;

import java.util.ArrayList;

public class FromProfile {
    private String name;
    private String description;
    private ArrayList<FromRule> rule;

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

    public ArrayList<FromRule> getRule() {
        return rule;
    }

    public void setRule(ArrayList<FromRule> rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "FromProfile{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rule=" + rule +
                '}';
    }
}
