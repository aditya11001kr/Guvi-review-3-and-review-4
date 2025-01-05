@RestController
@RequestMapping("/api/irrigation")
public class IrrigationController {

    @Autowired
    private IrrigationService irrigationService;

    @PostMapping("/schedule")
    public ResponseEntity<String> scheduleIrrigation(@Valid @RequestBody IrrigationSchedule schedule) {
        irrigationService.scheduleIrrigation(schedule);
        return ResponseEntity.ok("Irrigation scheduled successfully.");
    }

    @GetMapping("/status/{sensorId}")
    public ResponseEntity<IrrigationStatus> getSensorStatus(@PathVariable Long sensorId) {
        return ResponseEntity.ok(irrigationService.getIrrigationStatus(sensorId));
    }

    @PutMapping("/adjust")
    public ResponseEntity<String> adjustWaterFlow(@Valid @RequestBody WaterFlowAdjustment adjustment) {
        irrigationService.adjustWaterFlow(adjustment);
        return ResponseEntity.ok("Water flow adjusted successfully.");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleExceptions(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + ex.getMessage());
    }
}
