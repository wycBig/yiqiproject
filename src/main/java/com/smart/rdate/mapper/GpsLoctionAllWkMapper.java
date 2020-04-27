package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsLoctionAllWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsLoctionAllWkMapper {

    List<?> getAllWk(@Param("vehSeries") String vehSeries , @Param("time") String time);
}