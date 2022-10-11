package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.Transferwarehouse;
import at.fhtw.swen3.persistence.Truck;
import at.fhtw.swen3.services.dto.TransferwarehouseDto;
import at.fhtw.swen3.services.dto.TruckDto;
import org.mapstruct.factory.Mappers;

public interface TruckMapper {
    TruckMapper INSTANCE = Mappers.getMapper(TruckMapper.class);

    TruckDto entityToDto(Truck truck);
    Truck DtoToEntity(TruckDto truck);
}
