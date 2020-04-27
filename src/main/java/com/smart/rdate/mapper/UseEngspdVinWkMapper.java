package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseEngspdVinWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseEngspdVinWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseEngspdVinWk record);

    int insertSelective(UseEngspdVinWk record);

    UseEngspdVinWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseEngspdVinWk record);

    int updateByPrimaryKey(UseEngspdVinWk record);

    List<?> getUseEngspdVinWk(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}