package com.smart.rdate.service;

import com.smart.rdate.entity.useTrptm;

import java.util.Date;
import java.util.List;

public interface UseTrptmService {
    List<useTrptm> getUseTrptmDate(String vehSeries, String vin, String time);

    List<useTrptm> get();

    List<?> getUseBeamAll(String vehSeries);

    List<?> getUseBeamAllDay(String vehSeries, String time);

    List<?> getUseBeamAllWk(String vehSeries, String time);

    List<?> getUseBeamVin(String vin, String vehSeries);

    List<?> getUseBeamVinDay(String vin, String time, String vehSeries);

    List<?> getUseBeamVinWk(String vin, String time, String vehSeries);
}
