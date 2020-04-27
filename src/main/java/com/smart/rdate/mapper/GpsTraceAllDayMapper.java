package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsTraceAll;
import com.smart.rdate.entity.GpsTraceAllDay;
import com.smart.rdate.entity.locTrace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsTraceAllDayMapper {

    List<GpsTraceAllDay> getGpsTraceAllDay(@Param("vehSeries") String vehSeries, @Param("time") String time);
}