package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseAccAllDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseAccAllDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAccAllDay record);

    int insertSelective(UseAccAllDay record);

    UseAccAllDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAccAllDay record);

    int updateByPrimaryKey(UseAccAllDay record);

    List<?> getUseAccAllDay(@Param("vehSeries") String vehSeries,@Param("time") String time);
}