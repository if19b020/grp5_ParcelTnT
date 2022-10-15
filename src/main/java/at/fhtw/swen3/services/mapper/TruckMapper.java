package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.TruckDto;
import at.fhtw.swen3.persistence.Truck;
import org.mapstruct.factory.Mappers;

public interface TruckMapper {
    TruckMapper INSTANCE = Mappers.getMapper(TruckMapper.class);

    Truck entityToDto(TruckDto truck);
    TruckDto DtoToEntity(Truck truck);
}
