package com.smart.rdate.controller;

import com.smart.rdate.entity.useBeam;
import com.smart.rdate.entity.useEngspd;
import com.smart.rdate.entity.useRoad;
import com.smart.rdate.service.UseEngspdService;
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
@RequestMapping("/engspd")
public class UseEngspdController {
    @Autowired
    private UseEngspdService useEngspdService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    //加速度分布值
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(vin == null && time== null && vehSeries != null ){
            return useEngspdService.getUseEngspdAll(vehSeries);

        }else if(vehSeries != null && time!= null && vin == null){
            if(time.length() == 5){
                return useEngspdService.getUseEngspdAllDay(vehSeries,time);
            }else{
                return useEngspdService.getUseEngspdAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return useEngspdService.getUseEngspdVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return useEngspdService.getUseEngspdVinDay(vin,time,vehSeries);
            }else{
                return useEngspdService.getUseEngspdVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
