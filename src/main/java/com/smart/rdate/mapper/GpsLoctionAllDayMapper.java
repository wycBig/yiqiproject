package com.smart.rdate.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsLoctionAllDayMapper {

    List<?> getAllDay(@Param("vehSeries") String vehSeries ,@Param("time") String time);
}