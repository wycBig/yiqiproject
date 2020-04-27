package com.smart.rdate.controller;

import com.smart.rdate.entity.useBeam;
import com.smart.rdate.service.UseBeamService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/beam")
public class UseBeamController {

    @Autowired
    private UseBeamService useBeamService;


    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    //百公里灯光图
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(vin == null && time== null && vehSeries != null ){
            return useBeamService.getUseBeamAll(vehSeries);

        }else if(vehSeries != null && time!= null && vin == null){
            if(time.length() == 5){
                return useBeamService.getUseBeamAllDay(vehSeries,time);
            }else{
                return useBeamService.getUseBeamAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return useBeamService.getUseBeamVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return useBeamService.getUseBeamVinDay(vin,time,vehSeries);
            }else{
                return useBeamService.getUseBeamVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
