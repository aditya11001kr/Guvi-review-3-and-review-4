package com.smartirrigation.service;

import com.smartirrigation.dao.SensorDataDAO;
import com.smartirrigation.model.SensorData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IrrigationServiceTest {

    @Test
    public void testCheckIrrigationNeed() {
        SensorDataDAO dao = new SensorDataDAO();
        IrrigationService service = new IrrigationService(dao);

        SensorData sensorData = new SensorData(1, 25.0, 28.0, 70.0);
        boolean result = service.checkIrrigationNeed(sensorData);

        assertEquals(true, result);
    }

    @Test
    public void testControlIrrigation() {
        SensorDataDAO dao = new SensorDataDAO();
        IrrigationService service = new IrrigationService(dao);

        SensorData sensorData = new SensorData(1, 35.0, 28.0, 70.0);
        String result = service.controlIrrigation(sensorData);

        assertEquals("Soil Moisture Sufficient.", result);
    }
}
