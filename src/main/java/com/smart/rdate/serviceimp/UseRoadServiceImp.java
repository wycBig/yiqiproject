package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.useRoad;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.UseRoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseRoadServiceImp implements UseRoadService {
    @Autowired
    private useRoadMapper useRoadMapper;
    @Override
    public List<useRoad> getUseRoadDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useRoad> useRoadDate = useRoadMapper.getUseRoadDate(vehSeries, vin, day,week);
        return useRoadDate;
    }

    @Autowired
    private UseRoadAllMapper useRoadAllMapper;
    @Autowired
    private UseRoadAllDayMapper useRoadAllDayMapper;
    @Autowired
    private UseRoadAllWkMapper useRoadAllWkMapper;
    @Autowired
    private UseRoadVinMapper useRoadVinMapper;
    @Autowired
    private UseRoadVinDayMapper useRoadVinDayMapper;
    @Autowired
    private UseRoadVinWkMapper useRoadVinWkMapper;
    @Override
    public List<?> getUseRoadAll(String vehSeries) {
        return useRoadAllMapper.getUseRoadAll(vehSeries);
    }

    @Override
    public List<?> getUseRoadAllDay(String vehSeries, String time) {
        return useRoadAllDayMapper.getUseRoadAllDay(vehSeries,time);
    }

    @Override
    public List<?> getUseRoadAllWk(String vehSeries, String time) {
        return useRoadAllWkMapper.getUseRoadAllWk(vehSeries,time);
    }

    @Override
    public List<?> getUseRoadVin(String vin, String vehSeries) {
        return useRoadVinMapper.getUseRoadVin(vin,vehSeries);
    }

    @Override
    public List<?> getUseRoadVinDay(String vin, String time, String vehSeries) {
        return useRoadVinDayMapper.getUseRoadVinDay(vin,time,vehSeries);
    }

    @Override
    public List<?> getUseRoadVinWk(String vin, String time, String vehSeries) {
        return useRoadVinWkMapper.getUseRoadVinWk(vin,time,vehSeries);
    }
}
