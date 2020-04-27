package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsHeatAllWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsHeatAllWkMapper {

    List<?> getGpsHeatAllWk(@Param("vehSeries") String vehSeries, @Param("time") String time);
}