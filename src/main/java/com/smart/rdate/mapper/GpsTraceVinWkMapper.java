package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsTraceVin;
import com.smart.rdate.entity.GpsTraceVinWk;
import com.smart.rdate.entity.locTrace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsTraceVinWkMapper {
    List<GpsTraceVinWk> getGpsTraceVinWk(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}