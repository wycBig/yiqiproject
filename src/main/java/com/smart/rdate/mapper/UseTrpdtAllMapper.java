package com.smart.rdate.mapper;

import com.smart.rdate.entity.UseTrpdtAll;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UseTrpdtAllMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UseTrpdtAll record);

    int insertSelective(UseTrpdtAll record);

    UseTrpdtAll selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UseTrpdtAll record);

    int updateByPrimaryKey(UseTrpdtAll record);

    List<?> getUseTrpdtAll(@Param("vehSeries") String vehSeries);

    List<?> getUseTrpdtAllWk(@Param("vehSeries") String vehSeries,@Param("time") String time);

    List<?> getUseTrpdtAllDay(@Param("vehSeries") String vehSeries,@Param("time") String time);

    List<?> getUseTrpdtAllDate(@Param("vehSeries") String vehSeries,@Param("time") String time);
}