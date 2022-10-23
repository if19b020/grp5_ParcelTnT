package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Hop {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String hopType = null;
    @Column
    private String code = null;
    @Column
    private String description = null;
    @Column
    private Integer processingDelayMins = null;
    @Column
    private String locationName = null;

    @OneToOne
    @JoinColumn(name = "location_coordinates_lat")
    private GeoCoordinate locationCoordinates = null;
}
