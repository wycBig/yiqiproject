package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseRoadSub;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseRoadSubMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseRoadSub record);

    int insertSelective(UseRoadSub record);

    UseRoadSub selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseRoadSub record);

    int updateByPrimaryKey(UseRoadSub record);

    List<?> getUseRoadAll(@Param("vehSeries") String vehSeries);
}