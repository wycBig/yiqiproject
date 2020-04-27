package com.smart.rdate.controller;

import com.smart.rdate.entity.locCity;
import com.smart.rdate.entity.locHeat;
import com.smart.rdate.entity.locLocation;
import com.smart.rdate.entity.locTrace;
import com.smart.rdate.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loc")
@Api(value = "数据查询")
public class LocMesController {

    //注入相关信息
    @Autowired
    private LocCityService locCityService;

    @Autowired
    private LocHeatService locHeatService;

    @Autowired
    private LocLocationService locLocationService;

    @Autowired
    private LocTraceService locTraceService;

    @Autowired
    private SysInfoAndList sysInfo;

    @ApiOperation(value = "城市信息搜索")
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="day",value="日期",required=true,paramType = "query",dataType="String")
    })
    public Map<String, List<?>> getAllDate(String vehSeries, String vin, String day) {
        long startTime = System.currentTimeMillis();
        if (vehSeries == null || vehSeries.equals("")) {
            vehSeries = "HS7";
        }
        //创建一个map集合用来存储相关数据信息
        Map<String, List<?>> map = new HashMap<String, List<?>>();
        //行驶轨迹数据获取
        List<locTrace> locTraces = getTraceData(vehSeries,vin,day);
        //将数据存储到集合中
        map.put("locTraces",locTraces);

        //获取城市形式累计里程
        List<locCity> locCities = getLocCityData(vehSeries,vin,day);
        //将数据存储到集合中
        map.put("locCities",locCities);

        //散点分布图数据获取
        List<locLocation> locLocations = getlocLocationData(vehSeries,vin,day);
        //将获取到的数据存入到集合中
        map.put("locLocations",locLocations);

        //热力分布数据获取
        List<locHeat> locHeats = getLocHeatData(vehSeries,vin,day);
        //将输入存入集合
        map.put("locHeats",locHeats);
        //将车辆信息获取到
        getCarMessage(vehSeries,vin,day,map);
        List<String> list= new ArrayList<String>();
        list.add(day);
        //将以日期为筛选的信息存入到集合中
        map.put("dayss",list);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"位置信息查询");
        return map;
    }

    private void getCarMessage(String vehSeries, String vin, String day, Map<String, List<?>> map) {
        //sysInfo.getCarMessage(vehSeries,vin,day,map);
    }

    //热力分布数据获取
    private List<locHeat> getLocHeatData(String vehSeries, String vin, String day) {
        return null;
    }

    //散点分布图数据获取
    private List<locLocation> getlocLocationData(String vehSeries, String vin, String day) {
        return locLocationService.getlocLocationData(vehSeries,vin,day);
    }

    //获取城市形式累计里程
    private List<locCity> getLocCityData(String vehSeries, String vin, String day) {
        return locCityService.getLocCityData(vehSeries,vin,day);
    }

    //行驶轨迹数据获取
    private List<locTrace> getTraceData(String vehSeries, String vin, String day) {
        //调用相关方法获取指定数据
        return locTraceService.getTraceData(vehSeries,vin,day);
    }
}
