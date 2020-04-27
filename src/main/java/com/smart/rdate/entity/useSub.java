package com.smart.rdate.entity;

import java.util.Date;

public class useSub {
    private Integer id;

    private String vehSeries;

    private String vin;

    private Date day;

    private String mthWeek;

    private String city;

    private String value;

    private String road;

    private String avgvhlspd;

    private String mileageKm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehSeries() {
        return vehSeries;
    }

    public void setVehSeries(String vehSeries) {
        this.vehSeries = vehSeries == null ? null : vehSeries.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getMthWeek() {
        return mthWeek;
    }

    public void setMthWeek(String mthWeek) {
        this.mthWeek = mthWeek == null ? null : mthWeek.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getAvgvhlspd() {
        return avgvhlspd;
    }

    public void setAvgvhlspd(String avgvhlspd) {
        this.avgvhlspd = avgvhlspd == null ? null : avgvhlspd.trim();
    }

    public String getMileageKm() {
        return mileageKm;
    }

    public void setMileageKm(String mileageKm) {
        this.mileageKm = mileageKm == null ? null : mileageKm.trim();
    }
}