package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadAllWk;
import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadAllWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadAllWk record);

    int insertSelective(UseRoadAllWk record);

    UseRoadAllWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadAllWk record);

    int updateByPrimaryKey(UseRoadAllWk record);

    List<?> getUseRoadAllWk(@Param("vehSeries") String vehSeries, @Param("time")String time);
}