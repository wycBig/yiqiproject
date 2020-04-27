package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsLoctionVinDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsLoctionVinDayMapper {

    List<?> getVinDay(@Param("vin") String vin, @Param("time") String time,@Param("s") String s);
}