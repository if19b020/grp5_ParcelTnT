package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.persistence.entity.TransferwarehouseEntity;
import at.fhtw.swen3.services.dto.TransferwarehouseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransferwarehouseMapper {
    TransferwarehouseMapper INSTANCE = Mappers.getMapper(TransferwarehouseMapper.class);

    TransferwarehouseEntity dtoToEntity(TransferwarehouseDto transferwarehouseDto);
    TransferwarehouseDto entityToDto(TransferwarehouseEntity transferwarehouse);
}
