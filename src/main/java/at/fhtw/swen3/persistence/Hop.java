package at.fhtw.swen3.persistence;

import at.fhtw.swen3.services.dto.GeoCoordinateDto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Hop {
    private String hopType = null;
    @Pattern(regexp = "^[A-Z0-9]{9}$")
    private String code = null;
    @Pattern(regexp = "^[A-Za-z]+[0-9-]+$")
    private String description = null;
    private Integer processingDelayMins = null;
    private String locationName = null;
    @NotNull
    private GeoCoordinateDto locationCoordinates = null;
}
