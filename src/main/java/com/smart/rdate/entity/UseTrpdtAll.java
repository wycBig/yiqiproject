package com.smart.rdate.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UseTrpdtAll {
    private Integer id;

    private String vehSeries;

    private String mthWk;

    private String date;

    private String day;

    private String value;

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

    public String getMthWk() {
        return mthWk;
    }

    public void setMthWk(String mthWk) {
        this.mthWk = mthWk == null ? null : mthWk.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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