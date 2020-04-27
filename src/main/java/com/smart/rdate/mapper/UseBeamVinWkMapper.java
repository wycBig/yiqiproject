package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseBeamVinWk;
import com.smart.rdate.entity.useBeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseBeamVinWkMapper {
    List<UseBeamVinWk> getUseBeamVinWk(@Param("vin") String vin, @Param("time") String time, @Param("vehSeries") String vehSeries);
}