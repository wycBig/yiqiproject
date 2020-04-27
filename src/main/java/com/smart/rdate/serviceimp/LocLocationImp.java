package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.locLocation;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.LocLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocLocationImp implements LocLocationService {

    @Autowired
    private locLocationMapper lLocationMapper;

    @Autowired
    private GpsLoctionAllMapper gpsLoctionAllMapper;
    @Autowired
    private GpsLoctionVinMapper gpsLoctionVin;
    @Override
    public List<locLocation> getlocLocationData(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        return lLocationMapper.getlocLocationData(vehSeries,vin,day,week);
    }

    @Autowired
    private GpsLoctionAllDayMapper gpsLoctionAllDayMapper;

    @Autowired
    private GpsLoctionAllWkMapper gpsLoctionAllWkMapper;

    @Autowired
    private GpsLoctionVinDayMapper gpsLoctionVinDayMapper;

    @Autowired
    private GpsLoctionVinWkMapper gpsLoctionVinWkMapper;

    @Override
    public List<locLocation> getGpsLocAll(String vehSeries) {
        return gpsLoctionAllMapper.getGpsLocAll(vehSeries);
    }

    @Override
    public List<?> getAllDay(String vehSeries, String time) {
        return gpsLoctionAllDayMapper.getAllDay(vehSeries,time);
    }

    @Override
    public List<?> getAllWk(String vehSeries, String time) {
        return gpsLoctionAllWkMapper.getAllWk(vehSeries,time);
    }

    @Override
    public List<?> getVin( String vin,String s) {
        return gpsLoctionVin.getVin(vin,s);
    }

    @Override
    public List<?> getVinDay(String vin, String time,String s) {

        return gpsLoctionVinDayMapper.getVinDay(vin,time,s);
    }

    @Override
    public List<?> getVinWk(String vin, String time,String s) {

        return gpsLoctionVinWkMapper.getVinWk(vin,time,s);
    }
}
