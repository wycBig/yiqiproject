package com.smart.rdate.entity;

public class GpsCityAllWk {
    private Integer id;

    private String vehSeries;

    private String city;

    private String mthWk;

    private String odoWkm;

    private String avgVhlspdKmH;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getMthWk() {
        return mthWk;
    }

    public void setMthWk(String mthWk) {
        this.mthWk = mthWk == null ? null : mthWk.trim();
    }

    public String getOdoWkm() {
        return odoWkm;
    }

    public void setOdoWkm(String odoWkm) {
        this.odoWkm = odoWkm == null ? null : odoWkm.trim();
    }

    public String getAvgVhlspdKmH() {
        return avgVhlspdKmH;
    }

    public void setAvgVhlspdKmH(String avgVhlspdKmH) {
        this.avgVhlspdKmH = avgVhlspdKmH == null ? null : avgVhlspdKmH.trim();
    }
}