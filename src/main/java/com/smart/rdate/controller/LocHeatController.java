package com.smart.rdate.controller;

import com.smart.rdate.entity.locHeat;
import com.smart.rdate.entity.locLocation;
import com.smart.rdate.service.LocHeatService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/heat")
public class LocHeatController {

    @Autowired
    private LocHeatService locHeatService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    //热力分布图
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(vin == null && time== null && vehSeries != null ){
            return locHeatService.getGpsHeatAll(vehSeries);

        }else if(vehSeries != null && time!= null && vin == null){
            if(time.length() == 5){
                return locHeatService.getGpsHeatAllDay(vehSeries,time);
            }else{
                return locHeatService.getGpsHeatAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return locHeatService.getGpsHeatVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return locHeatService.getGpsHeatVinDay(vin,time,vehSeries);
            }else{
                return locHeatService.getGpsHeatVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
