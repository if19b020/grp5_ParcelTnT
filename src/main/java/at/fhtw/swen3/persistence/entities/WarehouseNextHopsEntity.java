package at.fhtw.swen3.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "error")
public class WarehouseNextHopsEntity {
    private Integer traveltimeMins = null;
    @NotNull
    private HopEntity hop = null;
}
