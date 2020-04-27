package com.smart.rdate.entity;

import java.util.Date;

public class useBeam {
    private Integer id;

    private String vehSeries;

    private String vin;

    private Date day;

    private String mthWeek;

    private String hibeam;

    private String lowbeam;

    private String top;

    private String road;

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

    public String getHibeam() {
        return hibeam;
    }

    public void setHibeam(String hibeam) {
        this.hibeam = hibeam == null ? null : hibeam.trim();
    }

    public String getLowbeam() {
        return lowbeam;
    }

    public void setLowbeam(String lowbeam) {
        this.lowbeam = lowbeam == null ? null : lowbeam.trim();
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top == null ? null : top.trim();
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }
}