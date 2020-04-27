package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadVinWk;
import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadVinWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadVinWk record);

    int insertSelective(UseRoadVinWk record);

    UseRoadVinWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadVinWk record);

    int updateByPrimaryKey(UseRoadVinWk record);

    List<?> getUseRoadVinWk(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}