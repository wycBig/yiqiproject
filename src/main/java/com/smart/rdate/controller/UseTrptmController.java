package com.smart.rdate.controller;


import com.smart.rdate.entity.useTrptm;
import com.smart.rdate.service.UseTrptmService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/trptm")
public class UseTrptmController {

    @Autowired
    private UseTrptmService useTrptmService;

    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    /**
     * @RequestParam(value = "vehSeries",defaultValue = "HS7") String vehSeries,
     *                                            @RequestParam(value = "vin",defaultValue = " ") String vin,
     *                                            @RequestParam(value = "day",defaultValue = "0") String day
     */
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(vin == null && time== null && vehSeries != null ){
            return useTrptmService.getUseBeamAll(vehSeries);

        }else if(vehSeries != null && time!= null && vin == null){
            if(time.length() == 5){
                return useTrptmService.getUseBeamAllDay(vehSeries,time);
            }else{
                return useTrptmService.getUseBeamAllWk(vehSeries,time);
            }

        }else if(vin != null && vehSeries != null && time == null){
            return useTrptmService.getUseBeamVin(vin,vehSeries);
        }else if(vin != null && time != null && vehSeries != null){
            if(time.length() == 5){
                return useTrptmService.getUseBeamVinDay(vin,time,vehSeries);
            }else{
                return useTrptmService.getUseBeamVinWk(vin,time,vehSeries);
            }
        }
        return null;
    }
}
