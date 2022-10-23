package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String regionGeoJson = null;
    @Column
    private String numberPlate = null;
}