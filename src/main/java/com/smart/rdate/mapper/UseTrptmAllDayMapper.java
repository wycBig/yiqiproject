package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrptmAllDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrptmAllDayMapper {

    List<?> getUseBeamAllDay(@Param("vehSeries") String vehSeries,@Param("time") String time);
}