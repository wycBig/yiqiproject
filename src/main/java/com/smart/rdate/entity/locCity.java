package com.smart.rdate.entity;

import java.util.Date;

public class locCity {
    private Integer id;

    private String vehSeries;

    private String vin;

    private Date day;

    private  String mthWeek;

    private String city;

    private String odoWkm;

    private String avgVhlspdKmH;

    @Override
    public String toString() {
        return "locCity{" +
                "id=" + id +
                ", vehSeries='" + vehSeries + '\'' +
                ", vin='" + vin + '\'' +
                ", day=" + day +
                ", mthWeek='" + mthWeek + '\'' +
                ", city='" + city + '\'' +
                ", odoWkm='" + odoWkm + '\'' +
                ", avgVhlspdKmH='" + avgVhlspdKmH + '\'' +
                '}';
    }

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
        this.vehSeries = vehSeries;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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
        this.mthWeek = mthWeek;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOdoWkm() {
        return odoWkm;
    }

    public void setOdoWkm(String odoWkm) {
        this.odoWkm = odoWkm;
    }

    public String getAvgVhlspdKmH() {
        return avgVhlspdKmH;
    }

    public void setAvgVhlspdKmH(String avgVhlspdKmH) {
        this.avgVhlspdKmH = avgVhlspdKmH;
    }
}