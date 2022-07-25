package com.bos.alltime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/regiontime")
public class TimeController {

    @GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<RegionTime>> allTime() {
        return ResponseEntity.ok().body(ZoneId.getAvailableZoneIds().stream().sorted().map(p -> new RegionTime(p, ZonedDateTime.now(ZoneId.of(p)))).collect(Collectors.toList()));
    }
}
