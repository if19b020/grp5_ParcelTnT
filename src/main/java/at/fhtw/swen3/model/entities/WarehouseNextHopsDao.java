package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;

@Getter
@Setter
//@Entity
public class WarehouseNextHopsDao {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private Integer traveltimeMins = null;

    //@OneToOne

    //@JoinColumn(name = "hop_hop_type")
    private HopDao hopDao = null;
}