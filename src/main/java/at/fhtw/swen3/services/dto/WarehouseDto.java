package at.fhtw.swen3.services.dto;

import at.fhtw.swen3.persistence.WarehouseNextHops;

import java.util.ArrayList;
import java.util.List;

public class WarehouseDto {
    private Integer level = null;
    private List<WarehouseNextHops> nextHops = new ArrayList<WarehouseNextHops>();

}
