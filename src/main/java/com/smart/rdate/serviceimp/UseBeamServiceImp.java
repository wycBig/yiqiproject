package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.*;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.UseBeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseBeamServiceImp implements UseBeamService {

    @Autowired
    private useBeamMapper uBeamMapper;
    @Autowired
    private UseBeamAllMapper useBeamAllMapper;

    @Autowired
    private UseBeamAllDayMapper useBeamAllDayMapper;

    @Autowired
    private UseBeamAllWkMapper useBeamAllWkMapper;

    @Autowired
    private UseBeamVinMapper useBeamVinMapper;
    @Autowired
    private UseBeamVinDayMapper useBeamVinDayMapper;
    @Autowired
    private UseBeamVinWkMapper useBeamVinWkMapper;


    @Override
    public List<useBeam> getUseBeamDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useBeam> useBeamDate = uBeamMapper.getUseBeamDate(vehSeries, vin, day,week);

        return useBeamDate;
    }

    @Override
    public List<UseBeamAll> getUseBeamAll(String vehSeries) {
        return useBeamAllMapper.getUseBeamAll(vehSeries);
    }

    @Override
    public List<UseBeamAllDay> getUseBeamAllDay(String vehSeries, String time) {
        return useBeamAllDayMapper.getUseBeamAllDay(vehSeries,time);
    }

    @Override
    public List<UseBeamAllWk> getUseBeamAllWk(String vehSeries, String time) {
        return useBeamAllWkMapper.getUseBeamAllWk(vehSeries,time);
    }

    @Override
    public List<UseBeamVin> getUseBeamVin(String vin, String vehSeries) {
        return useBeamVinMapper.getUseBeamVin(vin,vehSeries);
    }

    @Override
    public List<UseBeamVinDay> getUseBeamVinDay(String vin, String time, String vehSeries) {
        return useBeamVinDayMapper.getUseBeamVinDay(vin,time,vehSeries);
    }

    @Override
    public List<UseBeamVinWk> getUseBeamVinWk(String vin, String time, String vehSeries) {
        return useBeamVinWkMapper.getUseBeamVinWk(vin,time,vehSeries);
    }
}
