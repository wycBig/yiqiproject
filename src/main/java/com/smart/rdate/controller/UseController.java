package com.smart.rdate.controller;

import com.smart.rdate.entity.*;
import com.smart.rdate.service.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/use")
@Api(value = "数据查询")

public class UseController {

    @Autowired
    private UseTrptmService useTrptmService;

    @Autowired
    private UseTrpdtService useTrpdtService;

    @Autowired
    private UseRoadService roadService;

    @Autowired
    private UseSubService useSubService;

    @Autowired
    private UseAccService useAccService;

    @Autowired
    private UseEngspdService useEngspdService;

    @Autowired
    private UseBeamService useBeamService;

    @Autowired
    private SysInfoAndList sysInfo;
    /**
     *
     * @param vehSeries
     * @param vin
     * @param day
     * @return
     * 通过制定参数来获取到指定信息
     */
    @ApiOperation(value = "信息搜索")
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="day",value="日期",required=true,paramType = "query",dataType="String")
    })
    public Map<String,List<?>> getAllDate(String vehSeries, String vin, String day){
        long startTime = System.currentTimeMillis();
        if (vehSeries == null || vehSeries.equals("")){
            vehSeries = "HS7";
        }
        //创建一个map集合用来存储已经查询到的顺序
        Map<String,List<?>> map = new HashMap<String,List<?>>() ;
        //获取出行时刻表数据
       List<useTrptm> useTrptms = useTrptmService.getUseTrptmDate(vehSeries,vin,day);
       //数据存入
        map.put("useTrptms",useTrptms);
        //获取出行日期的值
        List<useTrpdt> useTrpdts =  getUseTrpdtDate(vehSeries,vin,day);
        //将获取到的出行日期表数据存入到集合中
        map.put("uTrpdts",useTrpdts);
        //形式路型统计数据一
        List<?> useRoadDate = getUseRoadDate(vehSeries,vin,day);
        //将获取到的路型存入到集合中
        map.put("useRoadDate",useRoadDate);
        //形式路型统计数据二
        List<useSub> useSubs = getUseSubDate(vehSeries,vin,day);
        //将获取到的路型存入到集合中
        map.put("useSubs",useSubs);
        //获取加速度数据
        List<useAcc> useAccs =  getAcc(vehSeries,vin,day);
        //将至存入map集合中
        map.put("useAccs",useAccs);
        //获取转速
        List<useEngspd> useEngspds = getuseEngspdDate(vehSeries,vin,day);
        //将至存入map集合中
        map.put("useEngspds",useEngspds);
        //百公里灯光数据获取
        List<useBeam> useBeams = getUseBeamDate(vehSeries,vin,day);
        //将数据存入集合
        map.put("useBeams",useBeams);
        //获取车辆信息
        getCarMessage(vehSeries,vin,day,map);
        List<String> list= new ArrayList<String>();
        list.add(day);
        map.put("dayss",list);

        return map;
    }
    //车辆基本信息获取
    private void getCarMessage(String vehSeries, String vin, String day,Map<String,List<?>> map) {
        //sysInfo.getCarMessage(vehSeries,vin,day,map);
    }
    //百公里灯光数据获取
    private List<useBeam> getUseBeamDate(String vehSeries, String vin, String day){
        return useBeamService.getUseBeamDate(vehSeries,vin,day);
    }
    //获取转速
    private List<useEngspd> getuseEngspdDate(String vehSeries, String vin, String day) {
        return useEngspdService.getuseEngspdDate(vehSeries,vin,day);
    }

    //形式路型统计数据二
    private List<useSub> getUseSubDate(String vehSeries, String vin, String day) {
        return useSubService.getUseSubDate(vehSeries,vin,day);
    }

    //形式路型统计数据一
    private List<?> getUseRoadDate(String vehSeries, String vin, String day) {
        return roadService.getUseRoadDate(vehSeries,vin,day);
    }

    //获取出行日期的值
    private List<useTrpdt> getUseTrpdtDate(String vehSeries, String vin, String day) {
        return useTrpdtService.getUseTrpdtDate(vehSeries,vin,day);
    }


    //获取加速度数据
    private List<useAcc> getAcc(String vehSeries, String vin, String day) {
        return useAccService.getAccDate(vehSeries,vin,day);
    }

}
