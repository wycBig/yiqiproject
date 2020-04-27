package com.smart.rdate.service;

import com.smart.rdate.entity.locLocation;

import java.util.List;

public interface LocLocationService {
    List<locLocation> getlocLocationData(String vehSeries, String vin, String time);

    List<locLocation> getGpsLocAll(String vehSeries);

    List<?> getAllDay(String vehSeries, String time);

    List<?> getAllWk(String vehSeries, String time);

    List<?> getVin(String vin,String s);

    List<?> getVinDay(String vin, String time,String s);

    List<?> getVinWk( String vin, String time,String s);
}
