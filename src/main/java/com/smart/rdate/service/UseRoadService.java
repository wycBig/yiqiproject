package com.smart.rdate.service;

import com.smart.rdate.entity.useRoad;

import java.util.List;

public interface UseRoadService {
    List<?> getUseRoadDate(String vehSeries, String vin, String time);

    List<?> getUseRoadAll(String vehSeries);

    List<?> getUseRoadAllDay(String vehSeries, String time);

    List<?> getUseRoadAllWk(String vehSeries, String time);

    List<?> getUseRoadVin(String vin, String vehSeries);

    List<?> getUseRoadVinDay(String vin, String time, String vehSeries);

    List<?> getUseRoadVinWk(String vin, String time, String vehSeries);
}
