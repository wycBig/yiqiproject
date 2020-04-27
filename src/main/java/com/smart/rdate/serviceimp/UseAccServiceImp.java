package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.useAcc;
import com.smart.rdate.mapper.*;
import com.smart.rdate.service.UseAccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseAccServiceImp implements UseAccService {

    @Autowired
    private useAccMapper uAccMapper;

    @Autowired
    private UseAccAllMapper useAccAllMapper;
    @Autowired
    private UseAccAllDayMapper useAccAllDayMapper;
    @Autowired
    private UseAccAllWkMapper useAccAllWkMapper;
    @Autowired
    private UseAccVinMapper useAccVinMapper;
    @Autowired
    private UseAccVinDayMapper useAccVinDayMapper;
    @Autowired
    private UseAccVinWkMapper useAccVinWkMapper;
    @Override
    public List<useAcc> getAccDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useAcc> accDate = uAccMapper.getAccDate(vehSeries, vin, day,week);
        return accDate;
    }

    @Override
    public List<?> getUseAccAll(String vehSeries) {

        return useAccAllMapper.getUseAccAll(vehSeries);
    }

    @Override
    public List<?> getUseAccAllDay(String vehSeries, String time) {
        return useAccAllDayMapper.getUseAccAllDay(vehSeries,time);
    }

    @Override
    public List<?> getUseAccAllWk(String vehSeries, String time) {
        return useAccAllWkMapper.getUseAccAllWk(vehSeries,time);
    }

    @Override
    public List<?> getUseAccVin(String vin, String vehSeries) {
        return useAccVinMapper.getUseAccVin(vin,vehSeries);
    }

    @Override
    public List<?> getUseAccVinDay(String vin, String time, String vehSeries) {
        return useAccVinDayMapper.getUseAccVinDay(vin,time,vehSeries);
    }

    @Override
    public List<?> getUseAccVinWk(String vin, String time, String vehSeries) {
        return useAccVinWkMapper.getUseAccVinWk(vin,time,vehSeries);
    }
}
