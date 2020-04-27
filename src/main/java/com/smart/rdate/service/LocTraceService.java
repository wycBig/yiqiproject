package com.smart.rdate.service;

import com.smart.rdate.entity.*;

import java.util.List;

public interface LocTraceService {
    List<locTrace> getTraceData(String vehSeries, String vin, String time);

    List<GpsTraceAll> getGpsTraceAll(String vehSeries);

    List<GpsTraceAllDay> getGpsTraceAllDay(String vehSeries, String time);

    List<GpsTraceAllWk> getGpsTraceAllWk(String vehSeries, String time);

    List<GpsTraceVin> getGpsTraceVin(String vin, String vehSeries);

    List<GpsTraceVinDay> getGpsTraceVinDay(String vin, String time, String vehSeries);

    List<GpsTraceVinWk> getGpsTraceVinWk(String vin, String time, String vehSeries);
}
