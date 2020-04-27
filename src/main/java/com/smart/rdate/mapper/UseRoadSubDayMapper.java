package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadSubDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadSubDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadSubDay record);

    int insertSelective(UseRoadSubDay record);

    UseRoadSubDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadSubDay record);

    int updateByPrimaryKey(UseRoadSubDay record);

    List<?> getUseRoadAllDay(@Param("vehSeries") String vehSeries, @Param("time") String time);
}