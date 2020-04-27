package com.smart.rdate.entity;

import java.util.Date;

public class useRoad {
    private Integer id;

    private String vehSeries;

    private String vin;

    private Date day;

    private String mthWeek;

    private String road;

    private String value;

    private String avgvhlspdKmH;

    private String mileageWkm;

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

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getAvgvhlspdKmH() {
        return avgvhlspdKmH;
    }

    public void setAvgvhlspdKmH(String avgvhlspdKmH) {
        this.avgvhlspdKmH = avgvhlspdKmH == null ? null : avgvhlspdKmH.trim();
    }


    public String getMileageWkm() {
        return mileageWkm;
    }

    public void setMileageWkm(String mileageWkm) {
        this.mileageWkm = mileageWkm == null ? null : mileageWkm.trim();
    }
}