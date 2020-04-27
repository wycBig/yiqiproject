package com.smart.rdate.service;

import com.smart.rdate.entity.*;

import java.util.List;

public interface UseBeamService {
    List<useBeam> getUseBeamDate(String vehSeries, String vin, String time);

    List<UseBeamAll> getUseBeamAll(String vehSeries);

    List<UseBeamAllDay> getUseBeamAllDay(String vehSeries, String time);

    List<UseBeamAllWk> getUseBeamAllWk(String vehSeries, String time);

    List<UseBeamVin> getUseBeamVin(String vin, String vehSeries);

    List<UseBeamVinDay> getUseBeamVinDay(String vin, String time, String vehSeries);

    List<UseBeamVinWk> getUseBeamVinWk(String vin, String time, String vehSeries);
}
