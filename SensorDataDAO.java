package com.smartirrigation.dao;

import com.smartirrigation.model.SensorData;

import java.util.ArrayList;
import java.util.List;

public class SensorDataDAO {
    private List<SensorData> sensorDataList = new ArrayList<>();

    public void saveSensorData(SensorData data) {
        sensorDataList.add(data);
    }

    public List<SensorData> getAllSensorData() {
        return sensorDataList;
    }
}
