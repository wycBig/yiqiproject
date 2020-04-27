package com.smart.rdate.entity;

public class UseTrptmVinWk {
    private Integer id;

    private String vehSeries;

    private String vin;

    private String mthWk;

    private String wkValue;

    private String hr;

    private String value;

    private String avgtrptimeMin;

    private String avgtrpodoKm;

    private String avgMaxvhlspdKmH;

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

    public String getMthWk() {
        return mthWk;
    }

    public void setMthWk(String mthWk) {
        this.mthWk = mthWk == null ? null : mthWk.trim();
    }

    public String getWkValue() {
        return wkValue;
    }

    public void setWkValue(String wkValue) {
        this.wkValue = wkValue == null ? null : wkValue.trim();
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr == null ? null : hr.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }
}