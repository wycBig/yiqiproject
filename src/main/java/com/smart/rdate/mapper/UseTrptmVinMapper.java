package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrptmVin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrptmVinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrptmVin record);

    int insertSelective(UseTrptmVin record);

    UseTrptmVin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrptmVin record);

    int updateByPrimaryKey(UseTrptmVin record);

    List<?> getUseBeamVin(@Param("vin") String vin,@Param("vehSeries") String vehSeries);

}