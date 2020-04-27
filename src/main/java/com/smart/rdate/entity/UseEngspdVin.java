package com.smart.rdate.entity;

public class UseEngspdVin {
    private Integer id;

    private String vehSeries;

    private String vin;

    private String agrEngspd;

    private String cnt;

    private String avgvhlspdKmH;

    private String idling;

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

    public String getAgrEngspd() {
        return agrEngspd;
    }

    public void setAgrEngspd(String agrEngspd) {
        this.agrEngspd = agrEngspd == null ? null : agrEngspd.trim();
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt == null ? null : cnt.trim();
    }

    public String getAvgvhlspdKmH() {
        return avgvhlspdKmH;
    }

    public void setAvgvhlspdKmH(String avgvhlspdKmH) {
        this.avgvhlspdKmH = avgvhlspdKmH == null ? null : avgvhlspdKmH.trim();
    }

    public String getIdling() {
        return idling;
    }

    public void setIdling(String idling) {
        this.idling = idling == null ? null : idling.trim();
    }
}