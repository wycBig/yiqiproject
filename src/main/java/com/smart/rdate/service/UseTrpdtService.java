package com.smart.rdate.service;

import com.smart.rdate.entity.useTrpdt;

import java.util.List;

public interface UseTrpdtService {
    List<useTrpdt> getUseTrpdtDate(String vehSeries, String vin, String time);

    List<?> getUseTrpdtAll( String vehSeries,String time);

    List<?> getUseTrpdtVin( String vehSeries, String time,String vin);
}
