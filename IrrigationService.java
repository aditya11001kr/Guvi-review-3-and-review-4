@Service
public class IrrigationService {

    public void scheduleIrrigation(IrrigationSchedule schedule) {
        // Logic to schedule irrigation based on time and moisture level
    }

    public IrrigationStatus getIrrigationStatus(Long sensorId) {
        // Logic to fetch and return sensor status
        return new IrrigationStatus(sensorId, "Active", 45);
    }

    public void adjustWaterFlow(WaterFlowAdjustment adjustment) {
        // Logic to adjust water flow based on provided settings
    }
}
