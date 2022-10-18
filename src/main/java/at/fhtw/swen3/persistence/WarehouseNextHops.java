package at.fhtw.swen3.persistence;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WarehouseNextHops {
    private Integer traveltimeMins = null;
    @NotNull
    private Hop hop = null;
}
