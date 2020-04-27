package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseAccVin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseAccVinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAccVin record);

    int insertSelective(UseAccVin record);

    UseAccVin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAccVin record);

    int updateByPrimaryKey(UseAccVin record);

    List<?> getUseAccVin(@Param("vin") String vin,@Param("vehSeries") String vehSeries);
}