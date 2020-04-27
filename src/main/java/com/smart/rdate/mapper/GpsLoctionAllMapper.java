package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsLoctionAll;
import com.smart.rdate.entity.locLocation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsLoctionAllMapper {
    List<locLocation> getGpsLocAll(@Param("vehSeries") String vehSeries);
}