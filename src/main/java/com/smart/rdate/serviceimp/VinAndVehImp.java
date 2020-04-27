package com.smart.rdate.serviceimp;

import com.smart.rdate.mapper.VinAndVehMapper;
import com.smart.rdate.service.VinAndVeh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VinAndVehImp implements VinAndVeh {

    @Autowired
    private VinAndVehMapper vinAndVehMapper;
    @Override
    public List<com.smart.rdate.entity.VinAndVeh> getAll(String vehSeries) {
        return vinAndVehMapper.getAll(vehSeries);
    }

    @Override
    public List<com.smart.rdate.entity.VinAndVeh> getLikeVin(String vehSeries, String vin) {
        return vinAndVehMapper.getLikeVin(vehSeries,vin);
    }
}
