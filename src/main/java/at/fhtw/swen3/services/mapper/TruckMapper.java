package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.Transferwarehouse;
import at.fhtw.swen3.services.dto.TransferwarehouseDto;
import org.mapstruct.factory.Mappers;

public interface TruckMapper {
    TransferwarehouseMapper INSTANCE = Mappers.getMapper(TransferwarehouseMapper.class);

    TransferwarehouseDto entityToDto(Transferwarehouse transferwarehouse);
    Transferwarehouse DtoToEntity(TransferwarehouseDto Transferwarehouse);
}
