package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadAll;
import com.smart.rdate.entity.useRoad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadAllMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadAll record);

    int insertSelective(UseRoadAll record);

    UseRoadAll selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadAll record);

    int updateByPrimaryKey(UseRoadAll record);

    List<?> getUseRoadAll(@Param("vehSeries") String vehSeries);
}