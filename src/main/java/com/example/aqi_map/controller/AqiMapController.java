package com.example.aqi_map.controller;

import com.example.aqi_map.model.AqiMapData;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aqi")
public class AqiMapController {

    @GetMapping
    public List<AqiMapData> getAqiMapData() {
        return List.of(
                new AqiMapData("London", 51.51, -0.13, 70),
                new AqiMapData("Birmingham", 52.48, -1.89, 65),
                new AqiMapData("Manchester", 53.48, -2.24, 60),
                new AqiMapData("Glasgow", 55.86, -4.25, 55),
                new AqiMapData("Leeds", 53.80, -1.55, 58),
                new AqiMapData("Liverpool", 53.41, -2.98, 50),
                new AqiMapData("Newcastle", 54.97, -1.61, 52),
                new AqiMapData("Sheffield", 53.38, -1.47, 62),
                new AqiMapData("Bristol", 51.45, -2.59, 57),
                new AqiMapData("Edinburgh", 55.95, -3.19, 58),
                new AqiMapData("Cardiff", 51.48, -3.18, 59),
                new AqiMapData("Belfast", 54.60, -5.93, 54),
                new AqiMapData("Nottingham", 52.95, -1.15, 61),
                new AqiMapData("Leicester", 52.64, -1.13, 60),
                new AqiMapData("Coventry", 52.41, -1.51, 63),
                new AqiMapData("Hull", 53.74, -0.33, 56),
                new AqiMapData("Stoke-on-Trent", 53.00, -2.18, 55),
                new AqiMapData("Southampton", 50.91, -1.40, 53),
                new AqiMapData("Portsmouth", 50.80, -1.09, 52),
                new AqiMapData("Brighton", 50.83, -0.14, 60),
                new AqiMapData("Plymouth", 50.38, -4.14, 49),
                new AqiMapData("Aberdeen", 57.15, -2.09, 45),
                new AqiMapData("Swansea", 51.62, -3.95, 47),
                new AqiMapData("Derby", 52.92, -1.47, 59),
                new AqiMapData("Oxford", 51.75, -1.26, 51),
                new AqiMapData("Cambridge", 52.21, 0.12, 53),
                new AqiMapData("Reading", 51.45, -0.97, 50),
                new AqiMapData("Luton", 51.88, -0.42, 57),
                new AqiMapData("Milton Keynes", 52.04, -0.76, 58),
                new AqiMapData("York", 53.96, -1.08, 54),

// Additional cities
                new AqiMapData("Exeter", 50.72, -3.53, 48),
                new AqiMapData("Norwich", 52.63, 1.30, 51),
                new AqiMapData("Ipswich", 52.06, 1.15, 50),
                new AqiMapData("Sunderland", 54.91, -1.38, 52),
                new AqiMapData("Bradford", 53.79, -1.75, 55),
                new AqiMapData("Wolverhampton", 52.58, -2.13, 57),
                new AqiMapData("Coventry", 52.41, -1.51, 63),
                new AqiMapData("Southend-on-Sea", 51.54, 0.71, 49),
                new AqiMapData("Blackpool", 53.81, -3.05, 50),
                new AqiMapData("Carlisle", 54.89, -2.94, 46),
                new AqiMapData("Chelmsford", 51.73, 0.47, 52),
            new AqiMapData("Worcester", 52.19, -2.22, 50),
                new AqiMapData("Bath", 51.38, -2.36, 48),
                new AqiMapData("Winchester", 51.06, -1.32, 47)
        );

    }
}
