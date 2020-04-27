package com.smart.rdate.mapper;

import com.smart.rdate.entity.useAcc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface useAccMapper {

    List<useAcc> getAccDate(
            @Param("vehSeries") String vehSeries,
            @Param("vin") String vin,
            @Param("day") String day,
            @Param("week") String week
            );
}