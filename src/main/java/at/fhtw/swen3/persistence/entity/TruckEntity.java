package at.fhtw.swen3.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckEntity {
    private String regionGeoJson = null;
    private String numberPlate = null;
}
