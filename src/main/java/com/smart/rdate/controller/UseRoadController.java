package com.smart.rdate.controller;

import com.smart.rdate.entity.useRoad;
import com.smart.rdate.entity.useRoad;
import com.smart.rdate.entity.useSub;
import com.smart.rdate.service.UseRoadService;
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
@RequestMapping("road")
public class UseRoadController {

    @Autowired
    private UseRoadService roadService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    public List<?> getAllDate(String vehSeries, String vin, String time) {

        if(vin == null && time== null && vehSeries != null ){
            return roadService.getUseRoadAll(vehSeries);

        }else if(vehSeries != null && time!= null && vin == null){
            if(time.length() == 5){
                return roadService.getUseRoadAllDay(vehSeries,time);
            }else{
                return roadService.getUseRoadAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return roadService.getUseRoadVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return roadService.getUseRoadVinDay(vin,time,vehSeries);
            }else{
                return roadService.getUseRoadVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
