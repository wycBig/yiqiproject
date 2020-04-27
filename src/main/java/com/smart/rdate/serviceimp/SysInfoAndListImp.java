package com.smart.rdate.serviceimp;

import com.smart.rdate.entity.sysInfo;
import com.smart.rdate.entity.sysList;
import com.smart.rdate.mapper.sysInfoMapper;
import com.smart.rdate.mapper.sysListMapper;
import com.smart.rdate.service.SysInfoAndList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysInfoAndListImp implements SysInfoAndList {

    @Autowired
    private sysInfoMapper sInfoMapper;
    @Autowired
    private sysListMapper listMapper;

    @Override
    public List<sysInfo> getCarMessage(String vehSeries ) {
            return sInfoMapper.getCarMessage(vehSeries);
    }

    @Override
    public List<sysList> getCarListMessage(String vin) {
        return listMapper.getListMessage(vin);
    }
}
