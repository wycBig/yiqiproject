package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadAllDay;
import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadAllDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadAllDay record);

    int insertSelective(UseRoadAllDay record);

    UseRoadAllDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadAllDay record);

    int updateByPrimaryKey(UseRoadAllDay record);

    List<?> getUseRoadAllDay(@Param("vehSeries") String vehSeries, @Param("time")String time);
}