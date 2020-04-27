package com.smart.rdate.entity;

public class UseRoadVin {
    private Integer id;

    private String vehSeries;

    private String road;

    private String vin;

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

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
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