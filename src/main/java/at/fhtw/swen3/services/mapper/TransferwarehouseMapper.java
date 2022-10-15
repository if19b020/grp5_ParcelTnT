package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.TransferwarehouseDto;
import at.fhtw.swen3.persistence.Transferwarehouse;
import org.mapstruct.factory.Mappers;

public interface TransferwarehouseMapper {
    TransferwarehouseMapper INSTANCE = Mappers.getMapper(TransferwarehouseMapper.class);

    Transferwarehouse entityToDto(TransferwarehouseDto transferwarehouse);
    TransferwarehouseDto DtoToEntity(Transferwarehouse transferwarehouse);
}
