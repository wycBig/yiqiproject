package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadVin;
import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadVinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadVin record);

    int insertSelective(UseRoadVin record);

    UseRoadVin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadVin record);

    int updateByPrimaryKey(UseRoadVin record);

    List<?> getUseRoadVin(@Param("vin") String vin,@Param("vehSeries") String vehSeries);
}