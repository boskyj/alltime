package com.bos.alltime.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class RegionTime {
    @JsonProperty
    private String zone;
    @JsonProperty
    private ZonedDateTime time;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public RegionTime(String zone,ZonedDateTime time) {
        this.zone = zone;
        this.time=time;
    }
}
