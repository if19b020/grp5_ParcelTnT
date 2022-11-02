package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Entity
public class WarehouseEntity {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private Integer level = null;

    //private List<WarehouseNextHops> nextHops = new ArrayList<WarehouseNextHops>();

}