package com.smart.rdate.mapper;

import com.smart.rdate.entity.sysList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface sysListMapper {
    List<sysList> getListMessage(@Param("vin") String vin);
}