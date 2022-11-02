package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.WarehouseNextHops;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseNextHopsMapper {
    WarehouseNextHopsMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsMapper.class);

    at.fhtw.swen3.persistence.entity.WarehouseNextHops dtoToEntity(WarehouseNextHops warehouseNextHopsDto);
    WarehouseNextHops entityToDto(at.fhtw.swen3.persistence.entity.WarehouseNextHops warehouseNextHops);
}
