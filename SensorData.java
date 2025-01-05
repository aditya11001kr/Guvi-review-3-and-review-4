package com.smartirrigation.model;

public class SensorData {
    private int id;
    private double moistureLevel;
    private double temperature;
    private double humidity;

    public SensorData(int id, double moistureLevel, double temperature, double humidity) {
        this.id = id;
        this.moistureLevel = moistureLevel;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoistureLevel() {
        return moistureLevel;
    }

    public void setMoistureLevel(double moistureLevel) {
        this.moistureLevel = moistureLevel;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double t
