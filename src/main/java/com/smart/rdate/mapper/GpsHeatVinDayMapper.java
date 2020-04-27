package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsHeatVinDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsHeatVinDayMapper {

    List<?> getGpsHeatVinDay(@Param("vehSeries") String vehSeries,@Param("time") String time, @Param("vin") String vin);
}