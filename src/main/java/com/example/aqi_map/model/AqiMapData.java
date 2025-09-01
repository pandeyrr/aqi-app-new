package com.example.aqi_map.model;

public class AqiMapData {
    private final String city;
    private final double latitude;
    private final double longitude;
    private final int aqi;

    public AqiMapData(String city, double latitude, double longitude, int aqi) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.aqi = aqi;
    }

    public String getCity() {
        return city;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAqi() {
        return aqi;
    }
}
