package com.smart.rdate.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GpsLoctionVinMapper {
    List<?> getVin(@Param("vin") String vin,@Param("str") String str);
}