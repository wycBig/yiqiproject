package com.smart.rdate.mapper;

import com.smart.rdate.entity.locCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface locCityMapper {
    List<locCity> getLocCityData(
                                 @Param("vehSeries") String vehSeries,
                                 @Param("vin") String vin,
                                 @Param("day") String day,
                                 @Param("week") String week);
}