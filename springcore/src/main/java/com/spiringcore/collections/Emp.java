package com.spiringcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set <String> adresses;
    private Map<String ,String> courses;

    private Properties  props;


    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAdresses() {
        return adresses;
    }

    public void setAdressess(Set<String> adresses) {
        this.adresses = adresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp(){
        super();
    }

    public Emp(String name, List<String> phones, Set<String> adresses, Map<String, String> courses, Properties props) {
        super();
        this.name = name;
        this.phones = phones;
        this.adresses = adresses;
        this.courses = courses;
        this.props = props;
    }
}
