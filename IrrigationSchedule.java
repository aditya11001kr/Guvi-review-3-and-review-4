@Data
@AllArgsConstructor
@NoArgsConstructor
public class IrrigationSchedule {
    @NotNull
    private Long sensorId;

    @NotNull
    @Future
    private LocalDateTime startTime;

    @NotNull
    private Integer durationMinutes; // Duration of irrigation in minutes
}

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterFlowAdjustment {
    @NotNull
    private Long sensorId;

    @NotNull
    @Min(1)
    @Max(100)
    private Integer flowRate; // Percentage of water flow
}

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IrrigationStatus {
    private Long sensorId;
    private String status; // E.g., "Active", "Idle"
    private Integer moistureLevel; // E.g., percentage
}
