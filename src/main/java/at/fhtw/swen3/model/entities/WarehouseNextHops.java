package at.fhtw.swen3.model.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WarehouseNextHops {
    private Integer traveltimeMins = null;
    private Hop hop = null;
}