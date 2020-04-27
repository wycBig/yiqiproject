package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseBeamVin;
import com.smart.rdate.entity.useBeam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseBeamVinMapper {

    List<UseBeamVin> getUseBeamVin(@Param("vin") String vin,@Param("vehSeries") String vehSeries);
}