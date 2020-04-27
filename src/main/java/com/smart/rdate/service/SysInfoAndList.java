package com.smart.rdate.service;

import com.smart.rdate.entity.sysInfo;
import com.smart.rdate.entity.sysList;

import java.util.List;
import java.util.Map;

public interface SysInfoAndList {

    List<sysInfo> getCarMessage(String vehSeries);

    List<sysList> getCarListMessage(String vin);
}
