package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.WarehouseNextHopsDto;
import at.fhtw.swen3.persistence.WarehouseNextHops;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseNextHopsMapper {
    WarehouseNextHopsMapper INSTANCE = Mappers.getMapper(WarehouseNextHopsMapper.class);

    WarehouseNextHops dtoToEntity(WarehouseNextHopsDto warehouseNextHopsDto);
    WarehouseNextHopsDto entityToDto(WarehouseNextHops warehouseNextHops);
}
