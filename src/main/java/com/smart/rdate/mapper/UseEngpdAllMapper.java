package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseEngpdAll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseEngpdAllMapper {
    List<?> getUseEngspdAll(@Param("vehSeries") String vehSeries);
}