package com.smart.rdate.controller;

import com.smart.rdate.service.LocCityService;
import com.smart.rdate.service.VinAndVeh;
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
@RequestMapping("/vvc")
public class VinAndVehController {

    @Autowired
    private VinAndVeh vinAndVeh;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String")
    })
    public List<com.smart.rdate.entity.VinAndVeh> getAll(String vehSeries) {

        return vinAndVeh.getAll(vehSeries);
    }
    @RequestMapping(value = "/searchlike",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name="vehSeries",value="车辆型号",required=true,paramType = "query",dataType="String"),
            @ApiImplicitParam(name="vin",value="车辆vin号",required=true,paramType = "query",dataType="String")
    })
    public List<com.smart.rdate.entity.VinAndVeh> getLikeVin(String vehSeries,String vin) {

        return vinAndVeh.getLikeVin(vehSeries,vin);
    }
}
