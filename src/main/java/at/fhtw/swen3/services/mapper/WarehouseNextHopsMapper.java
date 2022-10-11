package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.WarehouseNextHops;
import at.fhtw.swen3.services.dto.WarehouseNextHopsDto;
import org.mapstruct.factory.Mappers;

public interface WarehouseNextHopsMapper {
    WarehouseNextHopsMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsMapper.class);

    WarehouseNextHopsDto entityToDto(WarehouseNextHops warehouseNextHops);
    WarehouseNextHops DtoToEntity(WarehouseNextHopsDto warehouseNextHops);
}
