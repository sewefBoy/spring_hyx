package com.hyx.spring_hyx.bean;

public class Address {
    private String province;
    private String city;
    private String county;

    public Address() {
    }

    public Address(String province, String city, String county) {
        this.province = province;
        this.city = city;
        this.county = county;
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destory(){
        System.out.println("销毁");
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
