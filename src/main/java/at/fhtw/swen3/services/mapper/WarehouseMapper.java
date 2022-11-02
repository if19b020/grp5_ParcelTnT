package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.Warehouse;
import at.fhtw.swen3.services.dto.WarehouseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseMapper {
    WarehouseMapper INSTANCE = Mappers.getMapper(WarehouseMapper.class);

    Warehouse dtoToEntity(WarehouseDto warehouseDto);
    WarehouseDto entityToDto(Warehouse warehouse);
}
