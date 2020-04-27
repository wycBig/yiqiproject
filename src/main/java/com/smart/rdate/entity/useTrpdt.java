package com.smart.rdate.entity;

import java.util.Date;

public class useTrpdt {
    private Integer id;

    private String vehSeries;

    private String vin;

    private String mthWeek;

    private Date date;

    private Integer value;

    private String avgtrptimeMin;

    private String avgtrpodoKm;

    private String avgMaxvhlspdKmH;

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

    public String getMthWeek() {
        return mthWeek;
    }

    public void setMthWeek(String mthWeek) {
        this.mthWeek = mthWeek == null ? null : mthWeek.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getAvgtrptimeMin() {
        return avgtrptimeMin;
    }

    public void setAvgtrptimeMin(String avgtrptimeMin) {
        this.avgtrptimeMin = avgtrptimeMin == null ? null : avgtrptimeMin.trim();
    }

    public String getAvgtrpodoKm() {
        return avgtrpodoKm;
    }

    public void setAvgtrpodoKm(String avgtrpodoKm) {
        this.avgtrpodoKm = avgtrpodoKm == null ? null : avgtrpodoKm.trim();
    }

    public String getAvgMaxvhlspdKmH() {
        return avgMaxvhlspdKmH;
    }

    public void setAvgMaxvhlspdKmH(String avgMaxvhlspdKmH) {
        this.avgMaxvhlspdKmH = avgMaxvhlspdKmH == null ? null : avgMaxvhlspdKmH.trim();
    }
}