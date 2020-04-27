package com.smart.rdate.entity;

public class GpsLoctionAll {
    private Integer id;

    private String vehSeries;

    private String lng;

    private String lat;

    private String wkValue;

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

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getWkValue() {
        return wkValue;
    }

    public void setWkValue(String wkValue) {
        this.wkValue = wkValue == null ? null : wkValue.trim();
    }
}