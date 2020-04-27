package com.smart.rdate.mapper;

import com.smart.rdate.entity.sysInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface sysInfoMapper {

    List<sysInfo> getCarMessage(@Param("vehSeries") String vehSeries);
}