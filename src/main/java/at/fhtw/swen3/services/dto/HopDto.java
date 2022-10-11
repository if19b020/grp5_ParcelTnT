package at.fhtw.swen3.services.dto;

import at.fhtw.swen3.persistence.GeoCoordinate;

public class HopDto {
    private String hopType = null;
    private String code = null;
    private String description = null;
    private Integer processingDelayMins = null;
    private String locationName = null;
    private GeoCoordinate locationCoordinates = null;
}
