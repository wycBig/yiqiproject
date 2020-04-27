package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.useSub;
import com.smart.rdate.mapper.UseRoadSubDayMapper;
import com.smart.rdate.mapper.UseRoadSubMapper;
import com.smart.rdate.mapper.UseRoadSubWkMapper;
import com.smart.rdate.mapper.useSubMapper;
import com.smart.rdate.service.UseSubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseSubServiceImp implements UseSubService {

    @Autowired
    private useSubMapper useSubMapper;
    @Override
    public List<useSub> getUseSubDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useSub> useSubDate = useSubMapper.getUseSubDate(vehSeries, vin, day,week);
        return useSubDate;
    }

    @Autowired
    private UseRoadSubMapper useRoadSubMapper;
    @Autowired
    private UseRoadSubDayMapper useRoadSubDayMapper;
    @Autowired
    private UseRoadSubWkMapper useRoadSubWkMapper;
    @Override
    public List<?> getUseRoadAll(String vehSeries) {
        return useRoadSubMapper.getUseRoadAll(vehSeries);
    }

    @Override
    public List<?> getUseRoadAllDay(String vehSeries, String time) {
        return useRoadSubDayMapper.getUseRoadAllDay(vehSeries,time);
    }

    @Override
    public List<?> getUseRoadAllWk(String vehSeries, String time) {
        return useRoadSubWkMapper.getUseRoadAllWk(vehSeries,time);
    }
}
