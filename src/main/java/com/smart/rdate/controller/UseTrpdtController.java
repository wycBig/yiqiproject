package com.smart.rdate.controller;


import com.smart.rdate.entity.useSub;
import com.smart.rdate.entity.useTrpdt;
import com.smart.rdate.entity.useTrptm;
import com.smart.rdate.service.UseTrpdtService;
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
@RequestMapping("/trpdt")
public class UseTrpdtController {

    @Autowired
    private UseTrpdtService useTrpdtService;


    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="time",value="日期",required=true,paramType = "query",dataType="String")
    })
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public List<?> getAllDate(String vehSeries, String vin, String time) {
        if(vin == null && vehSeries != null ){
            return useTrpdtService.getUseTrpdtAll(vehSeries,time);
        }else if(vehSeries != null && vin != null){
            return useTrpdtService.getUseTrpdtVin(vehSeries,time,vin);
        }
        return null;
    }
}
