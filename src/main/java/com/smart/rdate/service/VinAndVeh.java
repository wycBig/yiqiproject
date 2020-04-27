package com.smart.rdate.service;

import java.util.List;

public interface VinAndVeh {
    List<com.smart.rdate.entity.VinAndVeh> getAll(String vehSeries);

    List<com.smart.rdate.entity.VinAndVeh> getLikeVin(String vehSeries, String vin);
}
