package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Warehouse {
    private Integer level = null;
    private List<WarehouseNextHops> nextHops = new ArrayList<WarehouseNextHops>();

}