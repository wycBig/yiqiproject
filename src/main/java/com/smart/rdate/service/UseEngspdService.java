package com.smart.rdate.service;

import com.smart.rdate.entity.useEngspd;

import java.util.List;

public interface UseEngspdService {
    List<useEngspd> getuseEngspdDate(String vehSeries, String vin, String time);

    List<?> getUseEngspdAll(String vehSeries);

    List<?> getUseEngspdAllDay(String vehSeries, String time);

    List<?> getUseEngspdAllWk(String vehSeries, String time);

    List<?> getUseEngspdVin(String vin, String vehSeries);

    List<?> getUseEngspdVinDay(String vin, String time, String vehSeries);

    List<?> getUseEngspdVinWk(String vin, String time, String vehSeries);
}
