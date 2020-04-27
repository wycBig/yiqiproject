package com.smart.rdate.controller;

import com.smart.rdate.entity.locTrace;
import com.smart.rdate.service.LocTraceService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/trace")
public class LocTraceController {

    @Autowired
    private LocTraceService locTraceService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    //轨迹分析图
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(vin == null && time== null && vehSeries != null ){
            return locTraceService.getGpsTraceAll(vehSeries);

        }else if(vehSeries != null && time!= null && vin == null){
            if(time.length() == 5){
                return locTraceService.getGpsTraceAllDay(vehSeries,time);
            }else{
                return locTraceService.getGpsTraceAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return locTraceService.getGpsTraceVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return locTraceService.getGpsTraceVinDay(vin,time,vehSeries);
            }else{
                return locTraceService.getGpsTraceVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
