package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadVinDay;
import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadVinDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadVinDay record);

    int insertSelective(UseRoadVinDay record);

    UseRoadVinDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadVinDay record);

    int updateByPrimaryKey(UseRoadVinDay record);

    List<?> getUseRoadVinDay(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}