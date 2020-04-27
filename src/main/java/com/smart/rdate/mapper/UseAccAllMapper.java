package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseAccAll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseAccAllMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseAccAll record);

    int insertSelective(UseAccAll record);

    UseAccAll selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseAccAll record);

    int updateByPrimaryKey(UseAccAll record);

    List<?> getUseAccAll(@Param("vehSeries") String vehSeries);
}