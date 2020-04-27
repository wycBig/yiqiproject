package com.smart.rdate.service;

import com.smart.rdate.entity.GpsCityAll;
import com.smart.rdate.entity.GpsCityAllDay;
import com.smart.rdate.entity.GpsCityAllWk;
import com.smart.rdate.entity.locCity;

import java.util.List;

public interface LocCityService {
    List<locCity> getLocCityData(String vehSeries, String vin, String time);

    List<GpsCityAll> getGpsCityAll(String vehSeries);

    List<GpsCityAllDay> getGpsCityAllDay(String vehSeries, String time);

    List<GpsCityAllWk> getGpsCityAllWk(String vehSeries, String time);
}
