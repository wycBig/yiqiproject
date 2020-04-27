package com.smart.rdate.service;

import com.smart.rdate.entity.locHeat;

import java.util.List;

public interface LocHeatService {

    List<?> getGpsHeatAll(String vehSeries);

    List<?> getGpsHeatAllDay(String vehSeries, String time);

    List<?> getGpsHeatAllWk(String vehSeries, String time);

    List<?> getGpsHeatVin(String vin, String vehSeries);

    List<?> getGpsHeatVinDay(String vin, String time, String vehSeries);

    List<?> getGpsHeatVinWk(String vin, String time, String vehSeries);
}
