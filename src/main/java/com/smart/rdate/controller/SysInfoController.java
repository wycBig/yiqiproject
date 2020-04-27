package com.smart.rdate.controller;

import com.smart.rdate.entity.locTrace;
import com.smart.rdate.entity.sysInfo;
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
@RequestMapping("/info")
public class SysInfoController {

    @Autowired
    private SysInfoAndList sysInfo;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "vehSeries", value = "车辆型号", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "vin", value = "车辆vin号", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "time", value = "日期", required = true, paramType = "query", dataType = "String")
    })
    public List<com.smart.rdate.entity.sysInfo> getAllDate(String vehSeries) {
            return sysInfo.getCarMessage(vehSeries);
    }
}
