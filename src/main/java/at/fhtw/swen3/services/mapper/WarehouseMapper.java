package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.Warehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseMapper {
    WarehouseMapper INSTANCE = Mappers.getMapper(WarehouseMapper.class);

    at.fhtw.swen3.persistence.entity.Warehouse dtoToEntity(Warehouse warehouseDto);
    Warehouse entityToDto(at.fhtw.swen3.persistence.entity.Warehouse warehouse);
}
