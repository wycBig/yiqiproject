package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.useEngspd;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.UseEngspdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseEngspdServiceImp implements UseEngspdService {
    @Autowired
    private useEngspdMapper uEngspdMapper;

    @Autowired
    private UseEngpdAllMapper useEngpdAllMapper;
    @Autowired
    private UseEngpdAllDayMapper useEngpdAllDayMapper;
    @Autowired
    private UseEngpdAllWkMapper useEngpdAllWkMapper;

    @Autowired
    private UseEngspdVinMapper useEngspdVinMapper;
    @Autowired
    private UseEngspdVinDayMapper useEngspdVinDayMapper;
    @Autowired
    private UseEngspdVinWkMapper useEngspdVinWkMapper;

    @Override
    public List<useEngspd> getuseEngspdDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useEngspd> useEngspds = uEngspdMapper.getuseEngspdDate(vehSeries, vin, day,week);
        return useEngspds;
    }

    @Override
    public List<?> getUseEngspdAll(String vehSeries) {
        return useEngpdAllMapper.getUseEngspdAll(vehSeries);

    }

    @Override
    public List<?> getUseEngspdAllDay(String vehSeries, String time) {
        return useEngpdAllDayMapper.getUseEngspdAllDay(vehSeries,time);
    }

    @Override
    public List<?> getUseEngspdAllWk(String vehSeries, String time) {
        return useEngpdAllWkMapper.getUseEngspdAllWk(vehSeries,time);
    }

    @Override
    public List<?> getUseEngspdVin(String vin, String vehSeries) {
        return useEngspdVinMapper.getUseEngspdVin(vin,vehSeries);
    }

    @Override
    public List<?> getUseEngspdVinDay(String vin, String time, String vehSeries) {
        return useEngspdVinDayMapper.getUseEngspdVinDay(vin,time,vehSeries);
    }

    @Override
    public List<?> getUseEngspdVinWk(String vin, String time, String vehSeries) {
        return useEngspdVinWkMapper.getUseEngspdVinWk(vin,time,vehSeries);
    }
}
