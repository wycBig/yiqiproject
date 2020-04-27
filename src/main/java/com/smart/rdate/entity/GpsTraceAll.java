package com.smart.rdate.entity;

public class GpsTraceAll {
    private Integer id;

    private String lng;

    private String lat;

    private String vehSeries;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getVehSeries() {
        return vehSeries;
    }

    public void setVehSeries(String vehSeries) {
        this.vehSeries = vehSeries == null ? null : vehSeries.trim();
    }

}