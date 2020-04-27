package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadSubWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadSubWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadSubWk record);

    int insertSelective(UseRoadSubWk record);

    UseRoadSubWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadSubWk record);

    int updateByPrimaryKey(UseRoadSubWk record);

    List<?> getUseRoadAllWk(@Param("vehSeries") String vehSeries, @Param("time") String time);
}