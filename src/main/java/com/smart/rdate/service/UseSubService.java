package com.smart.rdate.service;

import com.smart.rdate.entity.useSub;

import java.util.List;

public interface UseSubService {
    List<useSub> getUseSubDate(String vehSeries, String vin, String time);

    List<?> getUseRoadAll(String vehSeries);

    List<?> getUseRoadAllDay(String vehSeries, String time);

    List<?> getUseRoadAllWk(String vehSeries, String time);
}
