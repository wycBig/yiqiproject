package com.smart.rdate.mapper;

import com.smart.rdate.entity.VinAndVeh;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VinAndVehMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VinAndVeh record);

    int insertSelective(VinAndVeh record);

    VinAndVeh selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VinAndVeh record);

    int updateByPrimaryKey(VinAndVeh record);

    List<com.smart.rdate.entity.VinAndVeh> getAll(@Param("vehSeries") String vehSeries);

    List<VinAndVeh> getLikeVin(@Param("vehSeries") String vehSeries,@Param("vin") String vin);
}