package com.smart.rdate.mapper;

import com.smart.rdate.entity.useTrptm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface useTrptmMapper {

    List<useTrptm> getUseTrptmDate(
            @Param("vehSeries") String vehSeries,
            @Param("vin") String vin,
            @Param("day") String day,
            @Param("week") String week
            );

    List<useTrptm> get();
}