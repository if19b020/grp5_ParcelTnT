package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.Truck;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TruckMapper {
    TruckMapper INSTANCE = Mappers.getMapper(TruckMapper.class);

    at.fhtw.swen3.persistence.entity.Truck dtoToEntity(Truck truckDto);
    Truck entityToDto(at.fhtw.swen3.persistence.entity.Truck truck);
}
