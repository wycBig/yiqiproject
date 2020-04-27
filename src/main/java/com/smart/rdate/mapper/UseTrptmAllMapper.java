package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrptmAll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrptmAllMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrptmAll record);

    int insertSelective(UseTrptmAll record);

    UseTrptmAll selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrptmAll record);

    int updateByPrimaryKey(UseTrptmAll record);

    List<?> getUseBeamAll(@Param("vehSeries") String vehSeries);
}