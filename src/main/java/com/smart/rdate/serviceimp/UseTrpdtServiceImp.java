package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.useTrpdt;
import com.smart.rdate.mapper.UseTrpdtAllMapper;
import com.smart.rdate.mapper.UseTrpdtVinMapper;
import com.smart.rdate.mapper.useTrpdtMapper;

import com.smart.rdate.service.UseTrpdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseTrpdtServiceImp implements UseTrpdtService {

    @Autowired
    private useTrpdtMapper useTrpdtMapper;

    @Autowired
    private UseTrpdtAllMapper useTrpdtAllMapper;
    @Autowired
    private UseTrpdtVinMapper useTrpdtVinMapper;

    @Override
    public List<useTrpdt> getUseTrpdtDate(String vehSeries, String vin, String time) {
        String day = "";
        String week = "";
        if (time != null && time.length() == 9){
            week = time;
        }else if(time != null && time.length() == 10){
            day = time;
        }
        List<useTrpdt> useTrpdtDate = useTrpdtMapper.getUseTrpdtDate(vehSeries, vin, day,week);
        //获取车辆信息
         //getCarMessageService.getCarMessageTrpdt(vehSeries,vin,day,useTrpdtDate);
         return useTrpdtDate;
    }

    @Override
    public List<?> getUseTrpdtAll(String vehSeries,String time) {

       if(time!= null){
           if (time.length() == 4){
               return useTrpdtAllMapper.getUseTrpdtAllWk(vehSeries,time);
           }else if(time.length() == 5){
               return useTrpdtAllMapper.getUseTrpdtAllDay(vehSeries,time);
           }else if(time.length() == 10){
               return useTrpdtAllMapper.getUseTrpdtAllDate(vehSeries,time);
           }
       }
        return useTrpdtAllMapper.getUseTrpdtAll(vehSeries);
    }

    @Override
    public List<?> getUseTrpdtVin(String vehSeries, String time,String vin) {
        if(time!= null){
            if (time.length() == 4){
                return useTrpdtVinMapper.getUseTrpdtVinWk(vehSeries,time,vin);
            }else if(time.length() == 5){
                return useTrpdtVinMapper.getUseTrpdtVinDay(vehSeries,time,vin);
            }else if(time.length() == 10){
                return useTrpdtVinMapper.getUseTrpdtVinDate(vehSeries,time,vin);
            }
        }
        return useTrpdtVinMapper.getUseTrpdtVin(vehSeries,vin);
    }
}
