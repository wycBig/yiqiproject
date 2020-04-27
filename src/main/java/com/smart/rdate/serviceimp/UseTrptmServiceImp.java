package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.useTrptm;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.UseTrptmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseTrptmServiceImp implements UseTrptmService {

    @Autowired
    private useTrptmMapper uTrptmMapper;

    @Override
    public List<useTrptm> getUseTrptmDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useTrptm> useTrptms =  uTrptmMapper.getUseTrptmDate(vehSeries, vin, day,week);
        return useTrptms;
    }

    @Autowired
    private UseTrptmAllMapper useTrptmAllMapper;
    @Autowired
    private UseTrptmAllDayMapper useTrptmAllDayMapper;
    @Autowired
    private UseTrptmAllWkMapper useTrptmAllWkMapper;
    @Autowired
    private UseTrptmVinMapper useTrptmVinMapper;
    @Autowired
    private UseTrptmVinDayMapper useTrptmVinDayMapper;
    @Autowired
    private UseTrptmVinWkMapper useTrptmVinWkMapper;

    @Override
    public List<useTrptm> get() {
        return uTrptmMapper.get();
    }

    @Override
    public List<?> getUseBeamAll(String vehSeries) {

        return useTrptmAllMapper.getUseBeamAll(vehSeries);
    }

    @Override
    public List<?> getUseBeamAllDay(String vehSeries, String time) {
        return  useTrptmAllDayMapper.getUseBeamAllDay(vehSeries,time);
    }

    @Override
    public List<?> getUseBeamAllWk(String vehSeries, String time) {
        return  useTrptmAllWkMapper.getUseBeamAllWk(vehSeries,time);
    }

    @Override
    public List<?> getUseBeamVin(String vin, String vehSeries) {
        return useTrptmVinMapper.getUseBeamVin(vin,vehSeries);
    }

    @Override
    public List<?> getUseBeamVinDay(String vin, String time, String vehSeries) {
        return useTrptmVinDayMapper.getUseBeamVinDay(vin,time,vehSeries);
    }

    @Override
    public List<?> getUseBeamVinWk(String vin, String time, String vehSeries) {
        return useTrptmVinWkMapper.getUseBeamVinWk(vin,time,vehSeries);
    }
}
