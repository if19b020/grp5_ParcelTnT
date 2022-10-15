package at.fhtw.swen3.persistence;

import at.fhtw.swen3.services.dto.WarehouseNextHopsDto;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private Integer level = null;
    @NotNull
    private List<WarehouseNextHopsDto> nextHops = new ArrayList<WarehouseNextHopsDto>();

}
