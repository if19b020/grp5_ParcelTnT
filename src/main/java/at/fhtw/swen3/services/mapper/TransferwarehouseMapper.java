package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.TransferwarehouseDto;
import at.fhtw.swen3.persistence.Transferwarehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransferwarehouseMapper {
    TransferwarehouseMapper INSTANCE = Mappers.getMapper(TransferwarehouseMapper.class);

    Transferwarehouse dtoToEntity(TransferwarehouseDto transferwarehouseDto);
    TransferwarehouseDto entityToDto(Transferwarehouse transferwarehouse);
}
