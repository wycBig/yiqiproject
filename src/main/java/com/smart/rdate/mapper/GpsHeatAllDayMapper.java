package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsHeatAllDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsHeatAllDayMapper {
    List<?> getGpsHeatAllDay(@Param("vehSeries") String vehSeries, @Param("time") String time);
}