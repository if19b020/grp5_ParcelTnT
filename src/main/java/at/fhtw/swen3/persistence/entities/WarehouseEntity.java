package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "error")
public class WarehouseEntity {
    private Integer level = null;
    @NotNull
    private List<WarehouseNextHopsEntity> nextHops = new ArrayList<WarehouseNextHopsEntity>();

}
