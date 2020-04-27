package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsHeatVinWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsHeatVinWkMapper {

    List<?> getGpsHeatVinWk(@Param("vin") String vin,@Param("time") String time,@Param("vehSeries") String vehSeries);

}