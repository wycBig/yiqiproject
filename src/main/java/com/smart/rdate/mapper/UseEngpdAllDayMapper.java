package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseEngpdAllDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseEngpdAllDayMapper {

    List<?> getUseEngspdAllDay(@Param("vehSeries") String vehSeries, @Param("time") String time);
}