package com.smart.rdate.mapper;

import com.smart.rdate.entity.GpsCityAll;
import com.smart.rdate.entity.GpsCityAllWk;
import com.smart.rdate.entity.locCity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GpsCityAllWkMapper {
    List<GpsCityAllWk> getGpsCityAllWk(@Param("vehSeries") String vehSeries, @Param("time") String time);
}