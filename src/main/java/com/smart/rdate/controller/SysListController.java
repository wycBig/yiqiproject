package com.smart.rdate.controller;

import com.smart.rdate.entity.sysList;
import com.smart.rdate.entity.useRoad;
import com.smart.rdate.service.SysInfoAndList;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/list")
public class SysListController {

    @Autowired
    private SysInfoAndList sysInfo;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="day",value="日期",required=true,paramType = "query",dataType="String")
    })
    public List<sysList> getAllDate(String vehSeries, String vin, String day) {
        if(vin != null){
            //获取车辆信息
            return sysInfo.getCarListMessage(vin);
        }
        return new ArrayList<>();
    }
}
