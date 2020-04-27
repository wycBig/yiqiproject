package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsCityAllDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsCityAllDayMapper {

    List<GpsCityAllDay> getGpsCityAllDay(@Param("vehSeries") String vehSeries, @Param("time") String time);
}