package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.locHeat;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.LocHeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocHeatImp implements LocHeatService {

    @Autowired
    private locHeatMapper lHeatMapper;

    @Autowired
    private GpsHeatAllMapper gpsHeatAllMapper;
    @Autowired
    private GpsHeatAllDayMapper gpsHeatAllDayMapper;
    @Autowired
    private GpsHeatAllWkMapper gpsHeatAllWkMapper;
    @Autowired
    private GpsHeatVinMapper gpsHeatVinMapper;
    @Autowired
    private  GpsHeatVinDayMapper gpsHeatVinDayMapper;
    @Autowired
    private GpsHeatVinWkMapper gpsHeatVinWkMapper;


    @Override
    public List<?> getGpsHeatAll(String vehSeries) {
        return gpsHeatAllMapper.getGpsHeatAll(vehSeries);
    }

    @Override
    public List<?> getGpsHeatAllDay(String vehSeries, String time) {
        return gpsHeatAllDayMapper.getGpsHeatAllDay(vehSeries,time);
    }

    @Override
    public List<?> getGpsHeatAllWk(String vehSeries, String time) {
        return gpsHeatAllWkMapper.getGpsHeatAllWk(vehSeries,time);
    }

    @Override
    public List<?> getGpsHeatVin(String vin, String vehSeries) {
        return gpsHeatVinMapper.getGpsHeatVin(vehSeries,vin);
    }

    @Override
    public List<?> getGpsHeatVinDay(String vin, String time, String vehSeries) {
        return gpsHeatVinDayMapper.getGpsHeatVinDay(vehSeries,time,vin);
    }

    @Override
    public List<?> getGpsHeatVinWk(String vin, String time, String vehSeries) {
        return gpsHeatVinWkMapper.getGpsHeatVinWk(vin,time,vehSeries);
    }
}
