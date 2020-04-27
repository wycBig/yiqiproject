package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrptmVinDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrptmVinDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrptmVinDay record);

    int insertSelective(UseTrptmVinDay record);

    UseTrptmVinDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrptmVinDay record);

    int updateByPrimaryKey(UseTrptmVinDay record);

    List<?> getUseBeamVinDay(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}