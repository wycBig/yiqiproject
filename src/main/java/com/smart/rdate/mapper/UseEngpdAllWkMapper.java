package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseEngpdAllWk;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseEngpdAllWkMapper {

    List<?> getUseEngspdAllWk(@Param("vehSeries") String vehSeries, @Param("time") String time);
}