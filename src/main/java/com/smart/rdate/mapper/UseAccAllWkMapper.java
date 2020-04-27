package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseAccAllWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseAccAllWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAccAllWk record);

    int insertSelective(UseAccAllWk record);

    UseAccAllWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAccAllWk record);

    int updateByPrimaryKey(UseAccAllWk record);

    List<?> getUseAccAllWk(@Param("vehSeries") String vehSeries, @Param("time") String time);
}