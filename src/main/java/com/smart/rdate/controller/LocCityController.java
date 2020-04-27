package com.smart.rdate.controller;

import com.smart.rdate.entity.locCity;
import com.smart.rdate.entity.locLocation;
import com.smart.rdate.service.LocCityService;
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
@RequestMapping("/city")
public class LocCityController {

    @Autowired
    private LocCityService locCityService;


    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    //城市行驶累计
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(time== null && vehSeries != null ){
            return locCityService.getGpsCityAll(vehSeries);

        }else if(vehSeries != null && time!= null){
            if(time.length() == 5){
                return locCityService.getGpsCityAllDay(vehSeries,time);
            }else{
                return locCityService.getGpsCityAllWk(vehSeries,time);
            }
        }
        return null;
    }
}
