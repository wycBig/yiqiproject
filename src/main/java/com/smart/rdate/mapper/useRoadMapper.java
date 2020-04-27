package com.smart.rdate.mapper;

import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface useRoadMapper {

    List<useRoad> getUseRoadDate(
            @Param("vehSeries") String vehSeries,
            @Param("vin") String vin,
            @Param("day") String day,
            @Param("week") String week
            );
}