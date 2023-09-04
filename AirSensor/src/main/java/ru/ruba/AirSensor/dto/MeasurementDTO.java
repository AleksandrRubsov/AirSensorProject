package ru.ruba.AirSensor.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import ru.ruba.AirSensor.models.Sensor;

import java.time.LocalDateTime;

public class MeasurementDTO {

    @Column(name = "value")
    @NotNull
    @Size(min = -100, max = 100, message = "Диапазон должен быть от -100 до 100")
    private double value;

    @Column(name = "raining")
    @NotNull
    private boolean raining;

    @Column(name = "measurement_date_time")
    @NotNull
    private LocalDateTime measurement_date_time;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "sensor", referencedColumnName = "name")
    private Sensor sensor;

}
