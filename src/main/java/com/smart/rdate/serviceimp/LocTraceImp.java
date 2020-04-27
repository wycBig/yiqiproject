package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.*;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.LocTraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocTraceImp implements LocTraceService {

    @Autowired
    private locTraceMapper lTraceMapper;
    @Autowired
    private GpsTraceAllMapper gpsTraceAllMapper;
    @Autowired
    private GpsTraceAllDayMapper gpsTraceAllDayMapper;
    @Autowired
    private GpsTraceAllWkMapper gpsTraceAllWkMapper;
    @Autowired
    private GpsTraceVinMapper gpsTraceVinMapper;
    @Autowired
    private GpsTraceVinDayMapper gpsTraceVinDayMapper;
    @Autowired
    private GpsTraceVinWkMapper gpsTraceVinWkMapper;

    @Override
    public List<locTrace> getTraceData(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        return  lTraceMapper.getTraceData(vehSeries,vin,day,week);
    }

    @Override
    public List<GpsTraceAll> getGpsTraceAll(String vehSeries) {

        return gpsTraceAllMapper.getGpsTraceAll(vehSeries);
    }

    @Override
    public List<GpsTraceAllDay> getGpsTraceAllDay(String vehSeries, String time) {

        return gpsTraceAllDayMapper.getGpsTraceAllDay(vehSeries,time);
    }

    @Override
    public List<GpsTraceAllWk> getGpsTraceAllWk(String vehSeries, String time) {
        return gpsTraceAllWkMapper.getGpsTraceAllWk(vehSeries,time);
    }

    @Override
    public List<GpsTraceVin> getGpsTraceVin(String vin, String vehSeries) {
        return gpsTraceVinMapper.getGpsTraceVin(vin,vehSeries);
    }

    @Override
    public List<GpsTraceVinDay> getGpsTraceVinDay(String vin, String time, String vehSeries) {
        return gpsTraceVinDayMapper.getGpsTraceVinDay(vin,time,vehSeries);
    }

    @Override
    public List<GpsTraceVinWk> getGpsTraceVinWk(String vin, String time, String vehSeries) {
        return gpsTraceVinWkMapper.getGpsTraceVinWk(vin,time,vehSeries);
    }
}
