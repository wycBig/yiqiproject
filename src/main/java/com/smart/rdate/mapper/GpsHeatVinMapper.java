package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsHeatVin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsHeatVinMapper {
    List<?> getGpsHeatVin(@Param("vehSeries") String vehSeries,@Param("vin")  String vin);
}