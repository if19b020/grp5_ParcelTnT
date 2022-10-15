package at.fhtw.swen3.persistence;

import at.fhtw.swen3.services.dto.HopDto;

import javax.validation.constraints.NotNull;

public class WarehouseNextHops {
    private Integer traveltimeMins = null;
    @NotNull
    private HopDto hop = null;
}
