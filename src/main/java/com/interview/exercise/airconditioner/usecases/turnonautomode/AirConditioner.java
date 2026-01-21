package com.interview.exercise.airconditioner.usecases.turnonautomode;

import com.interview.exercise.airconditioner.thermpolcompany.MercuryThermometerV1500100900;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class AirConditioner {
    private final MercuryThermometerV1500100900 thermometer;

    public void turnOnAutoMode(int desiredTemperature) {
        thermometer.shakeDown();

        if (thermometer.temperature() < desiredTemperature) {
            heatUpTheAir();
        } else if (thermometer.temperature() > desiredTemperature) {
            coolDownTheAir();
        }
    }

    private void heatUpTheAir() {
        //non-relevant code...
    }

    private void coolDownTheAir() {
        //non-relevant code...
    }
}
