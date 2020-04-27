package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseBeamAll;
import com.smart.rdate.entity.UseBeamAllDay;
import com.smart.rdate.entity.useBeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseBeamAllDayMapper {
    List<UseBeamAllDay> getUseBeamAllDay(@Param("vehSeries") String vehSeries, @Param("time") String time);
}