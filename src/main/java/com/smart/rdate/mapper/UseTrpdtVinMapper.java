package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrpdtVin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrpdtVinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrpdtVin record);

    int insertSelective(UseTrpdtVin record);

    UseTrpdtVin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrpdtVin record);

    int updateByPrimaryKey(UseTrpdtVin record);

    List<?> getUseTrpdtVin(@Param("vehSeries") String vehSeries,@Param("vin") String vin);

    List<?> getUseTrpdtVinWk(@Param("vehSeries") String vehSeries,@Param("time") String time,@Param("vin") String vin);

    List<?> getUseTrpdtVinDay(@Param("vehSeries") String vehSeries,@Param("time") String time,@Param("vin") String vin);

    List<?> getUseTrpdtVinDate(@Param("vehSeries") String vehSeries,@Param("time") String time,@Param("vin") String vin);
}