package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrptmAllWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrptmAllWkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrptmAllWk record);

    int insertSelective(UseTrptmAllWk record);

    UseTrptmAllWk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrptmAllWk record);

    int updateByPrimaryKey(UseTrptmAllWk record);

    List<?> getUseBeamAllWk(@Param("vehSeries") String vehSeries, @Param("time") String time);
}