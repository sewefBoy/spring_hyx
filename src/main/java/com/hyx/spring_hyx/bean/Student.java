package com.hyx.spring_hyx.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private String gender;
    private String[] hobby;
    private Address address;
    private List<Address> list;
    private Map<String,String> map;

    public Student() {
    }

    public Student(String id, String name, String gender, String[] hobby, Address address, List<Address> list, Map<String, String> map) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
        this.address = address;
        this.list = list;
        this.map = map;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getList() {
        return list;
    }

    public void setList(List<Address> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", address=" + address +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
