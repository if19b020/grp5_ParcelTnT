package at.fhtw.swen3.persistence;

import at.fhtw.swen3.services.dto.GeoCoordinateDto;

public class Hop {
    private String hopType = null;
    private String code = null;
    private String description = null;
    private Integer processingDelayMins = null;
    private String locationName = null;
    private GeoCoordinateDto locationCoordinates = null;
}
