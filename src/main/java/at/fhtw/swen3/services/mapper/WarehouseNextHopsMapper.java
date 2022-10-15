package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.WarehouseNextHopsDto;
import at.fhtw.swen3.persistence.WarehouseNextHops;
import org.mapstruct.factory.Mappers;

public interface WarehouseNextHopsMapper {
    WarehouseNextHopsMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsMapper.class);

    WarehouseNextHops entityToDto(WarehouseNextHopsDto warehouseNextHops);
    WarehouseNextHopsDto DtoToEntity(WarehouseNextHops warehouseNextHops);
}
