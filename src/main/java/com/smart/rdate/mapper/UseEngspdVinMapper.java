package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseEngspdVin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseEngspdVinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseEngspdVin record);

    int insertSelective(UseEngspdVin record);

    UseEngspdVin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseEngspdVin record);

    int updateByPrimaryKey(UseEngspdVin record);

    List<?> getUseEngspdVin(@Param("vin") String vin,@Param("vehSeries") String vehSeries);
}