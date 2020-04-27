package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrptmVinWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrptmVinWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrptmVinWk record);

    int insertSelective(UseTrptmVinWk record);

    UseTrptmVinWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrptmVinWk record);

    int updateByPrimaryKey(UseTrptmVinWk record);

    List<?> getUseBeamVinWk(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}