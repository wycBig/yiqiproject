package com.smart.rdate.controller;

import com.smart.rdate.entity.GpsLoctionAll;
import com.smart.rdate.entity.locLocation;
import com.smart.rdate.entity.locTrace;
import com.smart.rdate.service.LocLocationService;
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
@RequestMapping("/location")
public class LocLocationController {

    @Autowired
    private LocLocationService locLocationService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    //获取散点分布图数据
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        //散点分布图数据获取
        if(vin == null && time== null && vehSeries != null){
             return locLocationService.getGpsLocAll(vehSeries);

        }else if(vehSeries != null && time != null && vin == null){
            if(time.length() == 5){
                return locLocationService.getAllDay(vehSeries,time);
            }else{
                return locLocationService.getAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return locLocationService.getVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return locLocationService.getVinDay(vin,time,vehSeries);
            }else{
                return locLocationService.getVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
