package com.smart.rdate.entity;

import java.util.Date;

public class UseAccAllWk {
    private Integer id;

    private String vehSeries;

    private String mthWk;

    private String acc;

    private String value;

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
        this.mthWk = mthWk;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc == null ? null : acc.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}