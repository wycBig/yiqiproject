package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.GpsCityAll;
import com.smart.rdate.entity.GpsCityAllDay;
import com.smart.rdate.entity.GpsCityAllWk;
import com.smart.rdate.entity.locCity;
import com.smart.rdate.mapper.GpsCityAllDayMapper;
import com.smart.rdate.mapper.GpsCityAllMapper;
import com.smart.rdate.mapper.GpsCityAllWkMapper;
import com.smart.rdate.mapper.locCityMapper;
import com.smart.rdate.service.LocCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocCityServiceImp implements LocCityService {

    @Autowired
    private locCityMapper lCityMapper;
    @Autowired
    private GpsCityAllMapper gpsCityAllMapper;
    @Autowired
    private GpsCityAllDayMapper gpsCityAllDayMapper;
    @Autowired
    private GpsCityAllWkMapper gpsCityAllWkMapper;
    @Override
    public List<locCity> getLocCityData(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
            System.out.println(week);
        }else if(time != null && time.length() == 10){
            day = time;
        }
        return lCityMapper.getLocCityData(vehSeries,vin,day,week);
    }

    @Override
    public List<GpsCityAll> getGpsCityAll(String vehSeries) {

    return gpsCityAllMapper.getGpsCityAll(vehSeries);
    }

    @Override
    public List<GpsCityAllDay> getGpsCityAllDay(String vehSeries, String time) {
        return gpsCityAllDayMapper.getGpsCityAllDay(vehSeries,time);
    }

    @Override
    public List<GpsCityAllWk> getGpsCityAllWk(String vehSeries, String time) {
        return gpsCityAllWkMapper.getGpsCityAllWk(vehSeries,time);
    }
}
