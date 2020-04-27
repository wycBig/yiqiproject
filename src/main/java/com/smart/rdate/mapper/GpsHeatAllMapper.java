package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsHeatAll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsHeatAllMapper {

    List<?> getGpsHeatAll(@Param("vehSeries") String vehSeries);
}