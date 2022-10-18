package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.TruckDto;
import at.fhtw.swen3.persistence.Truck;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TruckMapper {
    TruckMapper INSTANCE = Mappers.getMapper(TruckMapper.class);

    Truck dtoToEntity(TruckDto truckDto);
    TruckDto entityToDto(Truck truck);
}
