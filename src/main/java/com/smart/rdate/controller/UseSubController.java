package com.smart.rdate.controller;

import com.smart.rdate.entity.useRoad;
import com.smart.rdate.entity.useSub;
import com.smart.rdate.service.UseSubService;
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
@RequestMapping("/sub")
public class UseSubController {

    @Autowired
    private UseSubService useSubService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(time== null && vehSeries != null ){
            return useSubService.getUseRoadAll(vehSeries);

        }else if(vehSeries != null && time!= null){
            if(time.length() == 5){
                return useSubService.getUseRoadAllDay(vehSeries,time);
            }else{
                return useSubService.getUseRoadAllWk(vehSeries,time);
            }
        }
        return null;
    }
}
