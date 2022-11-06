package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class HopEntity {
    private String hopType = null;
    @Pattern(regexp = "^[A-Z0-9]{9}$")
    private String code = null;
    @Pattern(regexp = "^[A-Za-z]+[0-9-]+$")
    private String description = null;
    private Integer processingDelayMins = null;
    private String locationName = null;
    @NotNull
    private GeoCoordinateEntity locationCoordinates = null;
}
