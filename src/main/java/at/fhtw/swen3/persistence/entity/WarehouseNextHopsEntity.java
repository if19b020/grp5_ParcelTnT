package at.fhtw.swen3.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WarehouseNextHopsEntity {
    private Integer traveltimeMins = null;
    @NotNull
    private HopEntity hop = null;
}
