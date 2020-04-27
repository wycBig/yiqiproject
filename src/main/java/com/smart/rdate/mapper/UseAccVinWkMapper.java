package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseAccVinWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseAccVinWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAccVinWk record);

    int insertSelective(UseAccVinWk record);

    UseAccVinWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAccVinWk record);

    int updateByPrimaryKey(UseAccVinWk record);

    List<?> getUseAccVinWk(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries
    );
}