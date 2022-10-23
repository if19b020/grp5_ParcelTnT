package at.fhtw.swen3.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Warehouse {
    private Integer level = null;
    @NotNull
    private List<WarehouseNextHops> nextHops = new ArrayList<WarehouseNextHops>();

}
