package com.smart.rdate.mapper;

import com.smart.rdate.entity.useEngspd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface useEngspdMapper {

    List<useEngspd> getuseEngspdDate(
                                     @Param("vehSeries") String vehSeries,
                                     @Param("vin") String vin,
                                     @Param("day") String day,
                                     @Param("week") String week
                                     );
}