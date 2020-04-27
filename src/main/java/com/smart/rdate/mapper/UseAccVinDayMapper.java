package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseAccVinDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseAccVinDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAccVinDay record);

    int insertSelective(UseAccVinDay record);

    UseAccVinDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAccVinDay record);

    int updateByPrimaryKey(UseAccVinDay record);

    List<?> getUseAccVinDay(@Param("vin") String vin,@Param("time") String time, @Param("vehSeries") String vehSeries);
}