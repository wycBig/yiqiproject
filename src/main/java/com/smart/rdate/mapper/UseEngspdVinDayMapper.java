package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseEngspdVinDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseEngspdVinDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseEngspdVinDay record);

    int insertSelective(UseEngspdVinDay record);

    UseEngspdVinDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseEngspdVinDay record);

    int updateByPrimaryKey(UseEngspdVinDay record);

    List<?> getUseEngspdVinDay(@Param("vin") String vin, @Param("time") String time,@Param("vehSeries") String vehSeries);
}