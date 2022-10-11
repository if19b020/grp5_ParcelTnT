package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.services.dto.ErrorDto;
import org.mapstruct.factory.Mappers;

public interface ErrorMapper {
    ErrorMapper INSTANCE = Mappers.getMapper(ErrorMapper.class);

    ErrorDto entityToDto(Error error);
    Error DtoToEntity(ErrorDto error);
}
