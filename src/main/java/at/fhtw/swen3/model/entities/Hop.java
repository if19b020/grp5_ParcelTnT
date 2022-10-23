package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hop {
    private String hopType = null;
    private String code = null;
    private String description = null;
    private Integer processingDelayMins = null;
    private String locationName = null;
    private GeoCoordinate locationCoordinates = null;
}
