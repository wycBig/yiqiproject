package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsLoctionVinWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsLoctionVinWkMapper {

    List<?> getVinWk(@Param("vin") String vin,@Param("time") String time,@Param("s") String s);
}