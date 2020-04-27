package com.smart.rdate.service;

import com.smart.rdate.entity.useAcc;

import java.util.List;

public interface UseAccService {
    List<useAcc> getAccDate(String vehSeries, String vin, String time);

    List<?> getUseAccAll(String vehSeries);

    List<?> getUseAccAllDay(String vehSeries, String time);

    List<?> getUseAccAllWk(String vehSeries, String time);

    List<?> getUseAccVin(String vin, String vehSeries);

    List<?> getUseAccVinDay(String vin, String time, String vehSeries);

    List<?> getUseAccVinWk(String vin, String time, String vehSeries);
}
