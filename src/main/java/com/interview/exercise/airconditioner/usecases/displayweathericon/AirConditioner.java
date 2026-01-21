package com.interview.exercise.airconditioner.usecases.displayweathericon;

import com.interview.exercise.airconditioner.thermpolcompany.MercuryThermometerV1500100900;

public class AirConditioner {
    private static final int COLD_TEMPERATURE_THRESHOLD_IN_CELSIUS = 10;
    private static final int COOL_TEMPERATURE_THRESHOLD_IN_CELSIUS = 18;
    private static final int WARM_TEMPERATURE_THRESHOLD_IN_CELSIUS = 24;

    private final MercuryThermometerV1500100900 thermometer;

    public AirConditioner(MercuryThermometerV1500100900 thermometer) {
        this.thermometer = thermometer;
    }

    public void displayWeatherIcon() {
        if (isCold(thermometer.temperature())) {
            displaySnowflake();
        } else if (isCool(thermometer.temperature())) {
            displayCloud();
        } else if (isWarm(thermometer.temperature())) {
            displaySunBehindCloud();
        } else {
            displaySun();
        }
    }

    private boolean isCold(int temperature) {
        return temperature < COLD_TEMPERATURE_THRESHOLD_IN_CELSIUS;
    }

    private boolean isCool(int temperature) {
        return temperature >= COLD_TEMPERATURE_THRESHOLD_IN_CELSIUS && temperature < COOL_TEMPERATURE_THRESHOLD_IN_CELSIUS;
    }

    private boolean isWarm(int temperature) {
        return temperature >= COOL_TEMPERATURE_THRESHOLD_IN_CELSIUS && temperature < WARM_TEMPERATURE_THRESHOLD_IN_CELSIUS;
    }

    private void displaySnowflake() {
        //non-relevant code...
    }

    private void displayCloud() {
        //non-relevant code...
    }


    private void displaySunBehindCloud() {
        //non-relevant code...
    }

    private void displaySun() {
        //non-relevant code...
    }
}
