package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TruckEntity {
    private String regionGeoJson = null;
    private String numberPlate = null;
}
