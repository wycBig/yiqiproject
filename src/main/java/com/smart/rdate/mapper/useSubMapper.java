package com.smart.rdate.mapper;

import com.smart.rdate.entity.useSub;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface useSubMapper {


    List<useSub> getUseSubDate(
            @Param("vehSeries") String vehSeries,
            @Param("vin") String vin,
            @Param("day") String day,
            @Param("week") String week
            );
}