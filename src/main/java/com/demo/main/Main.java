package com.demo.main;

import com.demo.from.FromProfile;
import com.demo.from.FromRule;
import com.demo.mapper.ProfileMapper;
import com.demo.to.ToProfile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Main {

    static void writeValueAsString(Object object) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            System.out.println(objectMapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    static FromProfile getDefaultFromProfile() {
        FromRule rule01 = new FromRule("rule01");
        FromRule rule02 = new FromRule("rule02");
        ArrayList ruleList = new ArrayList<FromRule>();
        ruleList.add(rule01);
        ruleList.add(rule02);

        FromProfile fromProfile = new FromProfile();
        fromProfile.setName("FromProfile");
        fromProfile.setDescription("FromProfileDescription");
        fromProfile.setRule(ruleList);
        return fromProfile;
    }

    public static void main(String[] args) {

        FromProfile fromProfile = Main.getDefaultFromProfile();
        Main.writeValueAsString(fromProfile);

        ToProfile toProfile = ProfileMapper.MAPPER.toToProfile(fromProfile);
        Main.writeValueAsString(toProfile);
    }
}
