package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsTraceVin;
import com.smart.rdate.entity.locTrace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsTraceVinMapper {
    List<GpsTraceVin> getGpsTraceVin( @Param("vin") String vin,@Param("vehSeries") String vehSeries);
}