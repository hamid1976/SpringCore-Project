package com.spiringcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String>friends;
    private Map<String,Integer>feestucture;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, Integer> getFeestucture() {
        return feestucture;
    }

    public void setFeestucture(Map<String, Integer> feestucture) {
        this.feestucture = feestucture;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feestucture=" + feestucture +
                ", properties=" + properties +
                '}';
    }
}
