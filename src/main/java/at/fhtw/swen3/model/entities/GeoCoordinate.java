package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class GeoCoordinate {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Double lat = null;
    @Column
    private Double lon = null;
}