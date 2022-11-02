package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.Transferwarehouse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransferwarehouseMapper {
    TransferwarehouseMapper INSTANCE = Mappers.getMapper(TransferwarehouseMapper.class);

    at.fhtw.swen3.persistence.entity.Transferwarehouse dtoToEntity(Transferwarehouse transferwarehouseDto);
    Transferwarehouse entityToDto(at.fhtw.swen3.persistence.entity.Transferwarehouse transferwarehouse);
}
